package com.chichkanov.more.domain.interactor

import com.chichkanov.more.data.repository.NotesRepository
import com.chichkanov.more.model.Note
import io.reactivex.Completable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class NotesInteractorImpl @Inject constructor(var notesRepository: NotesRepository) : NotesInteractor {

    override fun getNote(noteId: Long): Single<Note>
            = notesRepository.getNote(noteId)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())

    override fun getAllNotes(): Single<List<Note>>
            = notesRepository.getAllNotes()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())

    override fun insertNote(note: Note): Completable
            = notesRepository.insertNote(note)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
}