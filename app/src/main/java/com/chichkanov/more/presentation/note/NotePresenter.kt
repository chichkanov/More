package com.chichkanov.more.presentation.note

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import javax.inject.Inject

@InjectViewState
class NotePresenter @Inject constructor() : MvpPresenter<NoteView>()