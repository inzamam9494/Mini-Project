package com.example.miniproject.ui.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miniproject.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PeopleScreen(modifier: Modifier,
                 onClickSubject: () -> Unit) {
    Scaffold(
        bottomBar = {
            BottomAppBar {

                Row(modifier.padding(10.dp)) {

                    IconButton(onClick = onClickSubject) {
                    Image(
                        painter = painterResource(id = R.drawable.subject),
                        contentDescription = "subject",
                        colorFilter = ColorFilter.tint(Color.Black),
                        modifier = Modifier.size(40.dp)
                    )
                }

                    Spacer(modifier = Modifier.weight(0.1f))

                    Image(
                        painter = painterResource(id = R.drawable.assignment),
                        contentDescription = "assignment",
                        colorFilter = ColorFilter.tint(Color.Black),
                        modifier = Modifier.size(40.dp)
                    )

                    Spacer(modifier = Modifier.weight(0.1f))

                    Image(
                        painter = painterResource(id = R.drawable.quiz),
                        contentDescription = "quiz",
                        colorFilter = ColorFilter.tint(Color.Black),
                        modifier = Modifier.size(40.dp)
                    )

                    Spacer(modifier = Modifier.weight(0.1f))

                    Image(
                        painter = painterResource(id = R.drawable.people),
                        contentDescription = "people",
                        colorFilter = ColorFilter.tint(Color.Blue),
                        modifier = Modifier.size(40.dp)
                    )
                }
            }
        }
    ) {
        Column(modifier.padding(it)) {
            Column(modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "No User found",
                    style = MaterialTheme.typography.displayMedium)
            }
        }
    }
}




@Preview(showSystemUi = true)
@Composable
fun PeopleScreenPreview() {
    MaterialTheme{
        PeopleScreen(modifier = Modifier, onClickSubject = {})
    }
}