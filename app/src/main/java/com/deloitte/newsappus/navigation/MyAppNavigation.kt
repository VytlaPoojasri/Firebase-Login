package com.deloitte.newsappus.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.deloitte.newsappus.screens.HomeScreen
import com.deloitte.newsappus.screens.LoginScreen
import com.deloitte.newsappus.screens.SignupScreen
import com.deloitte.newsappus.viewmodel.AuthViewModel

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier,authViewModel: AuthViewModel){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login",builder={
        composable("login") {
            LoginScreen(modifier,navController,authViewModel)
        }
        composable("signup") {
            SignupScreen(modifier,navController, authViewModel)
        }
        composable("home") {
            HomeScreen(modifier,navController, authViewModel)
        }

    })
}