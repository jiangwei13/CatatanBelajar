package com.catatanbelajar.belajarrr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;

import java.io.File;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    private TextView titleText;
    private TextView contentText;
    private TextView dateText;
    private TextView durationText;
    private TextView categoryText;
    private TextView lastModifiedText;
    private Chip statusChip;
    private MaterialButton editBtn;
    private MaterialButton shareBtn;
    private MaterialButton deleteBtn;
    private GridLayout attachmentsGrid;

    private String noteId;
    private Note currentNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Enable edge-to-edge
        EdgeToEdgeHelper.enableEdgeToEdge(this);
        
        setContentView(R.layout.activity_detail);
        
        // Apply window insets
        View rootView = findViewById(android.R.id.content);
        if (rootView != null) {
            EdgeToEdgeHelper.applyWindowInsets(rootView);
        }
        
        // Set light status bar
        EdgeToEdgeHelper.setLightStatusBar(this, true);
        
        // Initialize DataManager dengan context
        DataManager.getInstance().init(this);

        noteId = getIntent().getStringExtra("note_id");
        if (noteId == null) {
            finish();
            return;
        }

        initializeViews();
        setupListeners();
        loadNoteData();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Reload data when returning to detail (in case note was edited)
        loadNoteData();
    }

    private void initializeViews() {
        titleText = findViewById(R.id.titleText);
        contentText = findViewById(R.id.contentText);
        dateText = findViewById(R.id.dateText);
        durationText = findViewById(R.id.durationText);
        categoryText = findViewById(R.id.categoryText);
        lastModifiedText = findViewById(R.id.lastModifiedText);
        statusChip = findViewById(R.id.statusChip);
        editBtn = findViewById(R.id.editBtn);
        shareBtn = findViewById(R.id.shareBtn);
        deleteBtn = findViewById(R.id.deleteBtn);
        attachmentsGrid = findViewById(R.id.attachmentsGrid);

        findViewById(R.id.backBtn).setOnClickListener(v -> finish());
    }

    private void setupListeners() {
        if (editBtn != null) {
            editBtn.setOnClickListener(v -> {
                Intent intent = new Intent(DetailActivity.this, EditActivity.class);
                intent.putExtra("note_id", noteId);
                intent.putExtra("is_new", false);
                startActivity(intent);
            });
        }

        if (shareBtn != null) {
            shareBtn.setOnClickListener(v -> shareNote());
        }

        if (deleteBtn != null) {
            deleteBtn.setOnClickListener(v -> showDeleteConfirmation());
        }
    }

    private void loadNoteData() {
        DataManager dataManager = DataManager.getInstance();
        Note note = dataManager.getNoteById(noteId);
        
        if (note == null) {
            finish();
            return;
        }
        
        // Load title
        if (note.getTitle() != null) {
            titleText.setText(note.getTitle());
        }
        
        // Load content
        if (note.getDescription() != null) {
            contentText.setText(note.getDescription());
        }
        
        // Load date
        if (note.getDate() != null) {
            dateText.setText(note.getDate());
        }
        
        // Load duration/time
        if (note.getTime() != null) {
            durationText.setText(note.getTime());
        }
        
        // Load category - display category value or convert from status
        String categoryDisplay = note.getCategory();
        if (categoryDisplay == null || categoryDisplay.isEmpty()) {
            // Convert status internal ke kategori display (bahasa Indonesia)
            String status = note.getStatus();
            if (status != null) {
                if (status.equals("Understood")) {
                    categoryDisplay = "Sudah Paham";
                } else if (status.equals("Needs Review")) {
                    categoryDisplay = "Butuh Review";
                } else {
                    categoryDisplay = "Belum Paham";
                }
            } else {
                categoryDisplay = "Belum Paham";
            }
        }
        categoryText.setText(categoryDisplay);
        
        // Load status chip - display category instead of internal status
        String statusDisplay = categoryDisplay;
        statusChip.setText(statusDisplay);
        
        // Set chip color based on category
        int bgColorRes = R.color.status_green;
        if (statusDisplay.equals("Sudah Paham")) {
            bgColorRes = R.color.status_green;
        } else if (statusDisplay.equals("Butuh Review")) {
            bgColorRes = R.color.status_orange;
        } else if (statusDisplay.equals("Belum Paham")) {
            bgColorRes = R.color.status_blue;
        }
        statusChip.setChipBackgroundColorResource(bgColorRes);
        
        // Last modified - use date for now
        if (note.getDate() != null) {
            lastModifiedText.setText("Terakhir diubah: " + note.getDate());
        }
        
        // Load attachments
        loadAttachments(note.getAttachments());
        
        // Save note reference for sharing
        currentNote = note;
    }
    
    private void loadAttachments(List<String> attachments) {
        if (attachmentsGrid == null) {
            return;
        }
        // Clear existing attachments
        attachmentsGrid.removeAllViews();
        
        if (attachments != null && !attachments.isEmpty()) {
            for (String imagePath : attachments) {
                addAttachmentToGrid(imagePath);
            }
        }
    }
    
    private void addAttachmentToGrid(String imagePath) {
        if (imagePath == null || imagePath.isEmpty() || attachmentsGrid == null) {
            return;
        }
        
        MaterialCardView cardView = new MaterialCardView(this);
        GridLayout.Spec rowSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);
        GridLayout.Spec colSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);
        GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
        if (getResources() == null) {
            return; // Activity might be destroyed
        }
        float density = getResources().getDisplayMetrics().density;
        params.width = 0;
        params.height = (int) (120 * density);
        params.setMargins(0, 0, (int) (8 * density), (int) (8 * density));
        
        cardView.setLayoutParams(params);
        cardView.setRadius(12);
        cardView.setCardElevation(1);
        cardView.setOnClickListener(v -> {
            // Open image in full screen (optional)
            // For now, just show a toast
        });
        
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(
            android.widget.LinearLayout.LayoutParams.MATCH_PARENT,
            android.widget.LinearLayout.LayoutParams.MATCH_PARENT));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        
        File imageFile = new File(imagePath);
        if (imageFile.exists() && imageFile.canRead()) {
            try {
                imageView.setImageURI(Uri.fromFile(imageFile));
            } catch (Exception e) {
                // If image cannot be loaded, skip this attachment
                return;
            }
        } else {
            // If file doesn't exist, skip this attachment
            return;
        }
        
        cardView.addView(imageView);
        attachmentsGrid.addView(cardView);
    }

    private void shareNote() {
        if (currentNote == null) {
            return;
        }
        
        // Format konten catatan untuk di-share
        StringBuilder shareText = new StringBuilder();
        shareText.append("📚 Catatan Belajar\n\n");
        
        // Title
        if (currentNote.getTitle() != null && !currentNote.getTitle().isEmpty()) {
            shareText.append("Judul: ").append(currentNote.getTitle()).append("\n");
        }
        
        // Tema Belajar
        if (currentNote.getSubject() != null && !currentNote.getSubject().isEmpty()) {
            shareText.append("Tema Belajar: ").append(currentNote.getSubject()).append("\n");
        }
        
        // Date
        if (currentNote.getDate() != null && !currentNote.getDate().isEmpty()) {
            shareText.append("Tanggal: ").append(currentNote.getDate()).append("\n");
        }
        
        // Duration
        if (currentNote.getTime() != null && !currentNote.getTime().isEmpty()) {
            shareText.append("Durasi: ").append(currentNote.getTime()).append("\n");
        }
        
        // Category/Status
        String categoryDisplay = currentNote.getCategory();
        if (categoryDisplay == null || categoryDisplay.isEmpty()) {
            String status = currentNote.getStatus();
            if (status != null) {
                if (status.equals("Understood")) {
                    categoryDisplay = "Sudah Paham";
                } else if (status.equals("Needs Review")) {
                    categoryDisplay = "Butuh Review";
                } else {
                    categoryDisplay = "Belum Paham";
                }
            } else {
                categoryDisplay = "Belum Paham";
            }
        }
        shareText.append("Status: ").append(categoryDisplay).append("\n\n");
        
        // Content
        if (currentNote.getDescription() != null && !currentNote.getDescription().isEmpty()) {
            shareText.append("Catatan Pemahaman:\n");
            shareText.append(currentNote.getDescription()).append("\n\n");
        }
        
        // Footer
        shareText.append("---\n");
        shareText.append("Dibuat dengan aplikasi Catatan Belajar");
        
        // Create share intent
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareText.toString());
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, currentNote.getTitle() != null ? 
            currentNote.getTitle() : "Catatan Belajar");
        
        try {
            startActivity(Intent.createChooser(shareIntent, "Bagikan Catatan"));
        } catch (Exception e) {
            // If no app can handle share, show error
            new AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("Tidak ada aplikasi yang dapat membagikan catatan ini.")
                    .setPositiveButton("OK", null)
                    .show();
        }
    }

    private void showDeleteConfirmation() {
        new AlertDialog.Builder(this)
                .setTitle("Hapus Catatan")
                .setMessage("Apakah Anda yakin ingin menghapus catatan ini?")
                .setPositiveButton("Hapus", (dialog, which) -> {
                    DataManager dataManager = DataManager.getInstance();
                    dataManager.deleteNote(noteId);
                    finish();
                })
                .setNegativeButton("Batal", null)
                .show();
    }
}

