package com.example.navigationexample

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "A") {
        composable(route = "A") {
            ScreenA(navController)
        }
        composable(route = "B?name={name}&age={age}",
            arguments = listOf(
                navArgument(name = "name"){
                    type = NavType.StringType
                  defaultValue= "user"
                 nullable = true
                },
                navArgument(name = "age"){
                    type = NavType.StringType
                   defaultValue="username"
                }
            )
            )
        {
            ScreenB(
                myName = it.arguments?.getString("name"),
                myAge =  it.arguments?.getString("age")
            )
        }
    }
    }