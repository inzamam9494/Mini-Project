package com.example.miniproject.ui.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.miniproject.R

@Composable
fun SubmittedScreen() {

    val check by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.animation_lm6hncx9))

    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier = Modifier.padding(10.dp)
            .size(500.dp)) {
            LottieAnimation(composition = check)
        }
        Text(
            text = "Quiz Submitted",
            style = MaterialTheme.typography.titleLarge
        )
    }

}