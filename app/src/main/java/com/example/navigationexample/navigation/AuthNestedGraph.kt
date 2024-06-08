package com.example.navigationexample.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.navigationexample.Screens.ForgetPassScreen
import com.example.navigationexample.Screens.LoginScreen
import com.example.navigationexample.Screens.RegisterScreen

fun NavGraphBuilder.authGraph(navController: NavController){
    navigation(startDestination = Screens.ScreenLoginRoute.route,route =Screens.AuthRoute.route){

        composable(route = Screens.ScreenLoginRoute.route){
            LoginScreen(navController = navController)
        }
        composable(route = Screens.ScreenRegisterRoute.route){
            RegisterScreen(navController = navController)
        }
        composable(route = Screens.ScreenForgetPassRoute.route){
            ForgetPassScreen(navController = navController)
        }
    }
}