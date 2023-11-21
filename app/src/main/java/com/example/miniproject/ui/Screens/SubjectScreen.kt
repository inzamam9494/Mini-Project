package com.example.miniproject.ui.Screens

import android.widget.ImageButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miniproject.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SubjectScreen(
    modifier: Modifier,
    onClickAssign: () -> Unit,
    onUnitsClick: () -> Unit
) {
    Scaffold(
        bottomBar = {
            BottomAppBar {

                Row(modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.subject),
                        contentDescription = "subject",
                        colorFilter = ColorFilter.tint(Color.Blue),
                        modifier = Modifier.size(40.dp)
                    )

                    Spacer(modifier = Modifier.weight(0.1f))

                    IconButton(onClick = onClickAssign) {
                        Image(
                            painter = painterResource(id = R.drawable.assignment),
                            contentDescription = "assignment",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier.size(40.dp)
                        )
                    }

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
                        colorFilter = ColorFilter.tint(Color.Black),
                        modifier = Modifier.size(40.dp)
                    )
                }
            }
        }
    ) {
        Column(modifier.padding(it)) {
            Column(modifier = Modifier.padding(10.dp)) {
                SubjectCard(text = "Distributed System", onClick = onUnitsClick)
                SubjectCard(text = "Digital Image Processing", onClick = onUnitsClick)
                SubjectCard(text = "Cryptography and Network Security", onClick = onUnitsClick)
                SubjectCard(text = "Human Computer Interaction", onClick = onUnitsClick)
                SubjectCard(text = "Software Testing & Auditing", onClick = onUnitsClick)
            }
        }
    }
}

@Composable
fun SubjectCard(
    text: String,
    onClick: () -> Unit
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
            IconButton(onClick = onClick) {
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
fun SubjectScreenPreview() {
    MaterialTheme {
//        SubjectScreen(modifier = Modifier) {
//
//        }
    }
}