package com.example.jetpackcompose

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class MainViewModel : ViewModel() {
    var name by mutableStateOf("")
    var age by mutableStateOf("")
}
