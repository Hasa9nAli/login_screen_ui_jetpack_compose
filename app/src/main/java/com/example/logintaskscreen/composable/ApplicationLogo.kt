package com.example.logintaskscreen.composable

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.logintaskscreen.R

@Composable
fun ApplicationLogo(){
    Image(painter = painterResource(id =  R.drawable.ic_logo_login), contentDescription = "Login Logo")
}