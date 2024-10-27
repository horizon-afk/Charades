package com.example.charades

import android.annotation.SuppressLint
import android.app.Activity
import android.content.pm.ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
import android.content.pm.ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.charades.ui.theme.CharadesTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("SourceLockedOrientationActivity")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CharadesTheme {
                val context = LocalContext.current
                val activity = context as Activity

                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "Home") {
                    composable("Home") {
                        activity.requestedOrientation = SCREEN_ORIENTATION_PORTRAIT
                        HomeScreen(navController)
                    }
                    composable("Banner" + "/{text}") {navBackStack ->
                        activity.requestedOrientation = SCREEN_ORIENTATION_SENSOR_LANDSCAPE
                        val text = navBackStack.arguments?.getString("text")
                        BannerScreen(text = text)
                    }

                }
            }
        }
    }
}
