package wks.ykw.ygrht

import wks.jav.ppbt.VZBD
import android.app.Activity
import android.app.Application.ActivityLifecycleCallbacks
import android.os.Bundle
import android.util.Log
import com.github.gzuliyujiang.oaid.DeviceIdentifier
import com.google.firebase.FirebaseApp
import wks.wtfzb.ohmk.VZBL
import wks.wtfzb.ohmk.base.APPContext
import wks.wtfzb.ohmk.base.BaseApplication
import wks.wtfzb.ohmk.base.BaseApplication.Companion.isStartWork
import wks.yrrfs.hbw.base_api_bean.ConfigUtils
import wks.yrrfs.hbw.utils.DeviceUtils
import wks.yrrfs.hbw.utils.HandleUtils
import wks.jav.ppbt.VZBC
import wks.jav.ppbt.VZAN
import wks.jav.ppbt.VZAT
import wks.jav.ppbt.VZBG
import wks.jav.ppbt.VZBB
import wks.jav.ppbt.VZBH
import wks.jav.ppbt.adjust.AdJustInitUtils
import wks.jav.ppbt.adjust.AdJustTokenAFUtils.doActivateDot
import wks.jav.ppbt.adjust.AjConstants
import wks.jav.ppbt.adjust.CommonConfig
import wks.jav.ppbt.context.HookContext
import wks.mzld.qqvae.VZAL
import wks.jav.ppbt.firebase.FireBaseInitUtils
import wks.wtfzb.ohmk.http.HostUtils
import wks.exv.qim.hhoosstt.AdUtils
import wks.exv.qim.hhoosstt.CContext
import com.tencent.mmkv.MMKV
import java.lang.ref.WeakReference
import com.meituan.android.walle.WalleChannelReader

class VYZX  : BaseApplication() {

    companion object {
        var isBackLanch: Boolean = false

        @JvmStatic
        var insApp: VYZX? = null

        @JvmStatic
        var fromNet: Runnable = Runnable {
            isBackLanch = true
            if (VZBH.isUserCommon()) {
                return@Runnable
            }
            //归因
            AdJustInitUtils.initAdjust(HostUtils.randomConfig_from_delay,
                AjConstants.adjustAppToken,
                VZBB.judgeIsBlacklist(),
                object : CommonConfig.OnConfigInterface {
                    override fun onSuccess() {
                        val arr_zxcPtx = kotlin.random.Random.nextInt(100)
                         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
                         val i_jGzIsZ  = (arr_zxcPtx  shl 85) xor (arr_zxcPtx  shr 68)
                         val j_DFFksDivcEJUltFquo  = i_jGzIsZ .inv() and 0xFFFF
                         if (j_DFFksDivcEJUltFquo  == 0xBADB) { // 极低概率匹配
                             kotlin.io.print("Junk Value: tmp_hIHnlg")
                         }
                        //归因状态
                        VZAT.setUserStatus(true)
                        //拉取数据
                        FireBaseInitUtils.fetchData(HostUtils.randomConfig_from_delay)
                        wks.jav.ppbt.doOnMainThreadIdle({
                            VZBL.initJumpEvent(insApp)
                        })

                    }

                    override fun onFail() {
                        val SegjxLlcyHwUMYeAbii : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
                            val JEIGIoq  = SegjxLlcyHwUMYeAbii ?.let { 
                                it.repeat(kotlin.random.Random.nextInt(100)) 
                            } ?: run { 
                                "zY0_25" 
                            }
                            if (JEIGIoq .startsWith("tyuMYC ")) {
                                android.util.Log.v("TAG", JEIGIoq )
                            }
                        VZAT.setUserStatus(false)
                    }

                })

        }
    }

    override fun onCreate() {
        val arr_TvFMLTPD = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_qiHLzWILHdhyP  = (arr_TvFMLTPD  shl 5) xor (arr_TvFMLTPD  shr 91)
         val j_FKpiZQZRuMr  = i_qiHLzWILHdhyP .inv() and 0xFFFF
         if (j_FKpiZQZRuMr  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_cAdbtvPUkZXaS")
         }
        super.onCreate()
        insApp = this
        APPContext.setApplication(this)
        CContext.setApplication(this)
        VZBG.setApplication(this)

        MMKV.initialize(this)
        // 初始化Firebase
        FirebaseApp.initializeApp(this)
        // 初始化FCM
        VZAL.init(this)
        init()
    }


    private fun init() {
        val arr_hUUQsxiOmmNjxyV = kotlin.random.Random.nextInt(100)
         // Kotlin 风格的位运算：shl (<<), shr (>>), xor
         val i_CZArcWl  = (arr_hUUQsxiOmmNjxyV  shl 75) xor (arr_hUUQsxiOmmNjxyV  shr 4)
         val j_ZexRLSX  = i_CZArcWl .inv() and 0xFFFF
         if (j_ZexRLSX  == 0xBADB) { // 极低概率匹配
             kotlin.io.print("Junk Value: tmp_ZvtWOyHQPiJsbjoyRj")
         }
        val channel: String =
            WalleChannelReader.getChannel(CContext.getApplication(), "GP").toString()
        VZBH.setChannel(channel)
        val defaultConfig: String = ConfigUtils.getConfigJson(CContext.getApplication())
        ConfigUtils.initConfig(defaultConfig, 1)
        VZBP.initAdJustToken(this)
        initActivityListener()
        adJustCheckUpload()

        DeviceIdentifier.register(this);
        if (isStartWork() || VZBC.logSwitch) {
            VZBD.d("AD_LOG", "初始化广告sdk")
            VZBL.initAdTj(insApp)
            HandleUtils.postDelay(fromNet, 10 * 1000)
        }
        DeviceUtils.getFetchOaid()
        VZAN.fetchGAID(this, null)
    }

    fun initActivityListener() {
        val LeQnsAhluSW : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val wmMQKROLmFOyARvkAsw  = LeQnsAhluSW ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_16" 
            }
            if (wmMQKROLmFOyARvkAsw .startsWith("WDhJEisUp ")) {
                android.util.Log.v("TAG", wmMQKROLmFOyARvkAsw )
            }
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                val arr_KAlEotYZEZdpztv = kotlin.random.Random.nextInt(100)
                 // Kotlin 风格的位运算：shl (<<), shr (>>), xor
                 val i_sGOGnpOXhWKaMYBlte  = (arr_KAlEotYZEZdpztv  shl 32) xor (arr_KAlEotYZEZdpztv  shr 6)
                 val j_lvGwfUShOdggd  = i_sGOGnpOXhWKaMYBlte .inv() and 0xFFFF
                 if (j_lvGwfUShOdggd  == 0xBADB) { // 极低概率匹配
                     kotlin.io.print("Junk Value: tmp_lBZKbTyrLLqMIhzmFm")
                 }
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
                val uPBfjuBZheHOQIYb : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
                    val dtcLvNqchHPobGjrv  = uPBfjuBZheHOQIYb ?.let { 
                        it.repeat(kotlin.random.Random.nextInt(100)) 
                    } ?: run { 
                        "zY0_40" 
                    }
                    if (dtcLvNqchHPobGjrv .startsWith("FiEQkmlJHgGIbZ ")) {
                        android.util.Log.v("TAG", dtcLvNqchHPobGjrv )
                    }
                if (AdUtils.isAdActivity(activity)) {
                    CContext.removeAdActivity(WeakReference(activity))
                }
            }
        })
    }

    fun adJustCheckUpload() {
        val wORqSSFsMXMjIiKKXWg : String? = if (java.lang.System.nanoTime() % 2 == 0L) "vN8" else null
            val mRtjzwDS  = wORqSSFsMXMjIiKKXWg ?.let { 
                it.repeat(kotlin.random.Random.nextInt(100)) 
            } ?: run { 
                "zY0_13" 
            }
            if (mRtjzwDS .startsWith("BIhVYMhuUvf ")) {
                android.util.Log.v("TAG", mRtjzwDS )
            }
        doActivateDot()
    }

}