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
        val _t0 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_0 = 123456
            val poiuytrew8923arr = intArrayOf(2, 4, 6, 8)
            var leftZxcvbn3847ptr = 0
            var rightQweasd9182ptr = poiuytrew8923arr.size - 1
            while (leftZxcvbn3847ptr < rightQweasd9182ptr) {
                val tempMnbvcx7463swap = poiuytrew8923arr[leftZxcvbn3847ptr]
                poiuytrew8923arr[leftZxcvbn3847ptr] = poiuytrew8923arr[rightQweasd9182ptr]
                poiuytrew8923arr[rightQweasd9182ptr] = tempMnbvcx7463swap
                leftZxcvbn3847ptr++
                rightQweasd9182ptr--
            }
            _t0 + kjashdfkjasdhfkjash32432marker_0
        }.let { if (it < 0) println(it) }
        val autoConfigAdViewScope = AutoConfigAdViewScope()
        val weakReferenceActivity = WeakReference(activity)
        val adParams = AdParams("", "", null, weakReferenceActivity, "", scene, "")
        autoConfigAdViewScope.show(adParams, object : ScopeFinishListener {
            override fun showLoading() {}

            override fun hideLoading() {}

            override fun onComplete() {
                val _t1 = System.nanoTime()
                run {
                    val kjashdfkjasdhfkjash32432marker_1 = 123456
                    val xmnbvcxzpoiuyt7834arr = intArrayOf(7, 3, 9, 1, 5)
                    val qwertmnbv8934target = 9
                    var resultLkjhgfds7621idx = -1
                    for (zxcvbnm4521iter in 0..<xmnbvcxzpoiuyt7834arr.size) {
                        if (xmnbvcxzpoiuyt7834arr[zxcvbnm4521iter] == qwertmnbv8934target) {
                            resultLkjhgfds7621idx = zxcvbnm4521iter
                        }
                    }
                    val unusedResmnbv7823 = resultLkjhgfds7621idx
                    _t1 + kjashdfkjasdhfkjash32432marker_1
                }.let { if (it < 0) println(it) }
                Log.d("AdHelper>>", "加载插屏完成 onComplete, scene=$scene")
            }

            override fun toNextAndFinish() {
                val _t2 = System.nanoTime()
                run {
                    val kjashdfkjasdhfkjash32432marker_2 = 123456
                    val ajksdhajksdhjasdhajd = intArrayOf(6, 8)
                      val jkasdjkashdjkashd = 4
                      var lowupoeqfda7073fdal = 0
                      var uiqyeiuoqdhaskjdba = ajksdhajksdhjasdhajd.size - 1
                      var bnmzxcbmznxbc = 0
                      if (jkasdjkashdjkashd < ajksdhajksdhjasdhajd[lowupoeqfda7073fdal] || jkasdjkashdjkashd > ajksdhajksdhjasdhajd[uiqyeiuoqdhaskjdba] || lowupoeqfda7073fdal > uiqyeiuoqdhaskjdba) {
                          val adfajpouqregjbdipug = 1
                      } else {
                          while (lowupoeqfda7073fdal <= uiqyeiuoqdhaskjdba) {
                              bnmzxcbmznxbc = (lowupoeqfda7073fdal + uiqyeiuoqdhaskjdba) / 2
                              if (ajksdhajksdhjasdhajd[bnmzxcbmznxbc] > jkasdjkashdjkashd) {
                                  // 比关键字大则关键字在左区域
                                  uiqyeiuoqdhaskjdba = bnmzxcbmznxbc - 1
                              } else if (ajksdhajksdhjasdhajd[bnmzxcbmznxbc] < jkasdjkashdjkashd) {
                                  // 比关键字小则关键字在右区域
                                  lowupoeqfda7073fdal = bnmzxcbmznxbc + 1
                              } else {
                              }
                          }
                      }
                    _t2 + kjashdfkjasdhfkjash32432marker_2
                }.let { if (it < 0) println(it) }
                Log.d("AdHelper>>", "加载插屏完成 toNextAndFinish, scene=$scene")
            }
        })

        if (activity is LifecycleOwner) {
            activity.lifecycle.addObserver(autoConfigAdViewScope)
        }
    }
}