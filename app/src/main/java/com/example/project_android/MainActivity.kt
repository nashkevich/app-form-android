package com.example.project_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.project_android.ui.theme.PROJECT_ANDROIDTheme
import com.example.project_android.utils.Routes
import com.example.project_android.views.LoginPage
import com.example.project_android.views.RegisterPage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "login_page"){
                composable(Routes.loginPage) {
                    LoginPage(navController=navController)
                }
                composable(Routes.registerPage) {
                    RegisterPage(navController=navController)
                }
            }
        }
    }
}

