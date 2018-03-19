package com.android.launcher3.util

import android.content.Context
import android.content.SharedPreferences
import android.util.Log

/**
 * @author Sviatoslav Koliesnik kolesniksy@gmail.com
 * @since 2/22/18
 */
class Utils {

    companion object {

        @JvmStatic
        fun toLog(s: String?) {
            if (Constants.DEBUG) {
                if (s != null && s.length > Constants.MAX_LOG_SIZE) {
                    Log.d(Constants.LOG_TAG, s.substring(0, Constants.MAX_LOG_SIZE))
                    toLog(s.substring(Constants.MAX_LOG_SIZE))
                } else {
                    Log.d(Constants.LOG_TAG, s)
                }
            }
        }

        @JvmStatic
        fun getSharedPreferences(context: Context): SharedPreferences? = context.getSharedPreferences("mysettings", Context.MODE_PRIVATE)
    }
}