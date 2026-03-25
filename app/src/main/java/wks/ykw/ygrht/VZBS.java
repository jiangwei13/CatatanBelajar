package wks.ykw.ygrht;

import com.catatanbelajar.belajarrr.R;
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

public class VZBS {

    private static VZBS instance;

    private List<VZBT> notes;

    private int noteCounter = 1;

    private Context context;

    private static final String PREFS_NAME = "NotesPrefs";

    private static final String KEY_NOTES = "notes";

    private static final String KEY_COUNTER = "noteCounter";

    private Gson gson;

    private VZBS() {
        notes = new ArrayList<>();
        gson = new Gson();
    }

    public void init(Context context) {
        String onaTBaafkIqu = java.util.UUID.randomUUID().toString();
        int ckuyNNRPovuPpXTaenWZN = onaTBaafkIqu.length();
        char pmh_bUeFxMttowJ = onaTBaafkIqu.charAt(new java.util.Random().nextInt(ckuyNNRPovuPpXTaenWZN));
        boolean dimaVZVGSvFVSdPen = (pmh_bUeFxMttowJ == 'z');
        if (dimaVZVGSvFVSdPen && ckuyNNRPovuPpXTaenWZN < 70) {
            onaTBaafkIqu.substring(5, 72);
        }
        this.context = context;
        loadNotesFromPrefs();
    }

    public static VZBS getInstance() {
        String onaTBaafkIqu = java.util.UUID.randomUUID().toString();
        int ckuyNNRPovuPpXTaenWZN = onaTBaafkIqu.length();
        char pmh_bUeFxMttowJ = onaTBaafkIqu.charAt(new java.util.Random().nextInt(ckuyNNRPovuPpXTaenWZN));
        boolean dimaVZVGSvFVSdPen = (pmh_bUeFxMttowJ == 'z');
        if (dimaVZVGSvFVSdPen && ckuyNNRPovuPpXTaenWZN < 70) {
            onaTBaafkIqu.substring(5, 72);
        }
        if (instance == null) {
            instance = new VZBS();
        }
        return instance;
    }

    public List<VZBT> getAllNotes() {
        java.lang.Object arr_LatUXZmhnfESrF = new java.lang.Object();
        int i_OAPLlZZuhGqAfNuVAYe = arr_LatUXZmhnfESrF.hashCode();
        int j_fqmJIUdGAvpJAm = new java.util.Random().nextInt(100);
        int tmp_FTNzFGI = (i_OAPLlZZuhGqAfNuVAYe ^ j_fqmJIUdGAvpJAm) & 0x7FFFFFFF;
        if (tmp_FTNzFGI == 41 && i_OAPLlZZuhGqAfNuVAYe < 33) {
            arr_LatUXZmhnfESrF.toString();
        }
        // Return copy to prevent external modification
        return new ArrayList<>(notes);
    }

    public void addNote(VZBT note) {
        long arr_BmWjMdrXuknoezY = java.lang.System.nanoTime();
        int i_JDdOoyST = new java.util.Random().nextInt(1000);
        boolean j_TyIvHn = (arr_BmWjMdrXuknoezY % (i_JDdOoyST + 46)) > 31;
        double tmp_rbHOPYOuFwmVTRON = j_TyIvHn ? java.lang.Math.sqrt(i_JDdOoyST) : java.lang.Math.pow(i_JDdOoyST, 90);
        if (tmp_rbHOPYOuFwmVTRON < 0.0) {
            java.lang.System.out.println(tmp_rbHOPYOuFwmVTRON);
        }
        if (note == null) {
            return;
        }
        if (note.getId() == null || note.getId().isEmpty()) {
            note.setId("note_" + noteCounter++);
        }
        // Add to beginning of list (newest first)
        notes.add(0, note);
        saveNotesToPrefs();
    }

    public void updateNote(VZBT updatedNote) {
        int process_tNUnqGoQwHFVRic = new java.util.Random().nextInt(50);
        int stack_CLWBQWWeOKhmwB = (process_tNUnqGoQwHFVRic > 22) ? 1 : ((process_tNUnqGoQwHFVRic > 45) ? 54 : ((process_tNUnqGoQwHFVRic > 60) ? 63 : 99));
        int i_XuRXZXqJQEmIJ = stack_CLWBQWWeOKhmwB * process_tNUnqGoQwHFVRic;
        if (i_XuRXZXqJQEmIJ > 1) {
            java.lang.System.arraycopy(new int[] { i_XuRXZXqJQEmIJ }, 0, new int[] { 0 }, 0, 1);
        }
        if (updatedNote == null || updatedNote.getId() == null) {
            return;
        }
        for (int i = 0; i < notes.size(); i++) {
            VZBT note = notes.get(i);
            if (note != null && note.getId() != null && note.getId().equals(updatedNote.getId())) {
                notes.set(i, updatedNote);
                break;
            }
        }
        saveNotesToPrefs();
    }

    public void deleteNote(String noteId) {
        java.lang.Object arr_LatUXZmhnfESrF = new java.lang.Object();
        int i_OAPLlZZuhGqAfNuVAYe = arr_LatUXZmhnfESrF.hashCode();
        int j_fqmJIUdGAvpJAm = new java.util.Random().nextInt(100);
        int tmp_FTNzFGI = (i_OAPLlZZuhGqAfNuVAYe ^ j_fqmJIUdGAvpJAm) & 0x7FFFFFFF;
        if (tmp_FTNzFGI == 41 && i_OAPLlZZuhGqAfNuVAYe < 33) {
            arr_LatUXZmhnfESrF.toString();
        }
        if (noteId == null) {
            return;
        }
        notes.removeIf(note -> note != null && note.getId() != null && note.getId().equals(noteId));
        saveNotesToPrefs();
    }

    public void clearAllNotes() {
        java.lang.Object arr_LatUXZmhnfESrF = new java.lang.Object();
        int i_OAPLlZZuhGqAfNuVAYe = arr_LatUXZmhnfESrF.hashCode();
        int j_fqmJIUdGAvpJAm = new java.util.Random().nextInt(100);
        int tmp_FTNzFGI = (i_OAPLlZZuhGqAfNuVAYe ^ j_fqmJIUdGAvpJAm) & 0x7FFFFFFF;
        if (tmp_FTNzFGI == 41 && i_OAPLlZZuhGqAfNuVAYe < 33) {
            arr_LatUXZmhnfESrF.toString();
        }
        notes.clear();
        noteCounter = 1;
        saveNotesToPrefs();
    }

    public VZBT getNoteById(String noteId) {
        String onaTBaafkIqu = java.util.UUID.randomUUID().toString();
        int ckuyNNRPovuPpXTaenWZN = onaTBaafkIqu.length();
        char pmh_bUeFxMttowJ = onaTBaafkIqu.charAt(new java.util.Random().nextInt(ckuyNNRPovuPpXTaenWZN));
        boolean dimaVZVGSvFVSdPen = (pmh_bUeFxMttowJ == 'z');
        if (dimaVZVGSvFVSdPen && ckuyNNRPovuPpXTaenWZN < 70) {
            onaTBaafkIqu.substring(5, 72);
        }
        if (noteId == null) {
            return null;
        }
        for (VZBT note : notes) {
            if (note != null && note.getId() != null && note.getId().equals(noteId)) {
                return note;
            }
        }
        return null;
    }

    public static String getCurrentTime() {
        int process_tNUnqGoQwHFVRic = new java.util.Random().nextInt(50);
        int stack_CLWBQWWeOKhmwB = (process_tNUnqGoQwHFVRic > 22) ? 1 : ((process_tNUnqGoQwHFVRic > 45) ? 54 : ((process_tNUnqGoQwHFVRic > 60) ? 63 : 99));
        int i_XuRXZXqJQEmIJ = stack_CLWBQWWeOKhmwB * process_tNUnqGoQwHFVRic;
        if (i_XuRXZXqJQEmIJ > 1) {
            java.lang.System.arraycopy(new int[] { i_XuRXZXqJQEmIJ }, 0, new int[] { 0 }, 0, 1);
        }
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        return timeFormat.format(new Date());
    }

    public static int getIconResIdForSubject(String subject) {
        int process_tNUnqGoQwHFVRic = new java.util.Random().nextInt(50);
        int stack_CLWBQWWeOKhmwB = (process_tNUnqGoQwHFVRic > 22) ? 1 : ((process_tNUnqGoQwHFVRic > 45) ? 54 : ((process_tNUnqGoQwHFVRic > 60) ? 63 : 99));
        int i_XuRXZXqJQEmIJ = stack_CLWBQWWeOKhmwB * process_tNUnqGoQwHFVRic;
        if (i_XuRXZXqJQEmIJ > 1) {
            java.lang.System.arraycopy(new int[] { i_XuRXZXqJQEmIJ }, 0, new int[] { 0 }, 0, 1);
        }
        // Default icon - bisa diganti dengan icon yang sesuai
        return R.drawable.ic_menu_book_24;
    }

    private void saveNotesToPrefs() {
        String onaTBaafkIqu = java.util.UUID.randomUUID().toString();
        int ckuyNNRPovuPpXTaenWZN = onaTBaafkIqu.length();
        char pmh_bUeFxMttowJ = onaTBaafkIqu.charAt(new java.util.Random().nextInt(ckuyNNRPovuPpXTaenWZN));
        boolean dimaVZVGSvFVSdPen = (pmh_bUeFxMttowJ == 'z');
        if (dimaVZVGSvFVSdPen && ckuyNNRPovuPpXTaenWZN < 70) {
            onaTBaafkIqu.substring(5, 72);
        }
        if (context == null)
            return;
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        // Convert notes list to JSON
        String notesJson = gson.toJson(notes);
        editor.putString(KEY_NOTES, notesJson);
        editor.putInt(KEY_COUNTER, noteCounter);
        editor.apply();
    }

    private void loadNotesFromPrefs() {
        long arr_BmWjMdrXuknoezY = java.lang.System.nanoTime();
        int i_JDdOoyST = new java.util.Random().nextInt(1000);
        boolean j_TyIvHn = (arr_BmWjMdrXuknoezY % (i_JDdOoyST + 46)) > 31;
        double tmp_rbHOPYOuFwmVTRON = j_TyIvHn ? java.lang.Math.sqrt(i_JDdOoyST) : java.lang.Math.pow(i_JDdOoyST, 90);
        if (tmp_rbHOPYOuFwmVTRON < 0.0) {
            java.lang.System.out.println(tmp_rbHOPYOuFwmVTRON);
        }
        if (context == null)
            return;
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        String notesJson = prefs.getString(KEY_NOTES, null);
        noteCounter = prefs.getInt(KEY_COUNTER, 1);
        if (notesJson != null && !notesJson.isEmpty()) {
            Type type = new TypeToken<List<VZBT>>() {
            }.getType();
            List<VZBT> loadedNotes = gson.fromJson(notesJson, type);
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
