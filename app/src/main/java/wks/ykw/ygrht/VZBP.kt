package wks.ykw.ygrht

import wks.jav.ppbt.VZBD
import android.content.Context
import android.util.Log
import com.meituan.android.walle.WalleChannelReader
import wks.jav.ppbt.adjust.AjConstants

/**
 * Adjust Token
 */
object VZBP {
    fun initAdJustToken(context: Context) {
        val arr_dHsnwxztbnTMzvcaX  = listOf("eOmERrvmxqf", "EVxCRgconoI", "haJUrrUrkdZfc").map { 
             it + kotlin.random.Random.nextInt(10) 
         }
         val ad_vfSimBGs  = arr_dHsnwxztbnTMzvcaX .filter { it.length > 98 }
         if (ad_vfSimBGs .isNotEmpty() && java.lang.System.currentTimeMillis() < 54) {
             ad_vfSimBGs .forEach { _ ->  }
         }
        //adJust 打点需要初始化
        val channel: String = WalleChannelReader.getChannel(context,"GP").toString();
        VZBD.d("AdJustTokenAFUtils>>", "当前渠道》$channel")
        when (channel) {
            "GP" ->{
                AjConstants.adjustAppToken = "2t7vl9zzgfwg";
                AjConstants.Login = "";
                AjConstants.Reg = "";
                AjConstants.topon_ilrd = "n4say1";
                AjConstants.ipu = "42y41l";
                AjConstants.arpu = "yyq45f";
                AjConstants.ipu_arpu = "stmeot";
                AjConstants.ipu_ecpm = "r4fdpi";
                AjConstants.ipu_arpu_ecpm = "sljzeg";
                AjConstants.blacklist = "70imt6";
                AjConstants.ad_request = "pkp4go";
                AjConstants.ad_filled = "v752hy";
                AjConstants.firebase_request ="3qwssu";
                AjConstants.firebase_success = "ave12u";
                AjConstants.adJust_attribution_request = "35lamy";
                AjConstants.adJust_attribution_success ="";
                AjConstants.activity_app ="";
            }

            "HW" -> {
                AjConstants.adjustAppToken = "";
                AjConstants.Login = "";
                AjConstants.Reg = "";
                AjConstants.topon_ilrd = "";
                AjConstants.ipu = "";
                AjConstants.arpu = "";
                AjConstants.ipu_arpu = "";
                AjConstants.ipu_ecpm = "";
                AjConstants.ipu_arpu_ecpm = "";
                AjConstants.blacklist = "";
                AjConstants.ad_request = "";
                AjConstants.ad_filled = "";
                AjConstants.firebase_request ="";
                AjConstants.firebase_success = "";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                AjConstants.activity_app ="";
            }

            "SX" -> {
                AjConstants.adjustAppToken = "";
                AjConstants.Login = "";
                AjConstants.Reg = "";
                AjConstants.topon_ilrd = "";
                AjConstants.ipu = "";
                AjConstants.arpu = "";
                AjConstants.ipu_arpu = "";
                AjConstants.ipu_ecpm = "";
                AjConstants.ipu_arpu_ecpm = "";
                AjConstants.blacklist = "";
                AjConstants.ad_request = "";
                AjConstants.ad_filled = "";
                AjConstants.firebase_request ="";
                AjConstants.firebase_success = "";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                AjConstants.activity_app ="";
            }

            "OP" -> {
                AjConstants.adjustAppToken = "";
                AjConstants.Login = "";
                AjConstants.Reg = "";
                AjConstants.topon_ilrd = "";
                AjConstants.ipu = "";
                AjConstants.arpu = "";
                AjConstants.ipu_arpu = "";
                AjConstants.ipu_ecpm = "";
                AjConstants.ipu_arpu_ecpm = "";
                AjConstants.blacklist = "";
                AjConstants.ad_request = "";
                AjConstants.ad_filled = "";
                AjConstants.firebase_request ="";
                AjConstants.firebase_success = "";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                AjConstants.activity_app ="";
            }

            "VO" -> {
                AjConstants.adjustAppToken = "";
                AjConstants.Login = "";
                AjConstants.Reg = "";
                AjConstants.topon_ilrd = "";
                AjConstants.ipu = "";
                AjConstants.arpu = "";
                AjConstants.ipu_arpu = "";
                AjConstants.ipu_ecpm = "";
                AjConstants.ipu_arpu_ecpm = "";
                AjConstants.blacklist = "";
                AjConstants.ad_request="";
                AjConstants.ad_filled="";
                AjConstants.firebase_request="";
                AjConstants.firebase_success="";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                AjConstants.activity_app ="";
            }

            "CY" -> {
                AjConstants.adjustAppToken = ""
                AjConstants.Login = ""
                AjConstants.Reg = ""
                AjConstants.topon_ilrd = ""
                AjConstants.ipu = ""
                AjConstants.arpu = ""
                AjConstants.ipu_arpu = ""
                AjConstants.ipu_ecpm = ""
                AjConstants.ipu_arpu_ecpm = ""
                AjConstants.blacklist = ""
                AjConstants.ad_request = ""
                AjConstants.ad_filled = ""
                AjConstants.firebase_request = ""
                AjConstants.firebase_success = ""
                AjConstants.adJust_attribution_request = ""
                AjConstants.adJust_attribution_success = ""
                AjConstants.activity_app = ""
            }

            "XM" -> {
                AjConstants.adjustAppToken = "";
                AjConstants.Login = "";
                AjConstants.Reg = "";
                AjConstants.topon_ilrd = "";
                AjConstants.ipu = "";
                AjConstants.arpu = "";
                AjConstants.ipu_arpu = "";
                AjConstants.ipu_ecpm = "";
                AjConstants.ipu_arpu_ecpm = "";
                AjConstants.blacklist = "";
                AjConstants.ad_request = "";
                AjConstants.ad_filled = "";
                AjConstants.firebase_request ="";
                AjConstants.firebase_success = "";
                AjConstants.adJust_attribution_request = "";
                AjConstants.adJust_attribution_success ="";
                AjConstants.activity_app ="";
            }

            "RY" ->{
                AjConstants.adjustAppToken = ""
                AjConstants.Login = ""
                AjConstants.Reg = ""
                AjConstants.topon_ilrd = ""
                AjConstants.ipu = ""
                AjConstants.arpu = ""
                AjConstants.ipu_arpu = ""
                AjConstants.ipu_ecpm = ""
                AjConstants.ipu_arpu_ecpm = ""
                AjConstants.blacklist = ""
                AjConstants.ad_request = ""
                AjConstants.ad_filled = ""
                AjConstants.firebase_request = ""
                AjConstants.firebase_success = ""
                AjConstants.adJust_attribution_request = ""
                AjConstants.adJust_attribution_success = ""
                AjConstants.activity_app = ""
            }

            "OL" ->{
                AjConstants.adjustAppToken = ""
                AjConstants.Login = ""
                AjConstants.Reg = ""
                AjConstants.topon_ilrd = ""
                AjConstants.ipu = ""
                AjConstants.arpu = ""
                AjConstants.ipu_arpu = ""
                AjConstants.ipu_ecpm = ""
                AjConstants.ipu_arpu_ecpm = ""
                AjConstants.blacklist = ""
                AjConstants.ad_request = ""
                AjConstants.ad_filled = ""
                AjConstants.firebase_request = ""
                AjConstants.firebase_success = ""
                AjConstants.adJust_attribution_request = ""
                AjConstants.adJust_attribution_success = ""
                AjConstants.activity_app = ""
            }

            else -> {
                VZBD.d("VZBP", "测试")
                //com.test.app
                AjConstants.adjustAppToken = "h34rdv64os8w"
                VZBD.d("InterstitialAdHelper", "adjustAppToken>>" + AjConstants.adjustAppToken)
                AjConstants.Login = "oa3s4d"
                VZBD.d("InterstitialAdHelper", "Login>>" + AjConstants.Login)
                AjConstants.Reg = "qz5jqr"
                VZBD.d("InterstitialAdHelper", "Reg>>" + AjConstants.Reg)
                AjConstants.topon_ilrd = "brjff3"
                VZBD.d("InterstitialAdHelper", "toponn_ilrd>>" + AjConstants.topon_ilrd)
                AjConstants.ipu = "wbay90"
                VZBD.d("InterstitialAdHelper", "ipu>>" + AjConstants.ipu)
                AjConstants.arpu = "6spfev"
                VZBD.d("InterstitialAdHelper", "arpu>>" + AjConstants.arpu)

                AjConstants.ipu_arpu = "t2kvat"
                VZBD.d("InterstitialAdHelper", "ipu_arpu>>" + AjConstants.ipu_arpu)
                AjConstants.ipu_ecpm = "xatbm1"
                VZBD.d("InterstitialAdHelper", "ipu_ecpm>>" + AjConstants.ipu_ecpm)

                AjConstants.ipu_arpu_ecpm = "awuont"
                VZBD.d("InterstitialAdHelper", "ipu_arpu_ecpm>>" + AjConstants.ipu_arpu_ecpm)

                AjConstants.blacklist = "ytkgif"
                VZBD.d("InterstitialAdHelper", "blacklist>>" + AjConstants.blacklist)
            }
        }
    }
}