package com.catatanbelajar.belajarrr;

import java.util.ArrayList;
import java.util.List;

public class Note {
    private String id;
    private String title;
    private String description;
    private String category;
    private String date;
    private String time;
    private String status; // "Understood", "Needs Review", "New", "Draft"
    private String subject; // "Matematika", "Biologi", etc.
    private int iconResId; // Icon resource ID
    private List<String> attachments; // List of image file paths/URIs

    public Note() {
        attachments = new ArrayList<>();
    }

    public Note(String id, String title, String description, String category, 
                String date, String time, String status, String subject, int iconResId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.date = date;
        this.time = time;
        this.status = status;
        this.subject = subject;
        this.iconResId = iconResId;
        this.attachments = new ArrayList<>();
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public int getIconResId() { return iconResId; }
    public void setIconResId(int iconResId) { this.iconResId = iconResId; }

    public List<String> getAttachments() { return attachments; }
    public void setAttachments(List<String> attachments) { 
        this.attachments = attachments != null ? attachments : new ArrayList<>();
    }
}

