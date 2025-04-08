package com.example.birthdayreminder

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class GlobalData() : ViewModel() {
    data class User(val name: String, val date: String)

    var TotalList = mutableStateListOf<List<String>>()
        private set

    fun addText(text: List<String>) {
        TotalList.add(text)
        println(TotalList)
    }
}


