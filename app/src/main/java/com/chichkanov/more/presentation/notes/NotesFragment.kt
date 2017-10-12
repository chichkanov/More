package com.chichkanov.more.presentation.notes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.chichkanov.more.App
import com.chichkanov.more.R
import com.chichkanov.more.presentation.base.Navigator
import kotlinx.android.synthetic.main.fragment_notes.*
import timber.log.Timber

class NotesFragment : MvpAppCompatFragment(), NotesView {

    companion object {
        fun newInstance(): NotesFragment = NotesFragment()
    }

    @InjectPresenter
    lateinit var presenter: NotesPresenter

    @ProvidePresenter
    fun notesPresenter(): NotesPresenter = App.appComponent.getNotesPresenter()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_notes, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fab_notes_add_note.setOnClickListener({
            Timber.d("Fab clicked")
            Navigator.openEditNote(activity, 0)
        })
    }
}