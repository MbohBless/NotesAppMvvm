package com.bless.notesappmvvm.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bless.notesappmvvm.model.Note
import com.bless.notesappmvvm.repository.NoteRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NoteActivityViewModel(private val repository: NoteRepository) :ViewModel(){
    fun  saveNote(newNote:Note)=viewModelScope.launch (Dispatchers.IO){
        repository.addNote(newNote)
    }
    fun  updateNote(existingNote:Note)=viewModelScope.launch (Dispatchers.IO){
        repository.updateNote(existingNote)
    }
    fun  deleteNote(existingNote: Note)=viewModelScope.launch (Dispatchers.IO){
        repository.addNote(existingNote)
    }
    fun searchNote(query:String):LiveData<List<Note>>{
        return repository.searchNote(query)
    }
    fun  getAllNotes():LiveData<List<Note>> =repository.getNote()
}