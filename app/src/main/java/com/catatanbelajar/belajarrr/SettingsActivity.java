package com.catatanbelajar.belajarrr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import com.google.android.material.card.MaterialCardView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Enable edge-to-edge
        EdgeToEdgeHelper.enableEdgeToEdge(this);
        
        setContentView(R.layout.activity_settings);
        
        // Apply window insets
        View rootView = findViewById(android.R.id.content);
        if (rootView != null) {
            EdgeToEdgeHelper.applyWindowInsets(rootView);
        }
        
        // Set light status bar
        EdgeToEdgeHelper.setLightStatusBar(this, true);
        
        // Initialize DataManager dengan context
        DataManager.getInstance().init(this);

        findViewById(R.id.backBtn).setOnClickListener(v -> finish());

        // Set up click listeners for settings items
        setupSettingsItems();
    }

    private void setupSettingsItems() {
        // Tentang Aplikasi
        View aboutAppCard = findViewById(R.id.aboutAppCard);
        if (aboutAppCard != null) {
            aboutAppCard.setOnClickListener(v -> showAboutAppDialog());
        }

        // Tentang Organisasi
        View aboutOrgCard = findViewById(R.id.aboutOrgCard);
        if (aboutOrgCard != null) {
            aboutOrgCard.setOnClickListener(v -> showAboutOrgDialog());
        }

        // Privacy Policy - buka website
        View privacyPolicyCard = findViewById(R.id.privacyPolicyCard);
        if (privacyPolicyCard != null) {
            privacyPolicyCard.setOnClickListener(v -> openWebsite("https://gasbangginc.blogspot.com/2026/01/privacy-policy-catatan-belajar.html?m=1"));
        }

        // Reset Data
        MaterialCardView resetDataCard = findViewById(R.id.resetDataCard);
        if (resetDataCard != null) {
            resetDataCard.setOnClickListener(v -> showResetConfirmation());
        }
    }

    private void openWebsite(String url) {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        } catch (Exception e) {
            // Jika browser tidak tersedia atau URL tidak valid
            new AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("Tidak dapat membuka website. Pastikan perangkat Anda terhubung ke internet.")
                    .setPositiveButton("OK", null)
                    .show();
        }
    }

    private void showAboutAppDialog() {
        String message = "Tentang Aplikasi\n\n" +
                "Catatan Belajar\n\n" +
                "Aplikasi offline untuk mencatat dan mengorganisir catatan belajar Anda.\n\n" +
                "Versi: 1.0.2\n\n" +
                "Aplikasi ini membantu siapa saja dalam mengorganisir dan mengelola " +
                "catatan pembelajaran dengan mudah dan efisien. Cocok untuk pelajar, " +
                "mahasiswa, atau siapapun yang ingin mencatat materi belajar mereka.";

        new AlertDialog.Builder(this)
                .setTitle("Tentang Aplikasi")
                .setMessage(message)
                .setPositiveButton("OK", null)
                .show();
    }

    private void showAboutOrgDialog() {
        String message = "Tentang Organisasi\n\n" +
                "Pulo Torang\n\n" +
                "Perusahaan yang fokus di bidang pendidikan, berkomitmen untuk memberikan " +
                "solusi pendidikan berkualitas dan membantu proses pembelajaran yang efektif.\n\n" +
                "Aplikasi ini dikembangkan untuk mendukung kegiatan belajar" +
                "dan membantu pengguna dalam mengorganisir catatan pembelajaran mereka.";

        new AlertDialog.Builder(this)
                .setTitle("Tentang Organisasi")
                .setMessage(message)
                .setPositiveButton("OK", null)
                .show();
    }

    private void showResetConfirmation() {
        new AlertDialog.Builder(this)
                .setTitle("Reset Semua Data")
                .setMessage("Apakah Anda yakin ingin menghapus semua data? Tindakan ini tidak dapat dibatalkan.")
                .setPositiveButton("Reset", (dialog, which) -> {
                    DataManager dataManager = DataManager.getInstance();
                    dataManager.clearAllNotes();
                    finish();
                })
                .setNegativeButton("Batal", null)
                .show();
    }
}

