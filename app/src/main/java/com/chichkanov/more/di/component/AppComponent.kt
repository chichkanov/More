package com.chichkanov.more.di.component

import com.chichkanov.more.App
import com.chichkanov.more.di.module.AppModule
import com.chichkanov.more.presentation.navigation.NavigationPresenter
import com.chichkanov.more.presentation.note.NotePresenter
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun inject(app: App)

    fun getNavigationPresenter(): NavigationPresenter
    fun getNotePresenter(): NotePresenter
}
