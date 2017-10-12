package com.chichkanov.more.presentation.navigation

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.chichkanov.more.App
import com.chichkanov.more.R
import com.chichkanov.more.presentation.base.Navigator
import timber.log.Timber

class NavigationActivity : MvpAppCompatActivity(), NavigationView {

    @InjectPresenter
    lateinit var presenter: NavigationPresenter

    @ProvidePresenter
    fun navigationPresenter(): NavigationPresenter = App.appComponent.getNavigationPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)
        if(savedInstanceState == null){
            openNotes()
        }
    }

    override fun openEditNote(id: Long) {
        Timber.d("Open note edit")
        Navigator.openEditNote(this, id)
    }

    override fun openNotes() {
        Timber.d("Open notes")
        Navigator.openNotes(this)
    }
}
