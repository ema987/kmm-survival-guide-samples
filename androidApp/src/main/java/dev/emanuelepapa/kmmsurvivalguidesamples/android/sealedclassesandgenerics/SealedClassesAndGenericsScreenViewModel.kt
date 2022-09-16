package dev.emanuelepapa.kmmsurvivalguidesamples.android.sealedclassesandgenerics

import androidx.lifecycle.ViewModel
import dev.emanuelepapa.kmmsurvivalguidesamples.sealedclassesandgenerics.getRandomInt
import dev.emanuelepapa.kmmsurvivalguidesamples.sealedclassesandgenerics.getRandomIntWrappedInIntResult
import dev.emanuelepapa.kmmsurvivalguidesamples.sealedclassesandgenerics.getRandomIntWrappedInResult
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SealedClassesAndGenericsScreenViewModel: ViewModel() {

    private val mutableState = MutableStateFlow(SealedClassesAndGenericScreenState(randomInt = null, randomIntWrappedInIntResult = null, randomIntWrappedInResult = null))
    val state: StateFlow<SealedClassesAndGenericScreenState> = mutableState

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