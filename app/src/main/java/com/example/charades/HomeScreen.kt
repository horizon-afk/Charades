package com.example.charades

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(modifier = Modifier.padding(15.dp)) {
                Text(text = "Enter text")
            }
            Box(
                modifier = Modifier
                    .height(200.dp)
                    .width(300.dp)
                    .border(2.dp, Color(0xFF2196F3), shape = RoundedCornerShape(12.dp)),
                contentAlignment = Alignment.Center
            ) {
                var name by remember { mutableStateOf(TextFieldValue("")) }
                BasicTextField(
                    cursorBrush = SolidColor(LocalContentColor.current),
                    textStyle = TextStyle.Default.copy(
                        textAlign = TextAlign.Center,
                        fontSize = 28.sp,
                        color = LocalContentColor.current
                    ),
                    value = name,
                    onValueChange = {
                        val maxLength = 80
                        if (it.text.length <= maxLength) name = it
                    },
                )

            }
            Box(modifier = Modifier.padding(12.dp)) {
                Button(
                    shape = CircleShape,
                    modifier = Modifier.size(75.dp),
                    colors = buttonColors(Color(0xFF2196F3)),
                    contentPadding = PaddingValues(0.dp),
                    onClick = {}

                ) {
                    Icon(
                        Icons.Default.PlayArrow,
                        contentDescription = "",
                        modifier = Modifier.size(50.dp),
                        tint = Color(0xFFFFFFFF)
                    )

                }
            }


        }
    }
}