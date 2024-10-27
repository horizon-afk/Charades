package com.example.charades


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp


@Composable
fun BannerScreen(text: String?) {
    Scaffold { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "$text",fontSize = 35.sp)
        }
    }
}
