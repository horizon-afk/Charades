package com.example.charades

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.charades.ui.theme.CharadesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CharadesTheme {

                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "Home") {
                    composable("Home") { HomeScreen() }
                    composable("Banner") { BannerScreen() }
                }
            }
        }
    }
}
