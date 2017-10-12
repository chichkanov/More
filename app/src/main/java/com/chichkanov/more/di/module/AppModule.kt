package com.chichkanov.more.di.module

import android.arch.persistence.room.Room
import android.content.Context
import com.chichkanov.more.App
import com.chichkanov.more.data.db.Db
import com.chichkanov.more.data.db.dao.NoteDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val app: App) {

    @Provides
    @Singleton
    fun provideAppContext(): Context = app

    @Provides
    @Singleton
    fun provideDb(context: Context): Db = Room.databaseBuilder(context, Db::class.java, "notes")
            .build()

    @Provides
    @Singleton
    fun provideNoteDao(db: Db): NoteDao = db.noteDao()
}