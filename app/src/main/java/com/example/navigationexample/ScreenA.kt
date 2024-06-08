package com.example.navigationexample

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun ScreenA(navController: NavHostController){
    val modifier = Modifier
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var nameVale = remember {
            mutableStateOf("")
        }
        var age = remember {
            mutableStateOf("")
        }
        Text(text = "Screen A", fontSize = 64.sp)
        Spacer(modifier = Modifier.height(65.dp))
        TextField(value = nameVale.value, onValueChange = {nameVale.value = it},
            modifier.padding(10.dp),
            placeholder = {
                Text(text = "Enter your Name")
            })
        TextField(value = age.value, onValueChange = {age.value = it},
            modifier.padding(45.dp),
            placeholder = {
                Text(text = "Enter your Age")
            })
        Button(onClick = {
            Log.d("TAG",nameVale.value)
            Log.d("TAG",age.value)
//            navController.navigate("B/${nameVale.value}/${age.value}")
            navController.navigate("B?name=${nameVale.value}&age=${age.value}")
        }) {
            Text(text = "Pass Data", fontSize = 40.sp)
        }
    }
}