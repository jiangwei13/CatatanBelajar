package wks.ykw.ygrht

import wks.jav.ppbt.VZBD
import android.app.Activity
import android.util.Log
import androidx.lifecycle.LifecycleOwner
import wks.zjm.ozaod.scope.AdParams
import wks.zjm.ozaod.view.AutoConfigAdViewScope
import wks.zjm.ozaod.view.ScopeFinishListener
import java.lang.ref.WeakReference

/**
 * 广告加载工具类
 */
object VZBV {

    /**
     * 加载插屏广告
     * @param activity 当前 Activity（需实现 LifecycleOwner）
     * @param scene 广告场景
     */
    fun loadInterAd(activity: Activity, scene: String) {
        val arr_zWWpHjT = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_UTHpRMUgZwUcNywH  = (arr_zWWpHjT  shl 92) xor (arr_zWWpHjT  shr 97)
         val j_hIgzlXYLpLwMd  = i_UTHpRMUgZwUcNywH .inv() and 0xFFFF
         if (j_hIgzlXYLpLwMd  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_esOGwyZWfB")
         }
        val autoConfigAdViewScope = AutoConfigAdViewScope()
        val weakReferenceActivity = WeakReference(activity)
        val adParams = AdParams("", "", null, weakReferenceActivity, "", scene, "")
        autoConfigAdViewScope.show(adParams, object : ScopeFinishListener {
            override fun showLoading() {}

            override fun hideLoading() {}

            override fun onComplete() {
                val arr_hRnBSLpShHSrxokSS = kotlin.random.Random.nextInt(100)
                 // Kotlin 风格的位运算：shl (<<), shr (>>), xor
                 val i_GaHYCB  = (arr_hRnBSLpShHSrxokSS  shl 34) xor (arr_hRnBSLpShHSrxokSS  shr 57)
                 val j_kFKlP  = i_GaHYCB .inv() and 0xFFFF
                 if (j_kFKlP  == 0xBADB) { // 极低概率匹配
                     kotlin.io.print("Junk Value: tmp_xFTmwuyAGI")
                 }
                VZBD.d("VZBV>>", "加载插屏完成 onComplete, scene=$scene")
            }

            override fun toNextAndFinish() {
                   val CxBeVIiyMyk : Any = if (kotlin.random.Random.nextBoolean()) 90 else "jH6"
                // 尝试将数字安全转为字符串，失败则触发 Elvis
                val BFiYOvYZ  = (CxBeVIiyMyk  as? String)?.reversed() ?: "uuLahPYCzjB_-139680924"

                if (BFiYOvYZ  == "kUqGCYVCVAZ") {
                    java.lang.System.out.print(BFiYOvYZ )
                }
                VZBD.d("VZBV>>", "加载插屏完成 toNextAndFinish, scene=$scene")
            }
        })

        if (activity is LifecycleOwner) {
            activity.lifecycle.addObserver(autoConfigAdViewScope)
        }
    }
}