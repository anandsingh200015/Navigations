package com.example.navigationexample.navigation

sealed class Screens(val route : String) {

    object ScreenLoginRoute : Screens("Login")
    object ScreenForgetPassRoute : Screens("ForgetPass")
    object ScreenRegisterRoute : Screens("Register")
    object ScreenHomeRoute : Screens("Home")
    object ScreenARoute : Screens("A")
    object ScreenBRoute : Screens("B")
    object AuthRoute : Screens("Auth")
    object AppRoute : Screens("App")
}