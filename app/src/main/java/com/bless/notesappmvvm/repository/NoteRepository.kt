package com.bless.notesappmvvm.repository

import com.bless.notesappmvvm.DB.NoteDatabase
import com.bless.notesappmvvm.model.Note

class NoteRepository (private val db:NoteDatabase){
    fun  getNote()=db.getNoteDao().getAllNote();
    fun  searchNote(query:String)=db.getNoteDao().searchNote(query);
    suspend   fun deleteNote(note:Note)=db.getNoteDao().delete(note)
    suspend   fun addNote(note:Note)=db.getNoteDao().addNote(note)
    suspend   fun updateNote(note:Note)=db.getNoteDao().updateNote(note)

}