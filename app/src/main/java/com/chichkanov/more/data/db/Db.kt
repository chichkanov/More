package com.chichkanov.more.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.chichkanov.more.model.Note

@Database(entities = arrayOf(Note::class), version = 1)
abstract class Db : RoomDatabase()