package com.example.firstfigmadesign

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun OnboardingScreen1(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Onboarding Screen 1")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("onboardingScreen2") }) {
            Text("Next")
        }
    }
}

@Composable
fun OnboardingScreen2(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Onboarding Screen 2")
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Button(onClick = { navController.navigate("onboardingScreen1") }) {
                Text("Back")
            }
            Button(onClick = { navController.navigate("onboardingScreen3")}) {
                Text(text = "Next")

            }
        }

    }
}



    @Composable
    fun OnboardingScreen3(navController: NavController) {
        // Define the layout and content for the third onboarding screen
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Onboarding Screen 3")
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("onboardingScreen2") }) {
                Text(text = "Back")

            }
            Button(onClick = { navController.navigate("onboardingScreen4")}) {
                Text(text = "Next")

            }

        }
    }

@Composable
fun OnboardingScreen4(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Onboarding Screen 4")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("onboardingScreen3") }) {
            Text("Back")
        }
        Button(onClick = { navController.navigate("onboardingScreen1")}) {
            Text(text = "Next")

        }
    }
}
