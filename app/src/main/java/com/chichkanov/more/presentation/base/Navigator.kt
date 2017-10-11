package com.chichkanov.more.presentation.base

import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentTransaction
import com.chichkanov.more.R
import com.chichkanov.more.presentation.editnote.EditNoteFragment
import com.chichkanov.more.presentation.notes.NotesFragment

class Navigator {
    companion object {
        fun openNotes(activity: FragmentActivity) {
            activity.supportFragmentManager.beginTransaction()
                    .replace(R.id.main_fragment_container, NotesFragment.newInstance())
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .commit()
        }

        fun openEditNote(activity: FragmentActivity, noteId: Long) {
            activity.supportFragmentManager.beginTransaction()
                    .replace(R.id.main_fragment_container, EditNoteFragment.newInstance(noteId))
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .addToBackStack(null)
                    .commit()
        }
    }
}