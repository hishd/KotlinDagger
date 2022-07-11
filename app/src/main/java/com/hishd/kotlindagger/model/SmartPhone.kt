package com.hishd.kotlindagger.model

import android.util.Log

class SmartPhone(val battery: Battery, val simCard: SIMCard, val memoryCard: MemoryCard) {

    init {
        Log.i("SmartPhone", "Smartphone Initialized")
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailability()
    }

    fun makeCallWithRecording() {
        Log.i("SmartPhone", "Calling........!")
    }
}