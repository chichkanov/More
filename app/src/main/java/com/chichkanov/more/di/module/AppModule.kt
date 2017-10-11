package com.chichkanov.more.di.module

import android.content.Context
import com.chichkanov.more.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val app: App) {

    @Provides
    @Singleton
    fun provideAppContext(): Context = app
}