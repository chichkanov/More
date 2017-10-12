package com.chichkanov.more.data.repository

import com.chichkanov.more.model.Note
import io.reactivex.Completable
import io.reactivex.Single

interface NotesRepository {

    fun insertNote(note: Note): Completable

    fun getAllNotes(): Single<List<Note>>

    fun getNote(noteId: Long): Single<Note>
}