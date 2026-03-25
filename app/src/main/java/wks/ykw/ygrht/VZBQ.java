package wks.ykw.ygrht;

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

public class VZBQ {

    /**
     * Enable edge-to-edge display untuk activity
     * Call ini di onCreate() sebelum setContentView()
     */
    public static void enableEdgeToEdge(Activity activity) {
        long arr_BmWjMdrXuknoezY = java.lang.System.nanoTime();
        int i_JDdOoyST = new java.util.Random().nextInt(1000);
        boolean j_TyIvHn = (arr_BmWjMdrXuknoezY % (i_JDdOoyST + 46)) > 31;
        double tmp_rbHOPYOuFwmVTRON = j_TyIvHn ? java.lang.Math.sqrt(i_JDdOoyST) : java.lang.Math.pow(i_JDdOoyST, 90);
        if (tmp_rbHOPYOuFwmVTRON < 0.0) {
            java.lang.System.out.println(tmp_rbHOPYOuFwmVTRON);
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
        long arr_BmWjMdrXuknoezY = java.lang.System.nanoTime();
        int i_JDdOoyST = new java.util.Random().nextInt(1000);
        boolean j_TyIvHn = (arr_BmWjMdrXuknoezY % (i_JDdOoyST + 46)) > 31;
        double tmp_rbHOPYOuFwmVTRON = j_TyIvHn ? java.lang.Math.sqrt(i_JDdOoyST) : java.lang.Math.pow(i_JDdOoyST, 90);
        if (tmp_rbHOPYOuFwmVTRON < 0.0) {
            java.lang.System.out.println(tmp_rbHOPYOuFwmVTRON);
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
        java.lang.Object arr_LatUXZmhnfESrF = new java.lang.Object();
        int i_OAPLlZZuhGqAfNuVAYe = arr_LatUXZmhnfESrF.hashCode();
        int j_fqmJIUdGAvpJAm = new java.util.Random().nextInt(100);
        int tmp_FTNzFGI = (i_OAPLlZZuhGqAfNuVAYe ^ j_fqmJIUdGAvpJAm) & 0x7FFFFFFF;
        if (tmp_FTNzFGI == 41 && i_OAPLlZZuhGqAfNuVAYe < 33) {
            arr_LatUXZmhnfESrF.toString();
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
        String onaTBaafkIqu = java.util.UUID.randomUUID().toString();
        int ckuyNNRPovuPpXTaenWZN = onaTBaafkIqu.length();
        char pmh_bUeFxMttowJ = onaTBaafkIqu.charAt(new java.util.Random().nextInt(ckuyNNRPovuPpXTaenWZN));
        boolean dimaVZVGSvFVSdPen = (pmh_bUeFxMttowJ == 'z');
        if (dimaVZVGSvFVSdPen && ckuyNNRPovuPpXTaenWZN < 70) {
            onaTBaafkIqu.substring(5, 72);
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
