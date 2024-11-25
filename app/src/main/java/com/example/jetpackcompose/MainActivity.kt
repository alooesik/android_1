package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.CompositionLocalProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()     // zarządza przejściami między ekranami
            val viewModel: MainViewModel = viewModel()      // przechowuje dane dla wszystkich ekranów

            NavHost(                                        // mapa nawigacji - każdy ekran ma swoją ścieżkę
                navController = navController,
                startDestination = Routes.screen1           // ekran początkowy
            ) {
                composable(Routes.screen1) {
                    Screen1(navController)
                }
                composable(Routes.screen2) {
                    Screen2(navController, viewModel)
                }
                composable(Routes.screen3) {
                    Screen3(navController, viewModel)
                }
                composable(Routes.screen4) {
                    Screen4(navController, viewModel)
                }
            }
        }
    }
}