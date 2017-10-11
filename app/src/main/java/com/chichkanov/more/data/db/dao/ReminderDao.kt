package com.chichkanov.more.data.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.chichkanov.more.model.Reminder
import io.reactivex.Single

@Dao
interface ReminderDao {

    @Query("SELECT * FROM Reminder")
    fun getAllReminders(): Single<List<Reminder>>

}