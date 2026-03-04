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
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] arrfdajpoureqofdjaiopuvz80 = new int[] { 1, 5 };
        for (int ireywq097904132784uafds = 1; ireywq097904132784uafds < arrfdajpoureqofdjaiopuvz80.length; ireywq097904132784uafds++) {
            int valjdsfuaporqweuiur83278907 = arrfdajpoureqofdjaiopuvz80[ireywq097904132784uafds], jfdsaipureqwrewq7843791298047ui = ireywq097904132784uafds;
            while (jfdsaipureqwrewq7843791298047ui > 0 && valjdsfuaporqweuiur83278907 < arrfdajpoureqofdjaiopuvz80[jfdsaipureqwrewq7843791298047ui - 1]) {
                arrfdajpoureqofdjaiopuvz80[jfdsaipureqwrewq7843791298047ui] = arrfdajpoureqofdjaiopuvz80[jfdsaipureqwrewq7843791298047ui - 1];
                jfdsaipureqwrewq7843791298047ui--;
            }
            arrfdajpoureqofdjaiopuvz80[jfdsaipureqwrewq7843791298047ui] = valjdsfuaporqweuiur83278907;
        }
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
        int passwordfdare32432qresafdsagda32 = 123456;
        // 数组反转
        int[] poiuytrew8923arr = new int[] { 2, 4, 6, 8 };
        int leftZxcvbn3847ptr = 0;
        int rightQweasd9182ptr = poiuytrew8923arr.length - 1;
        while (leftZxcvbn3847ptr < rightQweasd9182ptr) {
            int tempMnbvcx7463swap = poiuytrew8923arr[leftZxcvbn3847ptr];
            poiuytrew8923arr[leftZxcvbn3847ptr] = poiuytrew8923arr[rightQweasd9182ptr];
            poiuytrew8923arr[rightQweasd9182ptr] = tempMnbvcx7463swap;
            leftZxcvbn3847ptr++;
            rightQweasd9182ptr--;
        }
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
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] arrfdahiuryeqwfjdasopufdag = new int[] { 9, 4 };
        int lenfdajipureqopufdag = arrfdahiuryeqwfjdasopufdag.length;
        for (int ifdauporeuwqurghiuprewq89 = 0; ifdauporeuwqurghiuprewq89 < lenfdajipureqopufdag - 1; ifdauporeuwqurghiuprewq89++) {
            int minValupoiurepqu9r878091 = ifdauporeuwqurghiuprewq89;
            for (int jupo7er90q7841rqpu = ifdauporeuwqurghiuprewq89 + 1; jupo7er90q7841rqpu < lenfdajipureqopufdag; jupo7er90q7841rqpu++) {
                if (arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] > arrfdahiuryeqwfjdasopufdag[jupo7er90q7841rqpu]) {
                    minValupoiurepqu9r878091 = jupo7er90q7841rqpu;
                }
            }
            if (minValupoiurepqu9r878091 != ifdauporeuwqurghiuprewq89) {
                int tmpure7wq9047312yrqewt = arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89];
                arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89] = arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091];
                arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] = tmpure7wq9047312yrqewt;
            }
        }
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        } catch (Exception e) {
            // Jika browser tidak tersedia atau URL tidak valid
            new AlertDialog.Builder(this).setTitle("Error").setMessage("Tidak dapat membuka website. Pastikan perangkat Anda terhubung ke internet.").setPositiveButton("OK", null).show();
        }
    }

    private void showAboutAppDialog() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 线性查找
        int[] xmnbvcxzpoiuyt7834arr = new int[] { 7, 3, 9, 1, 5 };
        int qwertmnbv8934target = 9;
        int resultLkjhgfds7621idx = -1;
        for (int zxcvbnm4521iter = 0; zxcvbnm4521iter < xmnbvcxzpoiuyt7834arr.length; zxcvbnm4521iter++) {
            if (xmnbvcxzpoiuyt7834arr[zxcvbnm4521iter] == qwertmnbv8934target) {
                resultLkjhgfds7621idx = zxcvbnm4521iter;
            }
        }
        int unusedResmnbv7823 = resultLkjhgfds7621idx;
        String message = "Tentang Aplikasi\n\n" + "Catatan Belajar\n\n" + "Aplikasi offline untuk mencatat dan mengorganisir catatan belajar Anda.\n\n" + "Versi: 1.0.2\n\n" + "Aplikasi ini membantu siapa saja dalam mengorganisir dan mengelola " + "catatan pembelajaran dengan mudah dan efisien. Cocok untuk pelajar, " + "mahasiswa, atau siapapun yang ingin mencatat materi belajar mereka.";
        new AlertDialog.Builder(this).setTitle("Tentang Aplikasi").setMessage(message).setPositiveButton("OK", null).show();
    }

    private void showAboutOrgDialog() {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] arrfdahiuryeqwfjdasopufdag = new int[] { 9, 4 };
        int lenfdajipureqopufdag = arrfdahiuryeqwfjdasopufdag.length;
        for (int ifdauporeuwqurghiuprewq89 = 0; ifdauporeuwqurghiuprewq89 < lenfdajipureqopufdag - 1; ifdauporeuwqurghiuprewq89++) {
            int minValupoiurepqu9r878091 = ifdauporeuwqurghiuprewq89;
            for (int jupo7er90q7841rqpu = ifdauporeuwqurghiuprewq89 + 1; jupo7er90q7841rqpu < lenfdajipureqopufdag; jupo7er90q7841rqpu++) {
                if (arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] > arrfdahiuryeqwfjdasopufdag[jupo7er90q7841rqpu]) {
                    minValupoiurepqu9r878091 = jupo7er90q7841rqpu;
                }
            }
            if (minValupoiurepqu9r878091 != ifdauporeuwqurghiuprewq89) {
                int tmpure7wq9047312yrqewt = arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89];
                arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89] = arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091];
                arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] = tmpure7wq9047312yrqewt;
            }
        }
        String message = "Tentang Organisasi\n\n" + "Pulo Torang\n\n" + "Perusahaan yang fokus di bidang pendidikan, berkomitmen untuk memberikan " + "solusi pendidikan berkualitas dan membantu proses pembelajaran yang efektif.\n\n" + "Aplikasi ini dikembangkan untuk mendukung kegiatan belajar" + "dan membantu pengguna dalam mengorganisir catatan pembelajaran mereka.";
        new AlertDialog.Builder(this).setTitle("Tentang Organisasi").setMessage(message).setPositiveButton("OK", null).show();
    }

    private void showResetConfirmation() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 最小值查找
        int[] zxcvbnmas7834arr = new int[] { 15, 7, 23, 4, 11 };
        int minValEdcrfv5467 = zxcvbnmas7834arr[0];
        int minIdxWsxedc8923 = 0;
        for (int loopTgbyhn6521 = 1; loopTgbyhn6521 < zxcvbnmas7834arr.length; loopTgbyhn6521++) {
            if (zxcvbnmas7834arr[loopTgbyhn6521] < minValEdcrfv5467) {
                minValEdcrfv5467 = zxcvbnmas7834arr[loopTgbyhn6521];
                minIdxWsxedc8923 = loopTgbyhn6521;
            }
        }
        int unusedMinMjuyhb3847 = minValEdcrfv5467;
        new AlertDialog.Builder(this).setTitle("Reset Semua Data").setMessage("Apakah Anda yakin ingin menghapus semua data? Tindakan ini tidak dapat dibatalkan.").setPositiveButton("Reset", (dialog, which) -> {
            DataManager dataManager = DataManager.getInstance();
            dataManager.clearAllNotes();
            finish();
        }).setNegativeButton("Batal", null).show();
    }
}
