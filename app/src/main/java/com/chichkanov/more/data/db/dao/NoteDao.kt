package com.chichkanov.more.data.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.chichkanov.more.model.Note
import io.reactivex.Single

@Dao
interface NoteDao {

    @Query("SELECT * FROM Note")
    fun getAllNotes(): Single<List<Note>>

    @Insert
    fun insertNote(note: Note)

}