package com.example.project_android.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.project_android.ui.theme.BorderColorInput
import com.example.project_android.ui.theme.LinkColor
import com.example.project_android.ui.theme.SupportTextColor
import com.example.project_android.ui.theme.WhiteBg
import com.example.project_android.utils.Routes

@Composable
fun LoginPage(navController: NavController){
    var password = rememberSaveable { mutableStateOf("") }
    var username = rememberSaveable { mutableStateOf("") }
    Column (

        Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Box(modifier = Modifier.size(50.dp).background(Color.Red))
        Text(text = "Sign In", style = TextStyle(
            color = LinkColor
        )
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = username.value,
            onValueChange = {username.value = it},
            label = { Text("Enter user name") }
        )
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = password.value,
            onValueChange = {password.value = it},
            label = { Text("Enter password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)

        )
        Text(text = "Forget Password?", style = TextStyle(
            color = LinkColor
        )
        )
        Button(onClick = {
            navController.navigate(Routes.registerPage)
        }, modifier = Modifier.fillMaxWidth().height(50.dp)) {
            Text(text = "Sign In")
        }
        Text(text = "Or Sign In", style = TextStyle(
            color = SupportTextColor
        )
        )
        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth() ) {
            Box(modifier = Modifier.size(50.dp).background(Color.Red))
            Box(modifier = Modifier.size(50.dp).background(Color.Red))
            Box(modifier = Modifier.size(50.dp).background(Color.Red))
            Box(modifier = Modifier.size(50.dp).background(Color.Red))
        }
      Row {
          Text(text = "Don't have account? ", style = TextStyle(
              color = SupportTextColor
          ))
          Text(text = "Sign Up",
              Modifier.clickable {
                  navController.navigate(Routes.registerPage)
              },
              style = TextStyle(
                  color = LinkColor
              ),
          )
      }
    }
}