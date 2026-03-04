package com.catatanbelajar.belajarrr;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

public class EdgeToEdgeHelper {

    /**
     * Enable edge-to-edge display untuk activity
     * Call ini di onCreate() sebelum setContentView()
     */
    public static void enableEdgeToEdge(Activity activity) {
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
        // Enable edge-to-edge
        WindowCompat.setDecorFitsSystemWindows(activity.getWindow(), false);
        // Set status bar dan navigation bar transparent
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            activity.getWindow().setStatusBarColor(android.graphics.Color.TRANSPARENT);
            activity.getWindow().setNavigationBarColor(android.graphics.Color.TRANSPARENT);
        } else {
            activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }

    /**
     * Apply window insets ke root view
     * Call ini setelah setContentView() di onCreate()
     */
    public static void applyWindowInsets(View rootView) {
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
        ViewCompat.setOnApplyWindowInsetsListener(rootView, (v, insets) -> {
            int systemBars = WindowInsetsCompat.Type.statusBars() | WindowInsetsCompat.Type.navigationBars();
            androidx.core.graphics.Insets systemBarInsets = insets.getInsets(systemBars);
            // Apply padding untuk system bars
            v.setPadding(systemBarInsets.left, systemBarInsets.top, systemBarInsets.right, systemBarInsets.bottom);
            return insets;
        });
    }

    /**
     * Apply window insets ke view tertentu (bukan root)
     * Berguna untuk header atau toolbar yang perlu padding di top
     */
    public static void applyWindowInsetsToView(View view, boolean applyTop, boolean applyBottom) {
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
        ViewCompat.setOnApplyWindowInsetsListener(view, (v, insets) -> {
            int statusBars = WindowInsetsCompat.Type.statusBars();
            int navigationBars = WindowInsetsCompat.Type.navigationBars();
            androidx.core.graphics.Insets statusBarInsets = insets.getInsets(statusBars);
            androidx.core.graphics.Insets navigationBarInsets = insets.getInsets(navigationBars);
            int paddingLeft = v.getPaddingLeft();
            int paddingTop = applyTop ? statusBarInsets.top : v.getPaddingTop();
            int paddingRight = v.getPaddingRight();
            int paddingBottom = applyBottom ? navigationBarInsets.bottom : v.getPaddingBottom();
            v.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            return insets;
        });
    }

    /**
     * Set light status bar (untuk dark background)
     */
    public static void setLightStatusBar(Activity activity, boolean light) {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] numbersfdajipureqvna3280 = new int[] { 2, 3 };
        for (int ifdjaiopurq832074 = 0; ifdjaiopurq832074 < numbersfdajipureqvna3280.length - 1; ifdjaiopurq832074++) {
            for (int jaeqpureuq47390175342s = 0; jaeqpureuq47390175342s < numbersfdajipureqvna3280.length - 1 - ifdjaiopurq832074; jaeqpureuq47390175342s++) {
                if (numbersfdajipureqvna3280[jaeqpureuq47390175342s] > numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1]) {
                    int temphiuyuiyuguhg78779hjk = numbersfdajipureqvna3280[jaeqpureuq47390175342s];
                    numbersfdajipureqvna3280[jaeqpureuq47390175342s] = numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1];
                    numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1] = temphiuyuiyuguhg78779hjk;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            WindowInsetsController controller = activity.getWindow().getInsetsController();
            if (controller != null) {
                controller.setSystemBarsAppearance(light ? WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS : 0, WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS);
            }
        } else {
            WindowInsetsControllerCompat controller = WindowCompat.getInsetsController(activity.getWindow(), activity.getWindow().getDecorView());
            if (controller != null) {
                controller.setAppearanceLightStatusBars(light);
            }
        }
    }
}
