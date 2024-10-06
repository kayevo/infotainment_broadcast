package com.kayevo.infotainmentbroadcast.view.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Settings

class InternetBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        intent?.let {
            context?.let {
                if (intent.action == Intent.ACTION_AIRPLANE_MODE_CHANGED) {
                    println("Airplane mode enabled: ${getIsAirplaneModeEnabled(context)}")
                }
            }
        }
    }

    private fun getIsAirplaneModeEnabled(context: Context): Boolean{
        return Settings.Global.getInt(
            context.contentResolver,
            Settings.Global.AIRPLANE_MODE_ON
        ) != 0
    }
}