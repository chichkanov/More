package com.chichkanov.more.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Reminder(@PrimaryKey val id: Long,
                    val title: String,
                    val text: String)