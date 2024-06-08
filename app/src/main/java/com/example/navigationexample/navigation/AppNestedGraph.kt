package com.example.navigationexample.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.navigationexample.Screens.HomeScreen
import com.example.navigationexample.Screens.ScreenA
import com.example.navigationexample.Screens.ScreenB

fun NavGraphBuilder.appGraph(navController: NavController){
    navigation(startDestination = Screens.ScreenHomeRoute.route,route = Screens.AppRoute.route)
    {
        composable(route = Screens.ScreenHomeRoute.route){
            HomeScreen(navController = navController)
        }
        composable(route = Screens.ScreenARoute.route){
            ScreenA(navController = navController)
        }
        composable(route = Screens.ScreenBRoute.route){
            ScreenB(navController = navController)
        }
    }
}