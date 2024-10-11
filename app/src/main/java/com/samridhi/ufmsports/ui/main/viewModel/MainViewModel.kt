package com.samridhi.ufmsports.ui.main.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.samridhi.ufmsports.network.model.CurrentOffers
import com.samridhi.ufmsports.network.model.Hi
import com.samridhi.ufmsports.network.model.OfferListItem
import com.samridhi.ufmsports.network.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel
@Inject
constructor(
    private val repository: MainRepository
) : ViewModel(){

    private val _sportsData: MutableLiveData<Hi> = MutableLiveData()

    val sportsData: LiveData<Hi> get() = _sportsData

    init {
        getAllSportsData()
    }

    private  fun getAllSportsData(){
        viewModelScope.launch {
            val result = repository.getSportsData()
            _sportsData.value = result
        }
    }
}




