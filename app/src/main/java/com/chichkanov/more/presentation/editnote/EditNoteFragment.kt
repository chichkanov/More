package com.chichkanov.more.presentation.editnote

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
import kotlinx.android.synthetic.main.fragment_edit_note.*

class EditNoteFragment : MvpAppCompatFragment(), EditNoteView {

    companion object {
        fun newInstance(noteId: Long): EditNoteFragment = EditNoteFragment()
    }

    @InjectPresenter
    lateinit var presenter: EditNotePresenter

    @ProvidePresenter
    fun editNotePresenter(): EditNotePresenter = App.appComponent.getEditNotePresenter()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_edit_note, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ib_edit_note_close.setOnClickListener({ presenter.onCloseClick() })
    }

    override fun goBack() {
        Navigator.openNotes(activity)
        /*SpectrumDialog.Builder(activity)
                .setColors(R.array.note_color_palette)
                .build()
                .show(activity.supportFragmentManager, "")*/
    }

    override fun showColorPalette() {

    }
}
