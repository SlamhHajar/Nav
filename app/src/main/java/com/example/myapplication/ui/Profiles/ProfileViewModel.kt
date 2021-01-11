package com.example.myapplication.ui.Profiles

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {

    private val textP = MutableLiveData<String>().apply {
        value = "This is Profiles Fragment"
    }
    val text: LiveData<String> = textP
}