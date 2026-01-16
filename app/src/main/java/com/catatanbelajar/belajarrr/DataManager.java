package com.catatanbelajar.belajarrr;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class DataManager {
    private static DataManager instance;
    private List<Note> notes;
    private int noteCounter = 1;
    private Context context;
    private static final String PREFS_NAME = "NotesPrefs";
    private static final String KEY_NOTES = "notes";
    private static final String KEY_COUNTER = "noteCounter";
    private Gson gson;

    private DataManager() {
        notes = new ArrayList<>();
        gson = new Gson();
    }
    
    public void init(Context context) {
        this.context = context;
        loadNotesFromPrefs();
    }

    public static DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }

    public List<Note> getAllNotes() {
        return new ArrayList<>(notes); // Return copy to prevent external modification
    }

    public void addNote(Note note) {
        if (note == null) {
            return;
        }
        if (note.getId() == null || note.getId().isEmpty()) {
            note.setId("note_" + noteCounter++);
        }
        notes.add(0, note); // Add to beginning of list (newest first)
        saveNotesToPrefs();
    }

    public void updateNote(Note updatedNote) {
        if (updatedNote == null || updatedNote.getId() == null) {
            return;
        }
        for (int i = 0; i < notes.size(); i++) {
            Note note = notes.get(i);
            if (note != null && note.getId() != null && note.getId().equals(updatedNote.getId())) {
                notes.set(i, updatedNote);
                break;
            }
        }
        saveNotesToPrefs();
    }

    public void deleteNote(String noteId) {
        if (noteId == null) {
            return;
        }
        notes.removeIf(note -> note != null && note.getId() != null && note.getId().equals(noteId));
        saveNotesToPrefs();
    }
    
    public void clearAllNotes() {
        notes.clear();
        noteCounter = 1;
        saveNotesToPrefs();
    }

    public Note getNoteById(String noteId) {
        if (noteId == null) {
            return null;
        }
        for (Note note : notes) {
            if (note != null && note.getId() != null && note.getId().equals(noteId)) {
                return note;
            }
        }
        return null;
    }

    public static String getCurrentTime() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        return timeFormat.format(new Date());
    }

    public static int getIconResIdForSubject(String subject) {
        // Default icon - bisa diganti dengan icon yang sesuai
        return R.drawable.ic_menu_book_24;
    }
    
    private void saveNotesToPrefs() {
        if (context == null) return;
        
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        
        // Convert notes list to JSON
        String notesJson = gson.toJson(notes);
        editor.putString(KEY_NOTES, notesJson);
        editor.putInt(KEY_COUNTER, noteCounter);
        editor.apply();
    }
    
    private void loadNotesFromPrefs() {
        if (context == null) return;
        
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        String notesJson = prefs.getString(KEY_NOTES, null);
        noteCounter = prefs.getInt(KEY_COUNTER, 1);
        
        if (notesJson != null && !notesJson.isEmpty()) {
            Type type = new TypeToken<List<Note>>(){}.getType();
            List<Note> loadedNotes = gson.fromJson(notesJson, type);
            if (loadedNotes != null) {
                notes = loadedNotes;
            } else {
                notes = new ArrayList<>();
            }
        } else {
            notes = new ArrayList<>();
        }
    }
}
