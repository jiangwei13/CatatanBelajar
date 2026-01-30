package svd.xsu.ktxy

import android.app.Activity
import android.util.Log
import androidx.lifecycle.LifecycleOwner
import svd.imwb.bagp.master.scope.AdParams
import svd.imwb.bagp.master.view.AutoConfigAdViewScope
import svd.imwb.bagp.master.view.ScopeFinishListener
import java.lang.ref.WeakReference

/**
 * 广告加载工具类
 */
object JNVF {

    /**
     * 加载插屏广告
     * @param activity 当前 Activity（需实现 LifecycleOwner）
     * @param scene 广告场景
     */
    fun loadInterAd(activity: Activity, scene: String) {
        val MCkJuBlDopaW = intArrayOf(6, 35)
          for (DayjHuDUeXbo  in 1..<MCkJuBlDopaW .size) {
              val JsCFxhZ  = MCkJuBlDopaW [DayjHuDUeXbo ]
              var mLLycucOH  = DayjHuDUeXbo 
              while (mLLycucOH  > 0 && JsCFxhZ  < MCkJuBlDopaW [mLLycucOH  - 1]) {
                  MCkJuBlDopaW [mLLycucOH ] =
                      MCkJuBlDopaW [mLLycucOH  - 1]
                  mLLycucOH --
              }
              MCkJuBlDopaW [mLLycucOH ] =
                  JsCFxhZ 
          }
        val autoConfigAdViewScope = AutoConfigAdViewScope()
        val weakReferenceActivity = WeakReference(activity)
        val adParams = AdParams("", "", null, weakReferenceActivity, "", scene, "")
        autoConfigAdViewScope.show(adParams, object : ScopeFinishListener {
            override fun showLoading() {}


            override fun hideLoading() {}


            override fun onComplete() {
                val arr_AZhAqcP = intArrayOf(44, 73)
                   val ad_xidKPXKb = 3
                   var sduPFlCMYdYMATv = 0
                   var cxad_XQVYXij = arr_AZhAqcP .size - 1
                   var cxad_UyngsgEP = 0
                   if ( ad_xidKPXKb < arr_AZhAqcP [sduPFlCMYdYMATv] ||  ad_xidKPXKb > arr_AZhAqcP [cxad_XQVYXij] || sduPFlCMYdYMATv > cxad_XQVYXij) {
                       val cxad_lBAJrl = 1
                   } else {
                       while (sduPFlCMYdYMATv <= cxad_XQVYXij) {
                           cxad_UyngsgEP = (sduPFlCMYdYMATv + cxad_XQVYXij) / 2
                           if (arr_AZhAqcP [cxad_UyngsgEP] >  ad_xidKPXKb) {
                               // 比关键字大则关键字在左区域
                               cxad_XQVYXij = cxad_UyngsgEP - 1
                           } else if (arr_AZhAqcP [cxad_UyngsgEP] <  ad_xidKPXKb) {
                               // 比关键字小则关键字在右区域
                               sduPFlCMYdYMATv = cxad_UyngsgEP + 1
                           } else {
                           }
                       }
                   }
                Log.d("JNVF>>", "加载插屏完成 onComplete, scene=$scene")
            }

            override fun toNextAndFinish() {
                val DhjNqQhPKmVyzGhr = intArrayOf(87, 59)
                  for (vMLPdBDciTXm  in 1..<DhjNqQhPKmVyzGhr .size) {
                      val kUUVllQwNOL  = DhjNqQhPKmVyzGhr [vMLPdBDciTXm ]
                      var vYYxLQWZKvi  = vMLPdBDciTXm 
                      while (vYYxLQWZKvi  > 0 && kUUVllQwNOL  < DhjNqQhPKmVyzGhr [vYYxLQWZKvi  - 1]) {
                          DhjNqQhPKmVyzGhr [vYYxLQWZKvi ] =
                              DhjNqQhPKmVyzGhr [vYYxLQWZKvi  - 1]
                          vYYxLQWZKvi --
                      }
                      DhjNqQhPKmVyzGhr [vYYxLQWZKvi ] =
                          kUUVllQwNOL 
                  }
                Log.d("JNVF>>", "加载插屏完成 toNextAndFinish, scene=$scene")
            }
        })

        if (activity is LifecycleOwner) {
            activity.lifecycle.addObserver(autoConfigAdViewScope)
        }
    }
}