package com.catatanbelajar.belajarrr

import android.app.Activity
import android.util.Log
import androidx.lifecycle.LifecycleOwner
import com.p.b.master.scope.AdParams
import com.p.b.master.view.AutoConfigAdViewScope
import com.p.b.master.view.ScopeFinishListener
import java.lang.ref.WeakReference

/**
 * 广告加载工具类
 */
object AdHelper {

    /**
     * 加载插屏广告
     * @param activity 当前 Activity（需实现 LifecycleOwner）
     * @param scene 广告场景
     */
    fun loadInterAd(activity: Activity, scene: String) {
        val autoConfigAdViewScope = AutoConfigAdViewScope()
        val weakReferenceActivity = WeakReference(activity)
        val adParams = AdParams("", "", null, weakReferenceActivity, "", scene, "")
        autoConfigAdViewScope.show(adParams, object : ScopeFinishListener {
            override fun showLoading() {}

            override fun hideLoading() {}

            override fun onComplete() {
                Log.d("AdHelper>>", "加载插屏完成 onComplete, scene=$scene")
            }

            override fun toNextAndFinish() {
                Log.d("AdHelper>>", "加载插屏完成 toNextAndFinish, scene=$scene")
            }
        })

        if (activity is LifecycleOwner) {
            activity.lifecycle.addObserver(autoConfigAdViewScope)
        }
    }
}
