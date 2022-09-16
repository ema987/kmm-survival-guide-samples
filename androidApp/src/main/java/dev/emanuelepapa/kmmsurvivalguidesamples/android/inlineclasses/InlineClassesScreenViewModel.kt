package dev.emanuelepapa.kmmsurvivalguidesamples.android.inlineclasses

import androidx.lifecycle.ViewModel
import dev.emanuelepapa.kmmsurvivalguidesamples.inline.FirstName
import dev.emanuelepapa.kmmsurvivalguidesamples.inline.LastName
import dev.emanuelepapa.kmmsurvivalguidesamples.inline.formatFirstAndLastName
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class InlineClassesScreenViewModel : ViewModel() {

    private val mutableState = MutableStateFlow(
        InlineClassesScreenState(
            formattedName = null
        )
    )
    val state: StateFlow<InlineClassesScreenState> = mutableState

    fun onShowMyNameClicked() {
        mutableState.value = mutableState.value.copy(
            formattedName = formatFirstAndLastName(
                FirstName("John"),
                LastName("Doe")
            )
        )
    }

}