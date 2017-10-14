package com.chichkanov.more.presentation.notes

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chichkanov.more.R
import com.chichkanov.more.model.Note
import kotlinx.android.synthetic.main.item_note.view.*

class NotesAdapter constructor(var dataset: List<Note>, val listener: (Note) -> Unit) : RecyclerView.Adapter<NotesAdapter.Holder>() {

    override fun onBindViewHolder(holder: Holder, position: Int) = holder.bind(dataset[position])

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder
            = Holder(LayoutInflater.from(parent?.context).inflate(R.layout.item_note, parent, false), listener)

    override fun getItemCount(): Int = dataset.size

    class Holder(itemView: View, val listener: (Note) -> Unit) : RecyclerView.ViewHolder(itemView) {

        fun bind(note: Note) {
            with(note) {
                itemView.tv_item_note_title.text = note.title
                itemView.tv_item_note_desc.text = note.text
                itemView.setOnClickListener({ listener(this) })
            }
        }
    }
}