package com.chichkanov.more.data.repository

import com.chichkanov.more.data.db.dao.NoteDao
import com.chichkanov.more.model.Note
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

class NotesRepositoryImpl @Inject constructor(val notesDao: NoteDao) : NotesRepository {

    override fun insertNote(note: Note): Completable
            = Completable.fromAction({ notesDao.insertNote(note) })

    override fun getAllNotes(): Single<List<Note>>
            = notesDao.getAllNotes()

    override fun getNote(noteId: Long): Single<Note>
            = notesDao.getNote(noteId)
}
