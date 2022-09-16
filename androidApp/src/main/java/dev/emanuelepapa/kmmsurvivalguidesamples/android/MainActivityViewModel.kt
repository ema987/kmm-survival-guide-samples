package dev.emanuelepapa.kmmsurvivalguidesamples.android

import androidx.lifecycle.ViewModel
import dev.emanuelepapa.kmmsurvivalguidesamples.generics.getRandomInt
import dev.emanuelepapa.kmmsurvivalguidesamples.generics.getRandomIntWrappedInIntResult
import dev.emanuelepapa.kmmsurvivalguidesamples.generics.getRandomIntWrappedInResult
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainActivityViewModel: ViewModel() {

    private val mutableState = MutableStateFlow(MainActivityState(randomInt = null, randomIntWrappedInIntResult = null, randomIntWrappedInResult = null))
    val state: StateFlow<MainActivityState> = mutableState

    fun onGetRandomIntClicked() {
        getRandomInt().run {
            mutableState.value = mutableState.value.copy(randomInt = this)
        }
    }

    fun onGetRandomIntWrappedInIntResultClicked() {
        getRandomIntWrappedInIntResult().run {
            mutableState.value = mutableState.value.copy(randomIntWrappedInIntResult = this)
        }
    }

    fun onGetRandomIntWrappedInResultClicked() {
        getRandomIntWrappedInResult().run {
            mutableState.value = mutableState.value.copy(randomIntWrappedInResult = this)
        }
    }

}