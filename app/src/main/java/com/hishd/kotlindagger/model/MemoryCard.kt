package com.hishd.kotlindagger.model

import android.util.Log

class MemoryCard {
    init {
        Log.i("Memory Card", "Memory Card is Initialized")
    }

    fun getSpaceAvailability() {
        Log.i("Memory Card", "Memory Space is Available")
    }
}