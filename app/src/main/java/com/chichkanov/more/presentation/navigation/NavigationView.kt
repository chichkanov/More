package com.chichkanov.more.presentation.navigation

import com.arellomobile.mvp.MvpView

interface NavigationView : MvpView {

    fun openReminder(id: Long)
}