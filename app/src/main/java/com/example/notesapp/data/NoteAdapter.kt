package com.example.notesapp.data

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.notesapp.R
import com.example.notesapp.common.Constant.CONTENT_KEY
import com.example.notesapp.common.Constant.TITLE_KEY
import com.example.notesapp.ui.NoteDetailsActivity

class NoteAdapter(private val list: List<Note>): RecyclerView.Adapter<NoteAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val headerTitle = view.findViewById<TextView>(R.id.headerTitle)
        val description = view.findViewById<TextView>(R.id.description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.note_custom_view,parent,false)
        return ViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.headerTitle.text = list[position].title
        holder.description.text = list[position].content
        holder.itemView.setOnClickListener { view ->
            val intent = Intent(view.context, NoteDetailsActivity::class.java)
            intent.putExtra(TITLE_KEY, list[position].title)
            intent.putExtra(CONTENT_KEY, list[position].content)
            view.context.startActivity(intent)
        }
    }
}