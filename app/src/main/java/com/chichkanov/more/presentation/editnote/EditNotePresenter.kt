package com.chichkanov.more.presentation.editnote

import com.arellomobile.mvp.InjectViewState
import com.chichkanov.more.domain.interactor.NotesInteractor
import com.chichkanov.more.model.Note
import com.chichkanov.more.presentation.base.BaseMvpPresenter
import timber.log.Timber
import javax.inject.Inject

@InjectViewState
class EditNotePresenter @Inject constructor(val notesInteractor: NotesInteractor) : BaseMvpPresenter<EditNoteView>() {

    fun onCloseClick(note: Note) {
        disposables.add(notesInteractor.insertNote(note)
                .subscribe({ Timber.d("Note added") },
                        { Timber.e("Note add error!") }))

        notesInteractor.insertNote(note)
        viewState.goBack()
    }
}