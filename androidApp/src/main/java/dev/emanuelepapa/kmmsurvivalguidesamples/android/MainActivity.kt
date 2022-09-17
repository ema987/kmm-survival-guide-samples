package dev.emanuelepapa.kmmsurvivalguidesamples.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.emanuelepapa.kmmsurvivalguidesamples.android.coroutines.CoroutinesScreen
import dev.emanuelepapa.kmmsurvivalguidesamples.android.coroutines.CoroutinesScreenViewModel
import dev.emanuelepapa.kmmsurvivalguidesamples.android.inlineclasses.InlineClassesScreen
import dev.emanuelepapa.kmmsurvivalguidesamples.android.inlineclasses.InlineClassesScreenViewModel
import dev.emanuelepapa.kmmsurvivalguidesamples.android.sealedclassesandgenerics.SealedClassesAndGenericsScreen
import dev.emanuelepapa.kmmsurvivalguidesamples.android.sealedclassesandgenerics.SealedClassesAndGenericsScreenViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val activity = this
            val navController = rememberNavController()
            Scaffold {
                NavHost(
                    navController,
                    startDestination = "Home"
                ) {
                    composable("Home") {
                        Column {
                            Button(onClick = {
                                navController.navigate("SealedClassesAndGenerics")
                            }) {
                                Text("Sealed classes and generics")
                            }
                            Button(onClick = {
                                navController.navigate("InlineClasses")
                            }) {
                                Text("Inline classes")
                            }
                            Button(onClick = {
                                navController.navigate("Coroutines")
                            }) {
                                Text("Coroutines")
                            }
                        }
                    }
                    composable("SealedClassesAndGenerics") {
                        SealedClassesAndGenericsScreen(viewModel = ViewModelProvider(activity)[SealedClassesAndGenericsScreenViewModel::class.java])
                    }
                    composable("InlineClasses") {
                        InlineClassesScreen(viewModel = ViewModelProvider(activity)[InlineClassesScreenViewModel::class.java])
                    }
                    composable("Coroutines") {
                        CoroutinesScreen(viewModel = ViewModelProvider(activity)[CoroutinesScreenViewModel::class.java])
                    }
                }
            }
        }
    }

}
