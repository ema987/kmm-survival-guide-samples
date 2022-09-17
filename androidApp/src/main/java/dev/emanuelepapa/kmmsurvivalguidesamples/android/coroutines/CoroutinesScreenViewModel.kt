package dev.emanuelepapa.kmmsurvivalguidesamples.android.coroutines

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.emanuelepapa.kmmsurvivalguidesamples.coroutines.CoroutinesProfileFormatter
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CoroutinesScreenViewModel : ViewModel() {

    private val mutableState = MutableStateFlow(
        CoroutinesScreenState(
            formattedName = null
        )
    )
    val state: StateFlow<CoroutinesScreenState> = mutableState
    private val coroutinesProfileFormatter = CoroutinesProfileFormatter()

    fun onShowMyNameClicked() {
        viewModelScope.launch {
            mutableState.value = mutableState.value.copy(
                formattedName = coroutinesProfileFormatter.formatFirstAndLastNameWithCoroutines(
                    "John",
                    "Doe"
                )
            )
        }
    }

}