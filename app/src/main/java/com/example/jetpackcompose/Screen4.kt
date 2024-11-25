package com.example.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun Screen4(navController: NavController, viewModel: MainViewModel) {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Imię: ${viewModel.name}")                                                   // wyświetlenie danych z ViewModel
        Text(text = "Wiek: ${viewModel.age}")
        Button(onClick = { navController.popBackStack(Routes.screen1, inclusive = false) }) {    // cofnięcie do ekranu w stosie nawigacyjnym, ekran pozostanie w stosie
            Text(text = "Powrót")
        }
    }
}