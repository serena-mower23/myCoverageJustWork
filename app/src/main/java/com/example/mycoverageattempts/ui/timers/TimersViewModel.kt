package com.example.mycoverageattempts.ui.timers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TimersViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is timers Fragment"
    }
    val text: LiveData<String> = _text
}