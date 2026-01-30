package svd.xsu.ktxy;

import svd.xsu.ktxy.R;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import svd.imwb.bagp.ad.AdViewMana;
import androidx.appcompat.app.AppCompatActivity;

public class JNUS extends AppCompatActivity {

    // 2 seconds
    private static final int SPLASH_DURATION = 2000;

    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
        super.onCreate(savedInstanceState);
        // Enable edge-to-edge
        JNVA.enableEdgeToEdge(this);
        setContentView(R.layout.activity_splash_screen);
        // Apply window insets
        View rootView = findViewById(android.R.id.content);
        if (rootView != null) {
            JNVA.applyWindowInsets(rootView);
        }
        // Set light status bar
        JNVA.setLightStatusBar(this, true);
        // Navigate to GMFY after splash duration
        handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(() -> {
            if (!isFinishing() && !isDestroyed()) {
                AdViewMana.initView(this, "in_tab");
                Intent intent = new Intent(JNUS.this, GMFY.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_DURATION);
    }

    @Override
    protected void onDestroy() {
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
        super.onDestroy();
        // Cancel handler to prevent memory leak
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}
