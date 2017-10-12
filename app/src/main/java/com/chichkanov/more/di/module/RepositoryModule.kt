package com.chichkanov.more.di.module

import com.chichkanov.more.data.repository.NotesRepository
import com.chichkanov.more.data.repository.NotesRepositoryImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface RepositoryModule {

    @Singleton
    @Binds
    fun provideNotesRepository(notesRepositoryImpl: NotesRepositoryImpl): NotesRepository
}