package dev.emanuelepapa.kmmsurvivalguidesamples.android.thirdparty

import androidx.lifecycle.ViewModel
import dev.emanuelepapa.kmmsurvivalguidesamples.thirdparty.SystemInformationRetrieverImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ThirdPartyScreenViewModel : ViewModel() {

    private val mutableState = MutableStateFlow(
        ThirdPartyScreenState(
            systemName = null
        )
    )
    val state: StateFlow<ThirdPartyScreenState> = mutableState

    private val systemInformationRetriever =
        SystemInformationRetrieverImpl(SystemInformationRetrieverAndroid())

    fun onShowSystemNameClicked() {
        mutableState.value =
            mutableState.value.copy(systemName = systemInformationRetriever.getSystemName())
    }

}