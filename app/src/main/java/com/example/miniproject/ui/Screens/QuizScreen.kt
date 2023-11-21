package com.example.miniproject.ui.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miniproject.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuizScreen(
    modifier: Modifier,
    onClickPeople: () -> Unit,
    onClickSubmit: () -> Unit
) {
    Scaffold(
        bottomBar = {
            BottomAppBar {

                Row(modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.subject),
                        contentDescription = "subject",
                        colorFilter = ColorFilter.tint(Color.Black),
                        modifier = Modifier.size(40.dp)
                    )

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
                        colorFilter = ColorFilter.tint(Color.Blue),
                        modifier = Modifier.size(40.dp)
                    )

                    Spacer(modifier = Modifier.weight(0.1f))

                    IconButton(onClick = onClickPeople) {
                        Image(
                            painter = painterResource(id = R.drawable.people),
                            contentDescription = "people",
                            colorFilter = ColorFilter.tint(Color.Black),
                            modifier = Modifier.size(40.dp)
                        )
                    }

                }
            }
        }
    ) {
        Column(modifier.padding(it)) {
            Column(modifier = Modifier
                .padding(10.dp)
                .verticalScroll(rememberScrollState())) {
                QuizRadioButton(ques = "1. What is the primary focus of HCI's Paradise concept?", op1 = " Ideal user experience", op2 = " Computer hardware", op3 = " Software development", op4 = " Theoretical principles",)

                QuizRadioButton(ques = "2. What is the significance of Paradise in the context of HCI?", op1 = " A popular HCI software", op2 = " An acronym for design principles", op3 = " A term representing ideal interaction", op4 = " A famous HCI researcher's name",)

                QuizRadioButton(ques = "3. Which term is synonymous with the interaction component in HCI?", op1 = " Engagement", op2 = " Integration", op3 = " Interference", op4 = " Intermission",)

                QuizRadioButton(ques = "4. What do HCI guidelines primarily aim to enhance?", op1 = " Aesthetic appeal", op2 = " Usability of interactive systems", op3 = " Theoretical principles", op4 = " Computer hardware efficiency",)

                QuizRadioButton(ques = "5. According to HCI, what is essential for the design of interactive systems?", op1 = " Implementation", op2 = " Principles and theories", op3 = " Guidelines", op4 = " Usability analysis",)

                QuizRadioButton(ques = "6. What role do principles and theories play in HCI?", op1 = " Direct user interaction", op2 = " Shaping design concepts", op3 = " Hardware development", op4 = " Online help implementation",)

                QuizRadioButton(ques = "7. Which of the following is NOT mentioned in the unit as a part of interactive system guidelines?", op1 = " Usability", op2 = " Theories", op3 = " Functionality", op4 = " Principles",)

                QuizRadioButton(ques = "11. What does HCI emphasize in terms of design rules?", op1 = " Strict adherence to principles", op2 = " Flexibility in design processes", op3 = " Evaluation techniques", op4 = " Usability analysis",)

                QuizRadioButton(ques = "12. In HCI, what is the role of implementation in the design process?", op1 = " Creating design rules", op2 = " Executing the design", op3 = " User support development", op4 = " Universal design evaluation",)

                QuizRadioButton(ques = "13. How does HCI contribute to the software process?", op1 = " By focusing on hardware development", op2 = " Through evaluation technique", op3 = " By implementing design rules", op4 = " Ignoring design basics",)

                Row {
                    OutlinedButton(
                        onClick = onClickSubmit,
                        modifier = Modifier
                            .weight(0.1f)
                            .height(50.dp)
                    ) {
                        Text(
                            text = "Submit",
                            style = MaterialTheme.typography.titleMedium
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun QuizRadioButton(
    ques: String,
    op1: String,
    op2: String,
    op3: String,
    op4: String
) {
    val selectedOption = remember { mutableStateOf("") }

    Card {
        Column(modifier = Modifier.padding(10.dp)) {

            Text(text = ques,
                fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.padding(8.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = selectedOption.value == op1,
                    onClick = { selectedOption.value = op1 }
                )
                Text(text = op1)
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = selectedOption.value == op2,
                    onClick = { selectedOption.value = op2 }
                )
                Text(text = op2)
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = selectedOption.value == op3,
                    onClick = { selectedOption.value = op3 }
                )
                Text(text = op3)
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = selectedOption.value == op4,
                    onClick = { selectedOption.value = op4 }
                )
                Text(text = op4)
            }

        }
    }
    Spacer(modifier = Modifier.padding(10.dp))

}


@Preview(showSystemUi = true)
@Composable
fun QuizScreenPreview() {
    MaterialTheme {
       QuizScreen(modifier = Modifier, onClickPeople = {}, onClickSubmit = {})
    }
}