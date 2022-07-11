package com.hishd.kotlindagger.model

import android.util.Log

class SIMCard(private val serviceProvider: ServiceProvider) {
    init {
        Log.i("SIM Card", "SIM Card is Initialized")
    }

    fun getConnection() {
        serviceProvider.getServiceProvider()
    }
}