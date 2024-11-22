package com.example.fitprogress

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.fitprogress.navigation.NavGraph
import com.example.fitprogress.ui.theme.FitProgressTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitProgressTheme {
                val navController = rememberNavController()
                NavGraph(navController = navController)
            }
        }
    }
}
