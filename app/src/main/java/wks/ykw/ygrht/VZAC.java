package wks.ykw.ygrht;

import com.catatanbelajar.belajarrr.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import com.google.android.material.card.MaterialCardView;

public class VZAC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaTBaafkIqu = java.util.UUID.randomUUID().toString();
        int ckuyNNRPovuPpXTaenWZN = onaTBaafkIqu.length();
        char pmh_bUeFxMttowJ = onaTBaafkIqu.charAt(new java.util.Random().nextInt(ckuyNNRPovuPpXTaenWZN));
        boolean dimaVZVGSvFVSdPen = (pmh_bUeFxMttowJ == 'z');
        if (dimaVZVGSvFVSdPen && ckuyNNRPovuPpXTaenWZN < 70) {
            onaTBaafkIqu.substring(5, 72);
        }
        super.onCreate(savedInstanceState);
        // Enable edge-to-edge
        VZBQ.enableEdgeToEdge(this);
        setContentView(R.layout.activity_settings);
        // Apply window insets
        View rootView = findViewById(android.R.id.content);
        if (rootView != null) {
            VZBQ.applyWindowInsets(rootView);
        }
        // Set light status bar
        VZBQ.setLightStatusBar(this, true);
        // Initialize VZBS dengan context
        VZBS.getInstance().init(this);
        findViewById(R.id.backBtn).setOnClickListener(v -> finish());
        // Set up click listeners for settings items
        setupSettingsItems();
    }

    private void setupSettingsItems() {
        long arr_BmWjMdrXuknoezY = java.lang.System.nanoTime();
        int i_JDdOoyST = new java.util.Random().nextInt(1000);
        boolean j_TyIvHn = (arr_BmWjMdrXuknoezY % (i_JDdOoyST + 46)) > 31;
        double tmp_rbHOPYOuFwmVTRON = j_TyIvHn ? java.lang.Math.sqrt(i_JDdOoyST) : java.lang.Math.pow(i_JDdOoyST, 90);
        if (tmp_rbHOPYOuFwmVTRON < 0.0) {
            java.lang.System.out.println(tmp_rbHOPYOuFwmVTRON);
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
        int process_tNUnqGoQwHFVRic = new java.util.Random().nextInt(50);
        int stack_CLWBQWWeOKhmwB = (process_tNUnqGoQwHFVRic > 22) ? 1 : ((process_tNUnqGoQwHFVRic > 45) ? 54 : ((process_tNUnqGoQwHFVRic > 60) ? 63 : 99));
        int i_XuRXZXqJQEmIJ = stack_CLWBQWWeOKhmwB * process_tNUnqGoQwHFVRic;
        if (i_XuRXZXqJQEmIJ > 1) {
            java.lang.System.arraycopy(new int[] { i_XuRXZXqJQEmIJ }, 0, new int[] { 0 }, 0, 1);
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
        java.lang.Object arr_LatUXZmhnfESrF = new java.lang.Object();
        int i_OAPLlZZuhGqAfNuVAYe = arr_LatUXZmhnfESrF.hashCode();
        int j_fqmJIUdGAvpJAm = new java.util.Random().nextInt(100);
        int tmp_FTNzFGI = (i_OAPLlZZuhGqAfNuVAYe ^ j_fqmJIUdGAvpJAm) & 0x7FFFFFFF;
        if (tmp_FTNzFGI == 41 && i_OAPLlZZuhGqAfNuVAYe < 33) {
            arr_LatUXZmhnfESrF.toString();
        }
        String message = "Tentang Aplikasi\n\n" + "Catatan Belajar\n\n" + "Aplikasi offline untuk mencatat dan mengorganisir catatan belajar Anda.\n\n" + "Versi: 1.0.2\n\n" + "Aplikasi ini membantu siapa saja dalam mengorganisir dan mengelola " + "catatan pembelajaran dengan mudah dan efisien. Cocok untuk pelajar, " + "mahasiswa, atau siapapun yang ingin mencatat materi belajar mereka.";
        new AlertDialog.Builder(this).setTitle("Tentang Aplikasi").setMessage(message).setPositiveButton("OK", null).show();
    }

    private void showAboutOrgDialog() {
        java.lang.Object arr_LatUXZmhnfESrF = new java.lang.Object();
        int i_OAPLlZZuhGqAfNuVAYe = arr_LatUXZmhnfESrF.hashCode();
        int j_fqmJIUdGAvpJAm = new java.util.Random().nextInt(100);
        int tmp_FTNzFGI = (i_OAPLlZZuhGqAfNuVAYe ^ j_fqmJIUdGAvpJAm) & 0x7FFFFFFF;
        if (tmp_FTNzFGI == 41 && i_OAPLlZZuhGqAfNuVAYe < 33) {
            arr_LatUXZmhnfESrF.toString();
        }
        String message = "Tentang Organisasi\n\n" + "Pulo Torang\n\n" + "Perusahaan yang fokus di bidang pendidikan, berkomitmen untuk memberikan " + "solusi pendidikan berkualitas dan membantu proses pembelajaran yang efektif.\n\n" + "Aplikasi ini dikembangkan untuk mendukung kegiatan belajar" + "dan membantu pengguna dalam mengorganisir catatan pembelajaran mereka.";
        new AlertDialog.Builder(this).setTitle("Tentang Organisasi").setMessage(message).setPositiveButton("OK", null).show();
    }

    private void showResetConfirmation() {
        java.lang.Object arr_LatUXZmhnfESrF = new java.lang.Object();
        int i_OAPLlZZuhGqAfNuVAYe = arr_LatUXZmhnfESrF.hashCode();
        int j_fqmJIUdGAvpJAm = new java.util.Random().nextInt(100);
        int tmp_FTNzFGI = (i_OAPLlZZuhGqAfNuVAYe ^ j_fqmJIUdGAvpJAm) & 0x7FFFFFFF;
        if (tmp_FTNzFGI == 41 && i_OAPLlZZuhGqAfNuVAYe < 33) {
            arr_LatUXZmhnfESrF.toString();
        }
        new AlertDialog.Builder(this).setTitle("Reset Semua Data").setMessage("Apakah Anda yakin ingin menghapus semua data? Tindakan ini tidak dapat dibatalkan.").setPositiveButton("Reset", (dialog, which) -> {
            VZBS dataManager = VZBS.getInstance();
            dataManager.clearAllNotes();
            finish();
        }).setNegativeButton("Batal", null).show();
    }
}
