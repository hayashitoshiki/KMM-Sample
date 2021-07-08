package com.example.kmmsampleandroid.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kmmsharedmodule.usecase.HumanUseCase
import kotlinx.coroutines.launch

class DashboardViewModel(private val humanUseCase: HumanUseCase) : ViewModel() {

    private val _text1 = MutableLiveData("")
    val text: LiveData<String> = _text1
    private val _text2 = MutableLiveData("")
    val text2 : LiveData<String> = _text2
    private val _text3 = MutableLiveData("")
    val text3 : LiveData<String> = _text3

    init {
        val human1 = humanUseCase.bornHuman()
        _text1.value = human1.toString()
        val human2 = humanUseCase.getHumanRandam()
        _text2.value = human2.toString()
        viewModelScope.launch {
            val human3 = humanUseCase.getHumanFirst()
            _text3.value = human3.toString()
        }
    }
}