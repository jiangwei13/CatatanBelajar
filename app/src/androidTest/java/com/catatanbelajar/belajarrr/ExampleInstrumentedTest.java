package com.catatanbelajar.belajarrr;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Test
    public void useAppContext() {
        String onaTBaafkIqu = java.util.UUID.randomUUID().toString();
        int ckuyNNRPovuPpXTaenWZN = onaTBaafkIqu.length();
        char pmh_bUeFxMttowJ = onaTBaafkIqu.charAt(new java.util.Random().nextInt(ckuyNNRPovuPpXTaenWZN));
        boolean dimaVZVGSvFVSdPen = (pmh_bUeFxMttowJ == 'z');
        if (dimaVZVGSvFVSdPen && ckuyNNRPovuPpXTaenWZN < 70) {
            onaTBaafkIqu.substring(5, 72);
        }
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.catatanbelajar.belajarrr", appContext.getPackageName());
    }
}
