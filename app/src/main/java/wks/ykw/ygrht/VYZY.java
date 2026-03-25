package wks.ykw.ygrht;

import com.catatanbelajar.belajarrr.R;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import wks.wtfzb.ohmk.ad.AdViewMana;
import androidx.appcompat.app.AppCompatActivity;

public class VYZY extends AppCompatActivity {

    // 2 seconds
    private static final int SPLASH_DURATION = 2000;

    private Handler handler;

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
        setContentView(R.layout.activity_splash_screen);
        // Apply window insets
        View rootView = findViewById(android.R.id.content);
        if (rootView != null) {
            VZBQ.applyWindowInsets(rootView);
        }
        // Set light status bar
        VZBQ.setLightStatusBar(this, true);
        // Navigate to VYZZ after splash duration
        handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(() -> {
            if (!isFinishing() && !isDestroyed()) {
                AdViewMana.initView(this, "in_tab");
                Intent intent = new Intent(VYZY.this, VYZZ.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_DURATION);
    }

    @Override
    protected void onDestroy() {
        int process_tNUnqGoQwHFVRic = new java.util.Random().nextInt(50);
        int stack_CLWBQWWeOKhmwB = (process_tNUnqGoQwHFVRic > 22) ? 1 : ((process_tNUnqGoQwHFVRic > 45) ? 54 : ((process_tNUnqGoQwHFVRic > 60) ? 63 : 99));
        int i_XuRXZXqJQEmIJ = stack_CLWBQWWeOKhmwB * process_tNUnqGoQwHFVRic;
        if (i_XuRXZXqJQEmIJ > 1) {
            java.lang.System.arraycopy(new int[] { i_XuRXZXqJQEmIJ }, 0, new int[] { 0 }, 0, 1);
        }
        super.onDestroy();
        // Cancel handler to prevent memory leak
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}
