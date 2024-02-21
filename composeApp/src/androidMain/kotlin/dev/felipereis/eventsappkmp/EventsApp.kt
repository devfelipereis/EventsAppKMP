package dev.felipereis.eventsappkmp

import android.app.Application
import di.initKoin

class EventsApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}