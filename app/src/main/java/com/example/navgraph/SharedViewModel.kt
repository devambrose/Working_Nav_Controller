package com.example.navgraph

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class SharedViewModel(application: Application):AndroidViewModel(application) {
    val dataToShare = MutableLiveData<String>()

    fun updateData(item:String){
        dataToShare.value=item
    }
}