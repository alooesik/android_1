package com.example.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun Screen2(navController: NavController, viewModel: MainViewModel) {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Wprowadź imię:")
        TextField(
            value = viewModel.name,                    // powiązanie pola tekstowego z wartością z ViewModel
            onValueChange = { viewModel.name = it },   // aktualizacja imienia przy zmianie tekstu
            singleLine = true                          // jednoliniowe pole tekstowe
        )
        Button(onClick = { navController.navigate(Routes.screen3) }) {
            Text(text = "Dalej")
        }
    }
}