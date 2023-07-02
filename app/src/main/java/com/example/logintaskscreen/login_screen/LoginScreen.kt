package com.example.logintaskscreen.login_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.logintaskscreen.composable.ApplicationLogo
import com.example.logintaskscreen.composable.InputField
import com.example.logintaskscreen.composable.LoginButton
import com.example.logintaskscreen.composable.TextNotHaveAnAccount
import com.example.logintaskscreen.ui.theme.BackgroundButtonColor
import com.example.logintaskscreen.ui.theme.BackgroundScreenColor
import com.example.logintaskscreen.ui.theme.PrimaryColor
import com.example.logintaskscreen.ui.theme.SecondaryTextColor

@Composable
fun LoginScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(BackgroundScreenColor),
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {
        Spacer(modifier = Modifier.height(128.dp))
        ApplicationLogo()
        Spacer(modifier = Modifier.height(32.dp))
        Column() {
            InputField("Username")
            Spacer(modifier = Modifier.height(16.dp))
            InputField("Password")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Forget password ?",
            color = SecondaryTextColor,
        )
        Spacer(modifier = Modifier.height(16.dp))
        LoginButton()
        TextNotHaveAnAccount()
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewLoginScreen(){
    LoginScreen()
}