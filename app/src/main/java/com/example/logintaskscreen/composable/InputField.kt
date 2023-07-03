package com.example.logintaskscreen.composable


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.logintaskscreen.ui.theme.BackgroundScreenColor
import com.example.logintaskscreen.ui.theme.PrimaryColor
import com.example.logintaskscreen.ui.theme.SecondaryTextColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputField(nameField: String){
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp)) {
        Text(
            text = nameField,
            color = SecondaryTextColor
        )
        var textInput by rememberSaveable{ mutableStateOf("") }
        TextField(
            colors = TextFieldDefaults.textFieldColors(
                    containerColor = BackgroundScreenColor,
                    cursorColor = Color.White,
                    textColor = Color.White,
                    focusedIndicatorColor = Color.White,
                    unfocusedIndicatorColor = PrimaryColor
            ),
            value = textInput,
            onValueChange ={newText -> textInput = newText },
            modifier = Modifier
                .fillMaxWidth(),
            )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewInputField(){
    InputField("anything")
}