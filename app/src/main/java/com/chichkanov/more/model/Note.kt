package com.chichkanov.more.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Note(val title: String,
                val text: String) {

    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}