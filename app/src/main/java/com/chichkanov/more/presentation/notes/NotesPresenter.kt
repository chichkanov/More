package com.chichkanov.more.presentation.notes

import com.arellomobile.mvp.InjectViewState
import com.chichkanov.more.domain.interactor.NotesInteractor
import com.chichkanov.more.presentation.base.BaseMvpPresenter
import timber.log.Timber
import javax.inject.Inject

@InjectViewState
class NotesPresenter @Inject constructor(val notesInteractor: NotesInteractor) : BaseMvpPresenter<NotesView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        disposables.add(notesInteractor.getAllNotes()
                .subscribe({ notes ->
                    viewState.updateNotes(notes)
                    Timber.d(notes.toString())
                },
                        { Timber.e("Error load notes") }))
    }
}