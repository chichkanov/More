package com.chichkanov.more.presentation.editnote

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import javax.inject.Inject

@InjectViewState
class EditNotePresenter @Inject constructor() : MvpPresenter<EditNoteView>() {

    fun onCloseClick() {
        viewState.goBack()
    }
}