package com.chichkanov.more.domain.interactor

import com.chichkanov.more.model.Note
import io.reactivex.Completable
import io.reactivex.Single

interface NotesInteractor {

    fun insertNote(note: Note): Completable

    fun getAllNotes(): Single<List<Note>>

    fun getNote(noteId: Long): Single<Note>
}