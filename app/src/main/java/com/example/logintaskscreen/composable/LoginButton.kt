package com.example.logintaskscreen.composable

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.logintaskscreen.ui.theme.BackgroundButtonColor

@Composable
fun LoginButton (){
    Button(
        onClick = {},
        Modifier.fillMaxWidth().padding(horizontal = 16.dp ),
        colors = ButtonDefaults.buttonColors(BackgroundButtonColor), ) {
        Text(text = "Login", )
    }
}