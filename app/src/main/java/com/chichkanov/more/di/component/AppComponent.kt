package com.chichkanov.more.di.component

import com.chichkanov.more.App
import com.chichkanov.more.di.module.AppModule
import com.chichkanov.more.presentation.editnote.EditNotePresenter
import com.chichkanov.more.presentation.notes.NotesPresenter
import com.chichkanov.more.presentation.navigation.NavigationPresenter
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun inject(app: App)

    fun getNavigationPresenter(): NavigationPresenter
    fun getNotesPresenter(): NotesPresenter
    fun getEditNotePresenter(): EditNotePresenter
}
