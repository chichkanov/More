package com.chichkanov.more.presentation.navigation

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.chichkanov.more.App
import com.chichkanov.more.R
import com.chichkanov.more.presentation.note.NoteFragment

class NavigationActivity : MvpAppCompatActivity(), NavigationView {

    lateinit var presenter: NavigationPresenter

    @ProvidePresenter
    fun navigationPresenter(): NavigationPresenter = App.appComponent.getNavigationPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)
    }

    override fun openReminder(id: Long) {
        supportFragmentManager.beginTransaction()
                .replace(R.id.main_fragment_container, NoteFragment())
                .commit()
    }

}
