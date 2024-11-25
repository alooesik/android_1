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
fun Screen3(navController: NavController, viewModel: MainViewModel) {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Wprowadź wiek:")
        TextField(
            value = viewModel.age,
            onValueChange = { viewModel.age = it }, // aktualizacja wieku w ViewModel
            singleLine = true
        )
        Button(onClick = { navController.navigate(Routes.screen4) }) {
            Text(text = "Dalej")
        }
    }
}