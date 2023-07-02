package com.example.logintaskscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.logintaskscreen.login_screen.LoginScreen
import com.example.logintaskscreen.ui.theme.LoginTaskScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginTaskScreenTheme {
                LoginScreen()
            }
        }
    }
}

