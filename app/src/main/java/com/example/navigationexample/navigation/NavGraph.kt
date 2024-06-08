package com.example.navigationexample.navigation

import com.example.navigationexample.Screens.ForgetPassScreen
import com.example.navigationexample.Screens.HomeScreen
import com.example.navigationexample.Screens.LoginScreen
import com.example.navigationexample.Screens.RegisterScreen
import com.example.navigationexample.Screens.ScreenA
import com.example.navigationexample.Screens.ScreenB

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.AuthRoute.route) {

        authGraph(navController)
        appGraph(navController)
    }
}