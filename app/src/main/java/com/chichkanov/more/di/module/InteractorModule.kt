package com.chichkanov.more.di.module

import com.chichkanov.more.domain.interactor.NotesInteractor
import com.chichkanov.more.domain.interactor.NotesInteractorImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface InteractorModule {

    @Singleton
    @Binds
    fun provideNotesInteractor(notesInteractorImpl: NotesInteractorImpl): NotesInteractor
}