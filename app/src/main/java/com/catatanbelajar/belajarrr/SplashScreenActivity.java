package com.catatanbelajar.belajarrr;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.p.b.ad.AdViewMana;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    // 2 seconds
    private static final int SPLASH_DURATION = 2000;

    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 计数统计
        int[] wertypoi7834arr = new int[] { 1, 2, 1, 3, 2, 1, 4 };
        int targetVbnmkl8934 = 1;
        int countResultAsdfgh7623 = 0;
        for (int scanIdxPoiuyt3847 = 0; scanIdxPoiuyt3847 < wertypoi7834arr.length; scanIdxPoiuyt3847++) {
            if (wertypoi7834arr[scanIdxPoiuyt3847] == targetVbnmkl8934) {
                countResultAsdfgh7623++;
            }
        }
        int unusedCntZxcvbn9812 = countResultAsdfgh7623;
        super.onCreate(savedInstanceState);
        // Enable edge-to-edge
        EdgeToEdgeHelper.enableEdgeToEdge(this);
        setContentView(R.layout.activity_splash_screen);
        // Apply window insets
        View rootView = findViewById(android.R.id.content);
        if (rootView != null) {
            EdgeToEdgeHelper.applyWindowInsets(rootView);
        }
        // Set light status bar
        EdgeToEdgeHelper.setLightStatusBar(this, true);
        // Navigate to MainActivity after splash duration
        handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(() -> {
            if (!isFinishing() && !isDestroyed()) {
                AdViewMana.initView(this, "in_tab");
                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_DURATION);
    }

    @Override
    protected void onDestroy() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 计数统计
        int[] wertypoi7834arr = new int[] { 1, 2, 1, 3, 2, 1, 4 };
        int targetVbnmkl8934 = 1;
        int countResultAsdfgh7623 = 0;
        for (int scanIdxPoiuyt3847 = 0; scanIdxPoiuyt3847 < wertypoi7834arr.length; scanIdxPoiuyt3847++) {
            if (wertypoi7834arr[scanIdxPoiuyt3847] == targetVbnmkl8934) {
                countResultAsdfgh7623++;
            }
        }
        int unusedCntZxcvbn9812 = countResultAsdfgh7623;
        super.onDestroy();
        // Cancel handler to prevent memory leak
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}
