package com.example.loginpage.user

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.miniproject.ui.Screens.AssignmentCard
import com.example.miniproject.ui.Screens.AssignmentScreen
import com.example.miniproject.ui.Screens.PeopleScreen
import com.example.miniproject.ui.Screens.QuizScreen
import com.example.miniproject.ui.Screens.SubjectScreen
import com.example.miniproject.ui.Screens.SubmittedScreen
import com.example.miniproject.ui.Screens.UnitScreen

enum class AuthNavScreen {
    Login,
    Register,
    Subject,
    Assignment,
    Quiz,
    People,
    Submit,
    Units
}

@Composable
fun AuthNavigation(
    state: AuthState,
    onEvent: (AuthEvent) -> Unit,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = AuthNavScreen.Login.name
    ) {
        composable(AuthNavScreen.Login.name) {
            LoginPageScreen(
                state = state,
                onEvent = onEvent,
                onClickToRegister = { navController.navigate(AuthNavScreen.Register.name) },
                modifier = Modifier
            )
        }
        composable(AuthNavScreen.Register.name){
            RegistrationPageScreen(
                state = state,
                onEvent = onEvent,
                onClickToLogin = { navController.navigateUp() },
                onClickToSubject = { navController.navigate(AuthNavScreen.Subject.name) },
                modifier = Modifier
            )
        }
        
        composable(AuthNavScreen.Subject.name){
            SubjectScreen(modifier = Modifier,
                onClickAssign = { navController.navigate(AuthNavScreen.Assignment.name) },
                onUnitsClick = {navController.navigate(AuthNavScreen.Units.name)})
        }
        composable(AuthNavScreen.Assignment.name){
             AssignmentScreen(modifier = Modifier,
                 onClickQuiz = { navController.navigate(AuthNavScreen.Quiz.name) })
        }
        composable(AuthNavScreen.Quiz.name){
            QuizScreen(modifier = Modifier,
                onClickPeople = { navController.navigate(AuthNavScreen.People.name) },
                onClickSubmit = { navController.navigate(AuthNavScreen.Submit.name) })
        }
        composable(AuthNavScreen.People.name){
            PeopleScreen(modifier = Modifier,
                onClickSubject = { navController.navigate(AuthNavScreen.Subject.name) })
        }
        composable(AuthNavScreen.Units.name){
            UnitScreen()
        }
        composable(AuthNavScreen.Submit.name){
            SubmittedScreen()
        }
    }
}