package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber

/**
 * @author Kulbaka Nataly
 * @date 16.07.2021
 */
class PusherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}