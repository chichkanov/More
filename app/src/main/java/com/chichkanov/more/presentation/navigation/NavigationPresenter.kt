package com.chichkanov.more.presentation.navigation

import com.arellomobile.mvp.InjectViewState
import com.chichkanov.more.presentation.base.BaseMvpPresenter
import javax.inject.Inject

@InjectViewState
class NavigationPresenter @Inject constructor() : BaseMvpPresenter<NavigationView>(){

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.openNotes()
    }

}