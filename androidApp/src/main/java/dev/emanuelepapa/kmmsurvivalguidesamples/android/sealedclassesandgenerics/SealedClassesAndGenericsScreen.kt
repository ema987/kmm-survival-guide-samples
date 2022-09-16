package dev.emanuelepapa.kmmsurvivalguidesamples.android.sealedclassesandgenerics

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import dev.emanuelepapa.kmmsurvivalguidesamples.sealedclassesandgenerics.KMMIntResult
import dev.emanuelepapa.kmmsurvivalguidesamples.sealedclassesandgenerics.KMMResult

@Composable
fun SealedClassesAndGenericsScreen(viewModel: SealedClassesAndGenericsScreenViewModel) {
    val state = viewModel.state.collectAsState().value
    Column {
        Row {
            Button(onClick = {
                viewModel.onGetRandomIntClicked()
            }) {
                Text(text = "getRandomInt")
            }
            val randomIntText = state.randomInt?.let {
                "Int: $it"
            } ?: "Tap the button"
            Text(text = randomIntText)
        }
        Row {
            Button(onClick = {
                viewModel.onGetRandomIntWrappedInIntResultClicked()
            }) {
                Text(text = "getRandomIntWrappedInIntResult")
            }
            val randomIntWrappedInIntResultText = when (val randomIntWrappedInIntResult = state.randomIntWrappedInIntResult) {
                is KMMIntResult.ErrorKMMIntResult -> {
                    "Error: ${randomIntWrappedInIntResult.throwable.message}"
                }
                is KMMIntResult.SuccessKMMIntResult -> {
                    "Success: ${randomIntWrappedInIntResult.value}"
                }
                null -> {
                    "Tap the button"
                }
            }
            Text(text = randomIntWrappedInIntResultText)
        }
        Row {
            Button(onClick = {
                viewModel.onGetRandomIntWrappedInResultClicked()
            }) {
                Text(text = "getRandomIntWrappedInResult")
            }
            val randomIntWrappedInResultText = when (val randomIntWrappedInResult = state.randomIntWrappedInResult) {
                is KMMResult.ErrorKMMResult -> {
                    "Error: ${randomIntWrappedInResult.throwable.message}"
                }
                is KMMResult.SuccessKMMResult -> {
                    "Success: ${randomIntWrappedInResult.value}"
                }
                null -> {
                    "Tap the button"
                }
            }
            Text(text = randomIntWrappedInResultText)
        }
    }
}