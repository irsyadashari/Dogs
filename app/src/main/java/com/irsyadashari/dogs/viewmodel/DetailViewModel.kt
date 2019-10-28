package com.irsyadashari.dogs.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.irsyadashari.dogs.model.DogBreed

class DetailViewModel: ViewModel(){
    val dogLiveData = MutableLiveData<DogBreed>()

    fun fetch(){

    }
}