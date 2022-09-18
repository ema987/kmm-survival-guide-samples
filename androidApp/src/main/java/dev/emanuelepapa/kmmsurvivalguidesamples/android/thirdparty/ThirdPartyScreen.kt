package dev.emanuelepapa.kmmsurvivalguidesamples.android.thirdparty

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState

@Composable
fun ThirdPartyScreen(viewModel: ThirdPartyScreenViewModel) {
    val state = viewModel.state.collectAsState().value
    Column {
        Button(onClick = { viewModel.onShowSystemNameClicked() }) {
            Text(text = "Show system name")
        }
        Text(text = state.systemName ?: "Not retrieved yet")
    }
}