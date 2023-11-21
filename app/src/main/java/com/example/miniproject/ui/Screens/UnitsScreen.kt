package com.example.miniproject.ui.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun UnitScreen() {
    Column(modifier = Modifier.padding(10.dp)) {
        UnitCard(text = "Unit 1")
        UnitCard(text = "Unit 2")
        UnitCard(text = "Unit 3")
        UnitCard(text = "Unit 4")
        UnitCard(text = "Unit 5")
    }
}

@Composable
fun UnitCard(
    text: String
) {
    Card {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)
        ) {
            Text(
                text = text,
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.weight(0.1f))
            IconButton(onClick = {}) {
                Image(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = null
                )
            }
        }

    }
    Spacer(modifier = Modifier.padding(10.dp))
}

@Preview(showSystemUi = true)
@Composable
fun UnitPreviewScreen() {
    MaterialTheme {
        UnitScreen()
    }
}