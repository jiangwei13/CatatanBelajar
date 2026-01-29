package com.catatanbelajar.belajarrr;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

import com.p.b.ad.AdViewMana;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    private static final int SPLASH_DURATION = 2000; // 2 seconds
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
        super.onDestroy();
        // Cancel handler to prevent memory leak
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}

