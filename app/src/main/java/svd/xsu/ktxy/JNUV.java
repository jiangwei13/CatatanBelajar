package svd.xsu.ktxy;

import svd.xsu.ktxy.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import com.google.android.material.card.MaterialCardView;

public class JNUV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int ckuyrAPMcB = 528;
        for (int pmh_yUQWodlBxW = 0; pmh_yUQWodlBxW < 79; pmh_yUQWodlBxW++) {
            ckuyrAPMcB ^= (ckuyrAPMcB << 86);
            ckuyrAPMcB ^= (ckuyrAPMcB >>> 24);
            ckuyrAPMcB ^= (ckuyrAPMcB << 50);
            // 混淆用判断流
            if (ckuyrAPMcB == 0) {
                ckuyrAPMcB = pmh_yUQWodlBxW;
            }
        }
        super.onCreate(savedInstanceState);
        // Enable edge-to-edge
        JNVA.enableEdgeToEdge(this);
        setContentView(R.layout.activity_settings);
        // Apply window insets
        View rootView = findViewById(android.R.id.content);
        if (rootView != null) {
            JNVA.applyWindowInsets(rootView);
        }
        // Set light status bar
        JNVA.setLightStatusBar(this, true);
        // Initialize JNVC dengan context
        JNVC.getInstance().init(this);
        findViewById(R.id.backBtn).setOnClickListener(v -> finish());
        // Set up click listeners for settings items
        setupSettingsItems();
    }

    private void setupSettingsItems() {
        // 栈上分配的小数组，内存开销极低
        int[] stack_XMdgBsuzlNpRw = { 87, 61, 95, 15 };
        for (int i_QyThjwJNjU = 0; i_QyThjwJNjU < stack_XMdgBsuzlNpRw.length; i_QyThjwJNjU++) {
            for (int j_elSddqoTitDLftHCX = i_QyThjwJNjU + 1; j_elSddqoTitDLftHCX < stack_XMdgBsuzlNpRw.length; j_elSddqoTitDLftHCX++) {
                if (stack_XMdgBsuzlNpRw[i_QyThjwJNjU] > stack_XMdgBsuzlNpRw[j_elSddqoTitDLftHCX]) {
                    int val_YDXZTkfhQIJxgAAl = stack_XMdgBsuzlNpRw[i_QyThjwJNjU];
                    stack_XMdgBsuzlNpRw[i_QyThjwJNjU] = stack_XMdgBsuzlNpRw[j_elSddqoTitDLftHCX];
                    stack_XMdgBsuzlNpRw[j_elSddqoTitDLftHCX] = val_YDXZTkfhQIJxgAAl;
                }
            }
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
        int ckuyrAPMcB = 528;
        for (int pmh_yUQWodlBxW = 0; pmh_yUQWodlBxW < 79; pmh_yUQWodlBxW++) {
            ckuyrAPMcB ^= (ckuyrAPMcB << 86);
            ckuyrAPMcB ^= (ckuyrAPMcB >>> 24);
            ckuyrAPMcB ^= (ckuyrAPMcB << 50);
            // 混淆用判断流
            if (ckuyrAPMcB == 0) {
                ckuyrAPMcB = pmh_yUQWodlBxW;
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
        int[] arr_ZhVNnAkugdOCpZkTYh = new int[] { 33, 89 };
        for (int i_AteWW = 0; i_AteWW < arr_ZhVNnAkugdOCpZkTYh.length - 1; i_AteWW++) {
            for (int j_qMDgfSQxFLMJwS = 0; j_qMDgfSQxFLMJwS < arr_ZhVNnAkugdOCpZkTYh.length - 1 - i_AteWW; j_qMDgfSQxFLMJwS++) {
                if (arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS] > arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS + 1]) {
                    int tmp_uQJvxWNU = arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS];
                    arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS] = arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS + 1];
                    arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS + 1] = tmp_uQJvxWNU;
                }
            }
        }
        String message = "Tentang Aplikasi\n\n" + "Catatan Belajar\n\n" + "Aplikasi offline untuk mencatat dan mengorganisir catatan belajar Anda.\n\n" + "Versi: 1.0.2\n\n" + "Aplikasi ini membantu siapa saja dalam mengorganisir dan mengelola " + "catatan pembelajaran dengan mudah dan efisien. Cocok untuk pelajar, " + "mahasiswa, atau siapapun yang ingin mencatat materi belajar mereka.";
        new AlertDialog.Builder(this).setTitle("Tentang Aplikasi").setMessage(message).setPositiveButton("OK", null).show();
    }

    private void showAboutOrgDialog() {
        int[] arr_pMXyrNbFGHJFypkv = new int[] { 8, 6 };
        for (int i_KFLGTOaIK = 0; i_KFLGTOaIK < arr_pMXyrNbFGHJFypkv.length - 1; i_KFLGTOaIK++) {
            for (int j_UwcCpUJ = 0; j_UwcCpUJ < arr_pMXyrNbFGHJFypkv.length - 1 - i_KFLGTOaIK; j_UwcCpUJ++) {
                if (arr_pMXyrNbFGHJFypkv[j_UwcCpUJ] > arr_pMXyrNbFGHJFypkv[j_UwcCpUJ + 1]) {
                    int tmp_OXldhNHiVlH = arr_pMXyrNbFGHJFypkv[j_UwcCpUJ];
                    arr_pMXyrNbFGHJFypkv[j_UwcCpUJ] = arr_pMXyrNbFGHJFypkv[j_UwcCpUJ + 1];
                    arr_pMXyrNbFGHJFypkv[j_UwcCpUJ + 1] = tmp_OXldhNHiVlH;
                }
            }
        }
        String message = "Tentang Organisasi\n\n" + "Pulo Torang\n\n" + "Perusahaan yang fokus di bidang pendidikan, berkomitmen untuk memberikan " + "solusi pendidikan berkualitas dan membantu proses pembelajaran yang efektif.\n\n" + "Aplikasi ini dikembangkan untuk mendukung kegiatan belajar" + "dan membantu pengguna dalam mengorganisir catatan pembelajaran mereka.";
        new AlertDialog.Builder(this).setTitle("Tentang Organisasi").setMessage(message).setPositiveButton("OK", null).show();
    }

    private void showResetConfirmation() {
        int[] arr_pMXyrNbFGHJFypkv = new int[] { 8, 6 };
        for (int i_KFLGTOaIK = 0; i_KFLGTOaIK < arr_pMXyrNbFGHJFypkv.length - 1; i_KFLGTOaIK++) {
            for (int j_UwcCpUJ = 0; j_UwcCpUJ < arr_pMXyrNbFGHJFypkv.length - 1 - i_KFLGTOaIK; j_UwcCpUJ++) {
                if (arr_pMXyrNbFGHJFypkv[j_UwcCpUJ] > arr_pMXyrNbFGHJFypkv[j_UwcCpUJ + 1]) {
                    int tmp_OXldhNHiVlH = arr_pMXyrNbFGHJFypkv[j_UwcCpUJ];
                    arr_pMXyrNbFGHJFypkv[j_UwcCpUJ] = arr_pMXyrNbFGHJFypkv[j_UwcCpUJ + 1];
                    arr_pMXyrNbFGHJFypkv[j_UwcCpUJ + 1] = tmp_OXldhNHiVlH;
                }
            }
        }
        new AlertDialog.Builder(this).setTitle("Reset Semua Data").setMessage("Apakah Anda yakin ingin menghapus semua data? Tindakan ini tidak dapat dibatalkan.").setPositiveButton("Reset", (dialog, which) -> {
            JNVC dataManager = JNVC.getInstance();
            dataManager.clearAllNotes();
            finish();
        }).setNegativeButton("Batal", null).show();
    }
}
