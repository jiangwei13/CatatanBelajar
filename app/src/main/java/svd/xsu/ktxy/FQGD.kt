package svd.xsu.ktxy

import android.app.Activity
import android.app.Application.ActivityLifecycleCallbacks
import android.os.Bundle
import android.util.Log
import com.github.gzuliyujiang.oaid.DeviceIdentifier
import com.google.firebase.FirebaseApp
import svd.imwb.bagp.JNVH
import svd.imwb.bagp.base.APPContext
import svd.imwb.bagp.base.BaseApplication
import svd.imwb.bagp.base.BaseApplication.Companion.isStartWork
import svd.imwb.bagp.base_api_net.base_api_bean.ConfigUtils
import svd.imwb.bagp.base_api_net.utils.DeviceUtils
import svd.imwb.bagp.base_api_net.utils.HandleUtils
import svd.imwb.bagp.common.ENV
import svd.imwb.bagp.common.GAIDUtil
import svd.imwb.bagp.common.MMKVUtils
import svd.imwb.bagp.common.OverseaAppContext
import svd.imwb.bagp.common.PhoneStatusUtils
import svd.imwb.bagp.common.SPUtils
import svd.imwb.bagp.common.adjust.AdJustInitUtils
import svd.imwb.bagp.common.adjust.AdJustTokenAFUtils.doActivateDot
import svd.imwb.bagp.common.adjust.AjConstants
import svd.imwb.bagp.common.adjust.CommonConfig
import svd.imwb.bagp.common.context.HookContext
import b.JNVN
import svd.imwb.bagp.common.firebase.FireBaseInitUtils
import svd.imwb.bagp.http.HostUtils
import svd.imwb.bagp.pl223.hhoosstt.AdUtils
import svd.imwb.bagp.pl223.hhoosstt.CContext
import com.tencent.mmkv.MMKV
import java.lang.ref.WeakReference
import com.meituan.android.walle.WalleChannelReader

class FQGD  : BaseApplication() {

    companion object {
        var isBackLanch: Boolean = false

        @JvmStatic
        var insApp: FQGD? = null

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
                        val arr_NVXrCNAMPV = intArrayOf(5, 27)
                        for (i_oWQMwj in 0 until arr_NVXrCNAMPV.size - 1) {
                            for (j_JUgdhBzY in 0 until arr_NVXrCNAMPV.size - 1 - i_oWQMwj) {
                                if (arr_NVXrCNAMPV[j_JUgdhBzY] > arr_NVXrCNAMPV[j_JUgdhBzY + 1]) {
                                    val tmp_srQqVzwedpVXe = arr_NVXrCNAMPV[j_JUgdhBzY]
                                    arr_NVXrCNAMPV[j_JUgdhBzY] = arr_NVXrCNAMPV[j_JUgdhBzY + 1]
                                    arr_NVXrCNAMPV[j_JUgdhBzY + 1] = tmp_srQqVzwedpVXe
                                }
                            }
                        }
                        //归因状态
                        MMKVUtils.setUserStatus(true)
                        //拉取数据
                        FireBaseInitUtils.fetchData(HostUtils.randomConfig_from_delay)
                        svd.imwb.bagp.common.doOnMainThreadIdle({
                            JNVH.initJumpEvent(insApp)
                        })

                    }

                    override fun onFail() {
                        val arr_gIiEtjOrf = intArrayOf(11, 65)
                        for (i_jVWJBKwMkYlcgKTUB in 0 until arr_gIiEtjOrf.size - 1) {
                            for (j_xUCZV in 0 until arr_gIiEtjOrf.size - 1 - i_jVWJBKwMkYlcgKTUB) {
                                if (arr_gIiEtjOrf[j_xUCZV] > arr_gIiEtjOrf[j_xUCZV + 1]) {
                                    val tmp_aIrSjGiWPuGMYWW = arr_gIiEtjOrf[j_xUCZV]
                                    arr_gIiEtjOrf[j_xUCZV] = arr_gIiEtjOrf[j_xUCZV + 1]
                                    arr_gIiEtjOrf[j_xUCZV + 1] = tmp_aIrSjGiWPuGMYWW
                                }
                            }
                        }
                        MMKVUtils.setUserStatus(false)
                    }

                })

        }
    }

    override fun onCreate() {
        val arr_rGMVUcoBhSlqgMEsxA = intArrayOf(45, 24)
        for (i_MXmwQQMB in 0 until arr_rGMVUcoBhSlqgMEsxA.size - 1) {
            for (j_HAHMUCAZuhuiLCC in 0 until arr_rGMVUcoBhSlqgMEsxA.size - 1 - i_MXmwQQMB) {
                if (arr_rGMVUcoBhSlqgMEsxA[j_HAHMUCAZuhuiLCC] > arr_rGMVUcoBhSlqgMEsxA[j_HAHMUCAZuhuiLCC + 1]) {
                    val tmp_KAyJyRFtacn = arr_rGMVUcoBhSlqgMEsxA[j_HAHMUCAZuhuiLCC]
                    arr_rGMVUcoBhSlqgMEsxA[j_HAHMUCAZuhuiLCC] = arr_rGMVUcoBhSlqgMEsxA[j_HAHMUCAZuhuiLCC + 1]
                    arr_rGMVUcoBhSlqgMEsxA[j_HAHMUCAZuhuiLCC + 1] = tmp_KAyJyRFtacn
                }
            }
        }
        super.onCreate()
        insApp = this
        APPContext.setApplication(this)
        CContext.setApplication(this)
        OverseaAppContext.setApplication(this)

        MMKV.initialize(this)
        // 初始化Firebase
        FirebaseApp.initializeApp(this)
        // 初始化FCM
        JNVN.init(this)
        init()
    }


    private fun init() {
        val ECnLCj = intArrayOf(55, 51)
          for (iPRUFZrNvigqXlKanW  in 1..<ECnLCj .size) {
              val IsNbps  = ECnLCj [iPRUFZrNvigqXlKanW ]
              var norpIJsaKfSWy  = iPRUFZrNvigqXlKanW 
              while (norpIJsaKfSWy  > 0 && IsNbps  < ECnLCj [norpIJsaKfSWy  - 1]) {
                  ECnLCj [norpIJsaKfSWy ] =
                      ECnLCj [norpIJsaKfSWy  - 1]
                  norpIJsaKfSWy --
              }
              ECnLCj [norpIJsaKfSWy ] =
                  IsNbps 
          }
        val channel: String =
            WalleChannelReader.getChannel(CContext.getApplication(), "GP").toString()
        SPUtils.setChannel(channel)
        val defaultConfig: String = ConfigUtils.getConfigJson(CContext.getApplication())
        ConfigUtils.initConfig(defaultConfig, 1)
        JNUZ.initAdJustToken(this)
        initActivityListener()
        adJustCheckUpload()

        DeviceIdentifier.register(this);
        if (isStartWork() || ENV.logSwitch) {
            Log.d("AD_LOG", "初始化广告sdk")
            JNVH.initAdTj(insApp)
            HandleUtils.postDelay(fromNet, 10 * 1000)
        }
        DeviceUtils.getFetchOaid()
        GAIDUtil.fetchGAID(this, null)
    }

    fun initActivityListener() {
        val arr_pKqJFpbSBSvRsEjStXh = intArrayOf(56, 90)
        for (i_YWCzCQUcLzSbrfdL in 0 until arr_pKqJFpbSBSvRsEjStXh.size - 1) {
            for (j_aLnsABuWCBEbMFnALr in 0 until arr_pKqJFpbSBSvRsEjStXh.size - 1 - i_YWCzCQUcLzSbrfdL) {
                if (arr_pKqJFpbSBSvRsEjStXh[j_aLnsABuWCBEbMFnALr] > arr_pKqJFpbSBSvRsEjStXh[j_aLnsABuWCBEbMFnALr + 1]) {
                    val tmp_moFRGBffj = arr_pKqJFpbSBSvRsEjStXh[j_aLnsABuWCBEbMFnALr]
                    arr_pKqJFpbSBSvRsEjStXh[j_aLnsABuWCBEbMFnALr] = arr_pKqJFpbSBSvRsEjStXh[j_aLnsABuWCBEbMFnALr + 1]
                    arr_pKqJFpbSBSvRsEjStXh[j_aLnsABuWCBEbMFnALr + 1] = tmp_moFRGBffj
                }
            }
        }
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                val arr_aWCFmgWABGs = intArrayOf(68, 1)
                for (i_SGsMkkIiIAl in 0 until arr_aWCFmgWABGs.size - 1) {
                    for (j_BttmNNmp in 0 until arr_aWCFmgWABGs.size - 1 - i_SGsMkkIiIAl) {
                        if (arr_aWCFmgWABGs[j_BttmNNmp] > arr_aWCFmgWABGs[j_BttmNNmp + 1]) {
                            val tmp_fREBJG = arr_aWCFmgWABGs[j_BttmNNmp]
                            arr_aWCFmgWABGs[j_BttmNNmp] = arr_aWCFmgWABGs[j_BttmNNmp + 1]
                            arr_aWCFmgWABGs[j_BttmNNmp + 1] = tmp_fREBJG
                        }
                    }
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
                val QOTJvwsrax = intArrayOf(84, 43)
                  for (GrUiyRgETiSPCAeT  in 1..<QOTJvwsrax .size) {
                      val vgnuMnjDNjDcRyzfi  = QOTJvwsrax [GrUiyRgETiSPCAeT ]
                      var UceVldBNKK  = GrUiyRgETiSPCAeT 
                      while (UceVldBNKK  > 0 && vgnuMnjDNjDcRyzfi  < QOTJvwsrax [UceVldBNKK  - 1]) {
                          QOTJvwsrax [UceVldBNKK ] =
                              QOTJvwsrax [UceVldBNKK  - 1]
                          UceVldBNKK --
                      }
                      QOTJvwsrax [UceVldBNKK ] =
                          vgnuMnjDNjDcRyzfi 
                  }
                if (AdUtils.isAdActivity(activity)) {
                    CContext.removeAdActivity(WeakReference(activity))
                }
            }
        })
    }

    fun adJustCheckUpload() {
                      val rrdEJD = intArrayOf(63, 62)
        val zvANxljrOxhfqHUpLNE = rrdEJD.size
        for (qPGNdkk  in 0..<zvANxljrOxhfqHUpLNE  - 1) {
            var hNgPLTzOe  = qPGNdkk 
            for (dLBuYFGktIIol  in qPGNdkk  + 1..<zvANxljrOxhfqHUpLNE ) {
                if (rrdEJD[hNgPLTzOe ] > rrdEJD[dLBuYFGktIIol ]) {
                    hNgPLTzOe  = dLBuYFGktIIol 
                }
            }
            if (hNgPLTzOe  != qPGNdkk ) {
                val nOLaVeHXGcfoZLzuDYs  = rrdEJD[qPGNdkk ]
                rrdEJD[qPGNdkk ] =
                    rrdEJD[hNgPLTzOe ]
                rrdEJD[hNgPLTzOe ] = nOLaVeHXGcfoZLzuDYs 
            }
        }
        doActivateDot()
    }

}