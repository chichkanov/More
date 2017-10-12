package com.chichkanov.more.presentation.navigation

import com.arellomobile.mvp.MvpView

interface NavigationView : MvpView {

    fun openEditNote(id: Long)

    fun openNotes()
}