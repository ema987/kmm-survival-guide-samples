package dev.emanuelepapa.kmmsurvivalguidesamples.android.result

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState

@Composable
fun ResultScreen(viewModel: ResultScreenViewModel) {
    val state = viewModel.state.collectAsState().value
    Column {
        Button(onClick = { viewModel.onShowRandomDoubleClicked() }) {
            Text(text = "Show random double")
        }
        Text(text = state.formattedRandomDouble ?: "Not generated yet")
    }
}