package com.example.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController

@Composable
fun Screen1(navController: NavController) {
    Column(
        Modifier.fillMaxSize(),                                             // kolumna zajmuje całą przestrzeń
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Aleksandra Becmer\n" +
                    "Jetpack Compose\n" +
                    "Komunikacja między ekranami\n",
            textAlign = TextAlign.Center
        )
        Button(onClick = { navController.navigate(Routes.screen2) }) {      // nawigacja do kolejnego ekranu
            Text(text = "Dalej")
        }
    }
}