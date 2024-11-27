package com.example.charades


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp


@Composable
fun BannerScreen(text: String?) {
    Scaffold { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding).padding(horizontal = 50.dp)
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "$text",
                fontSize = 75.sp,
                style = LocalTextStyle.current.merge(
                    TextStyle(
                        lineHeight = 1.em
                    )
                )
            )
        }
    }
}
