package com.hishd.kotlindagger.model

import android.util.Log

class Battery {
    init {
        Log.i("Battery", "Battery has been Initialized")
    }

    fun getPower() {
        Log.i("Battery", "Battery power is available")
    }
}