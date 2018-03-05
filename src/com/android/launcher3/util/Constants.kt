package com.android.launcher3.util

import com.android.launcher3.BuildConfig

/**
 * @author Sviatoslav Koliesnik kolesniksy@gmail.com
 * @since 2/22/18
 */
interface Constants {

    companion object {
        val LOG_TAG = "aLog"
        val DEBUG = BuildConfig.DEBUG
        val MAX_LOG_SIZE = 4_000
    }
}