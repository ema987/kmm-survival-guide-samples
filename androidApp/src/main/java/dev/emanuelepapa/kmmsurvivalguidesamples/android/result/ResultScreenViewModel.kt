package dev.emanuelepapa.kmmsurvivalguidesamples.android.result

import androidx.lifecycle.ViewModel
import dev.emanuelepapa.kmmsurvivalguidesamples.result.getRandomDouble
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ResultScreenViewModel : ViewModel() {

    private val mutableState = MutableStateFlow(
        ResultScreenState(
            formattedRandomDouble = null
        )
    )
    val state: StateFlow<ResultScreenState> = mutableState

    fun onShowRandomDoubleClicked() {
        val randomDouble = getRandomDouble()
        randomDouble.fold(onSuccess = { double ->
            mutableState.value = mutableState.value.copy(formattedRandomDouble = double.toString())
        }, onFailure = { throwable ->
            mutableState.value = mutableState.value.copy(formattedRandomDouble = throwable.toString())
        })
    }

}