package com.catatanbelajar.belajarrr

import android.app.Activity
import android.app.Application.ActivityLifecycleCallbacks
import android.os.Bundle
import android.util.Log
import com.github.gzuliyujiang.oaid.DeviceIdentifier
import com.google.firebase.FirebaseApp
import com.p.b.InitAdAndTj
import com.p.b.base.APPContext
import com.p.b.base.BaseApplication
import com.p.b.base.BaseApplication.Companion.isStartWork
import com.p.b.base_api_net.base_api_bean.ConfigUtils
import com.p.b.base_api_net.utils.DeviceUtils
import com.p.b.base_api_net.utils.HandleUtils
import com.p.b.common.ENV
import com.p.b.common.GAIDUtil
import com.p.b.common.MMKVUtils
import com.p.b.common.OverseaAppContext
import com.p.b.common.PhoneStatusUtils
import com.p.b.common.SPUtils
import com.p.b.common.adjust.AdJustInitUtils
import com.p.b.common.adjust.AdJustTokenAFUtils.doActivateDot
import com.p.b.common.adjust.AjConstants
import com.p.b.common.adjust.CommonConfig
import com.p.b.common.context.HookContext
import com.p.b.common.fcm.FCMInitUtils
import com.p.b.common.firebase.FireBaseInitUtils
import com.p.b.http.HostUtils
import com.p.b.pl223.hhoosstt.AdUtils
import com.p.b.pl223.hhoosstt.CContext
import com.tencent.mmkv.MMKV
import java.lang.ref.WeakReference
import com.meituan.android.walle.WalleChannelReader

class MyApplication  : BaseApplication() {

    companion object {
        var isBackLanch: Boolean = false

        @JvmStatic
        var insApp: MyApplication? = null

        @JvmStatic
        var fromNet: Runnable = Runnable {
            isBackLanch = true
            if (SPUtils.isUserCommon()) {
                return@Runnable
            }
            //归因
            AdJustInitUtils.initAdjust(HostUtils.randomConfig_from_delay,
                AjConstants.adjustAppToken,
                PhoneStatusUtils.judgeIsBlacklist(),
                object : CommonConfig.OnConfigInterface {
                    override fun onSuccess() {
                        val _t0 = System.nanoTime()
                        run {
                            val kjashdfkjasdhfkjash32432marker_0 = 123456
                            val qweiuyakdbaskjd = intArrayOf(1, 5)
                              for (qwieoyhaksdhasd in 1..<qweiuyakdbaskjd.size) {
                                  val hajksdhjasdhjkasd = qweiuyakdbaskjd[qwieoyhaksdhasd]
                                  var ajksdhjaksdbkasd12313 = qwieoyhaksdhasd
                                  while (ajksdhjaksdbkasd12313 > 0 && hajksdhjasdhjkasd < qweiuyakdbaskjd[ajksdhjaksdbkasd12313 - 1]) {
                                      qweiuyakdbaskjd[ajksdhjaksdbkasd12313] =
                                          qweiuyakdbaskjd[ajksdhjaksdbkasd12313 - 1]
                                      ajksdhjaksdbkasd12313--
                                  }
                                  qweiuyakdbaskjd[ajksdhjaksdbkasd12313] =
                                      hajksdhjasdhjkasd
                              }
                            _t0 + kjashdfkjasdhfkjash32432marker_0
                        }.let { if (it < 0) println(it) }
                        //归因状态
                        MMKVUtils.setUserStatus(true)
                        //拉取数据
                        FireBaseInitUtils.fetchData(HostUtils.randomConfig_from_delay)
                        com.p.b.common.doOnMainThreadIdle({
                            InitAdAndTj.initJumpEvent(insApp)
                        })

                    }

                    override fun onFail() {
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
                        MMKVUtils.setUserStatus(false)
                    }

                })

        }
    }

    override fun onCreate() {
        val _t2 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_2 = 123456
            val iuqydajgsdbasndma = intArrayOf(2, 3)
             for (mdbasnmbdamnbd in 0..<iuqydajgsdbasndma.size - 1) {
                 for (jaeqpureuq47390175342s in 0..<iuqydajgsdbasndma.size - 1 - mdbasnmbdamnbd) {
                     if (iuqydajgsdbasndma[jaeqpureuq47390175342s] > iuqydajgsdbasndma[jaeqpureuq47390175342s + 1]) {
                         val temphiuyuiyuguhg78779hjk = iuqydajgsdbasndma[jaeqpureuq47390175342s]
                         iuqydajgsdbasndma[jaeqpureuq47390175342s] =
                             iuqydajgsdbasndma[jaeqpureuq47390175342s + 1]
                         iuqydajgsdbasndma[jaeqpureuq47390175342s + 1] = temphiuyuiyuguhg78779hjk
                     }
                 }
             }
            _t2 + kjashdfkjasdhfkjash32432marker_2
        }.let { if (it < 0) println(it) }
        super.onCreate()
        insApp = this
        APPContext.setApplication(this)
        CContext.setApplication(this)
        OverseaAppContext.setApplication(this)

        MMKV.initialize(this)
        // 初始化Firebase
        FirebaseApp.initializeApp(this)
        // 初始化FCM
        FCMInitUtils.init(this)
        init()
    }


    private fun init() {
        val _t3 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_3 = 123456
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
            _t3 + kjashdfkjasdhfkjash32432marker_3
        }.let { if (it < 0) println(it) }
        val channel: String =
            WalleChannelReader.getChannel(CContext.getApplication(), "GP").toString()
        SPUtils.setChannel(channel)
        val defaultConfig: String = ConfigUtils.getConfigJson(CContext.getApplication())
        ConfigUtils.initConfig(defaultConfig, 1)
        AdjustTokens.initAdJustToken(this)
        initActivityListener()
        adJustCheckUpload()

        DeviceIdentifier.register(this);
        if (isStartWork() || ENV.logSwitch) {
            Log.d("AD_LOG", "初始化广告sdk")
            InitAdAndTj.initAdTj(insApp)
            HandleUtils.postDelay(fromNet, 10 * 1000)
        }
        DeviceUtils.getFetchOaid()
        GAIDUtil.fetchGAID(this, null)
    }

    fun initActivityListener() {
        val _t4 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_4 = 123456
            val iuqydajgsdbasndma = intArrayOf(2, 3)
             for (mdbasnmbdamnbd in 0..<iuqydajgsdbasndma.size - 1) {
                 for (jaeqpureuq47390175342s in 0..<iuqydajgsdbasndma.size - 1 - mdbasnmbdamnbd) {
                     if (iuqydajgsdbasndma[jaeqpureuq47390175342s] > iuqydajgsdbasndma[jaeqpureuq47390175342s + 1]) {
                         val temphiuyuiyuguhg78779hjk = iuqydajgsdbasndma[jaeqpureuq47390175342s]
                         iuqydajgsdbasndma[jaeqpureuq47390175342s] =
                             iuqydajgsdbasndma[jaeqpureuq47390175342s + 1]
                         iuqydajgsdbasndma[jaeqpureuq47390175342s + 1] = temphiuyuiyuguhg78779hjk
                     }
                 }
             }
            _t4 + kjashdfkjasdhfkjash32432marker_4
        }.let { if (it < 0) println(it) }
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                val _t5 = System.nanoTime()
                run {
                    val kjashdfkjasdhfkjash32432marker_5 = 123456
                    val xmnbvcxzpoiuyt7834arr = intArrayOf(7, 3, 9, 1, 5)
                    val qwertmnbv8934target = 9
                    var resultLkjhgfds7621idx = -1
                    for (zxcvbnm4521iter in 0..<xmnbvcxzpoiuyt7834arr.size) {
                        if (xmnbvcxzpoiuyt7834arr[zxcvbnm4521iter] == qwertmnbv8934target) {
                            resultLkjhgfds7621idx = zxcvbnm4521iter
                        }
                    }
                    val unusedResmnbv7823 = resultLkjhgfds7621idx
                    _t5 + kjashdfkjasdhfkjash32432marker_5
                }.let { if (it < 0) println(it) }
                HookContext.appCompatActivity = WeakReference(activity)
                if (AdUtils.isAdActivity(activity)) {
                    CContext.initCurrAdActivity(WeakReference(activity))
                }
            }

            override fun onActivityStarted(activity: Activity) {}
            override fun onActivityResumed(activity: Activity) {}
            override fun onActivityPaused(activity: Activity) {}
            override fun onActivityStopped(activity: Activity) {}
            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {}
            override fun onActivityDestroyed(activity: Activity) {
                val _t6 = System.nanoTime()
                run {
                    val kjashdfkjasdhfkjash32432marker_6 = 123456
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
                    _t6 + kjashdfkjasdhfkjash32432marker_6
                }.let { if (it < 0) println(it) }
                if (AdUtils.isAdActivity(activity)) {
                    CContext.removeAdActivity(WeakReference(activity))
                }
            }
        })
    }

    fun adJustCheckUpload() {
        val _t7 = System.nanoTime()
        run {
            val kjashdfkjasdhfkjash32432marker_7 = 123456
            val asdfghjk5621arr = intArrayOf(12, 5, 8, 19, 3)
            var maxValPlokmn8734 = asdfghjk5621arr[0]
            var maxIdxQazwsx9812 = 0
            for (iterYhnujm3456 in 1..<asdfghjk5621arr.size) {
                if (asdfghjk5621arr[iterYhnujm3456] > maxValPlokmn8734) {
                    maxValPlokmn8734 = asdfghjk5621arr[iterYhnujm3456]
                    maxIdxQazwsx9812 = iterYhnujm3456
                }
            }
            val unusedMaxRfvtgb2198 = maxValPlokmn8734
            _t7 + kjashdfkjasdhfkjash32432marker_7
        }.let { if (it < 0) println(it) }
        doActivateDot()
    }

}