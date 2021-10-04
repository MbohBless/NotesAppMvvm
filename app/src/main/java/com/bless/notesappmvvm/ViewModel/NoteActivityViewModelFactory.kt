package com.bless.notesappmvvm.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bless.notesappmvvm.repository.NoteRepository

class NoteActivityViewModelFactory(private val repository: NoteRepository) :ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NoteActivityViewModel(repository)as T
    }
}