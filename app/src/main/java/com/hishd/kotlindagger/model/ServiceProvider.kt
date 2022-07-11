package com.hishd.kotlindagger.model

import android.util.Log

class ServiceProvider {
    init {
        Log.i("Service Provider", "Service Provider is Initialized")
    }

    fun getServiceProvider() {
        Log.i("Service Provider", "Service Provider Connected")
    }
}