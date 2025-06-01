package com.example.notesapp.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notesapp.R
import com.example.notesapp.data.Note
import com.example.notesapp.data.NoteAdapter
import com.example.notesapp.databinding.ActivityNoteListBinding

class NotesListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityNoteListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v,insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left,systemBars.top,systemBars.right,systemBars.bottom)
            insets
        }
        val list = listOf(
            Note(
                title = "My notes 1",
                content = "My notes description"
            ),
            Note(
                title = "My notes 1",
                content = "My notes description"
            ),
            Note(
                title = "My notes 1",
                content = "My notes description"
            ),
            Note(
                title = "My notes 1",
                content = "My notes description"
            ),
            Note(
                title = "My notes 1",
                content = "My notes description"
            ),
            Note(
                title = "My notes 1",
                content = "My notes description"
            ),Note(
                title = "My notes 1",
                content = "My notes description"
            ),
            Note(
                title = "My notes 1",
                content = "My notes description"
            ),
            Note(
                title = "My notes 1",
                content = "My notes description"
            ),Note(
                title = "My notes 1",
                content = "My notes description"
            ),
            Note(
                title = "My notes 1",
                content = "My notes description"
            ),
            Note(
                title = "My notes 1",
                content = "My notes description"
            )
        )
        val adapter = NoteAdapter(list)
        binding.recyclerViewNotes.adapter = adapter
        binding.recyclerViewNotes.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
    }
}