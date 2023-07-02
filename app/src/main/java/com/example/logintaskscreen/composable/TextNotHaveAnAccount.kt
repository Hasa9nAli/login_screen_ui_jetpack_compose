package com.example.logintaskscreen.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.logintaskscreen.ui.theme.PrimaryColor
import com.example.logintaskscreen.ui.theme.SecondaryTextColor

@Composable
fun TextNotHaveAnAccount(){
    Row {
        Text(text = "New User?", color = SecondaryTextColor)
        Spacer(modifier = Modifier.width(4.dp))
        Text(text = "Sign Up", color = PrimaryColor)
        Spacer(modifier = Modifier.height(8.dp))
    }
}