package com.example.firstfigmadesign

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavGraph(startDestination: String = "onboardingScreen1") {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {
        composable("onboardingScreen1") {
            OnboardingScreen1(navController = navController)
        }
        composable("onboardingScreen2") {
            OnboardingScreen2(navController = navController)
        }
        composable("onboardingScreen3"){
            OnboardingScreen3(navController = navController)
        }
        composable("onboardingScreen4"){
            OnboardingScreen4(navController = navController)
        }
    }
}
