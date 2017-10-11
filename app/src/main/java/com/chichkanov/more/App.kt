package com.chichkanov.more

import android.app.Application
import com.chichkanov.more.di.component.AppComponent
import com.chichkanov.more.di.component.DaggerAppComponent
import com.chichkanov.more.di.module.AppModule
import com.facebook.stetho.Stetho
import com.squareup.leakcanary.LeakCanary
import timber.log.Timber

class App : Application() {

    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return
        }
        LeakCanary.install(this)
        Timber.plant(Timber.DebugTree())
        Stetho.initializeWithDefaults(this)
        initDatgger()
    }

    private fun initDatgger() {
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
        appComponent.inject(this)
    }
}