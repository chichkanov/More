package com.chichkanov.more.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.chichkanov.more.model.Reminder

@Database(entities = arrayOf(Reminder::class), version = 1)
abstract class Db : RoomDatabase()