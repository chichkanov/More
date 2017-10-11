package com.chichkanov.more.di.component

import com.chichkanov.more.App
import com.chichkanov.more.di.module.AppModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun inject(app: App)
}
