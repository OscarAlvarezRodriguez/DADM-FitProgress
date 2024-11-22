package com.example.fitprogress.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.fitprogress.ui.MainScreen

object Routes {
    const val Main = "main_screen"
    const val Hello = "hello_screen"
}

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.Main) {
        composable(Routes.Main) {
            MainScreen(
                title = "Inicio",
                content = { Text("Contenido de Inicio") }
            )
        }
        composable(Routes.Hello) {
            MainScreen(
                title = "Hola",
                content = { Text("Contenido de Hello Screen") }
            )
        }
    }
}
