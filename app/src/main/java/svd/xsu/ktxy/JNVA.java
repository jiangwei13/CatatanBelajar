package svd.xsu.ktxy;

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

public class JNVA {

    /**
     * Enable edge-to-edge display untuk activity
     * Call ini di onCreate() sebelum setContentView()
     */
    public static void enableEdgeToEdge(Activity activity) {
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
