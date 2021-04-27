package com.example.nasmanila.manager

import android.app.Activity
import android.content.Context
import android.net.ConnectivityManager

class AppUtils {
    fun checkInternet(context: Context): Boolean {
        val connectivityManager =  context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val netInfo = connectivityManager.activeNetworkInfo
//        if (netInfo != null && netInfo.isConnectedOrConnecting) 
        return netInfo != null && netInfo.isConnected
//        if (netInfo != null && netInfo.isConnected)
//            return true
//        else
//            return false

    }
//    fun GetAccessTokenInterface {
//        public fun getAccessToken()
//    }
open fun showDialogAlertDismiss(
    activity: Activity?,
    msgHead: String?,
    msg: String?,
    ico: Int,
    bgIcon: Int
) {
    /*val dialog = Dialog(activity!!)
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    dialog.setCancelable(false)
    dialog.setContentView(R.layout.alert_dialogue_ok_layout)
    val icon = dialog.findViewById<View>(R.id.iconImageView) as ImageView
    icon.setBackgroundResource(bgIcon)
    icon.setImageResource(ico)
    val text = dialog.findViewById<View>(R.id.text_dialog) as TextView
    val textHead = dialog.findViewById<View>(R.id.alertHead) as TextView
    text.text = msg
    textHead.text = msgHead
    val dialogButton = dialog.findViewById<View>(R.id.btn_Ok) as Button
    dialogButton.setOnClickListener { dialog.dismiss() }
    dialog.show()*/
}

}