package dev.emanuelepapa.kmmsurvivalguidesamples.android.inlineclasses

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState

@Composable
fun InlineClassesScreen(viewModel: InlineClassesScreenViewModel) {
    val state = viewModel.state.collectAsState().value
    Column {
        Button(onClick = { viewModel.onShowMyNameClicked() }) {
            Text(text = "Show my name!")
        }
        val text = state.formattedName?.let {
            "My name is: $it"
        } ?: "My name is..."
        Text(text = text)
    }
}