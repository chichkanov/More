package com.chichkanov.more.presentation.notes

import com.arellomobile.mvp.MvpView
import com.chichkanov.more.model.Note

interface NotesView : MvpView{

    fun updateNotes(dataset: List<Note>)
}