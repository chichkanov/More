package com.chichkanov.more.presentation.note

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.chichkanov.more.App
import com.chichkanov.more.R

class NoteFragment : MvpAppCompatFragment(), NoteView {

    lateinit var presenter: NotePresenter

    @ProvidePresenter
    fun notePresenter(): NotePresenter = App.appComponent.getNotePresenter()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_note, container, false)
    }
}