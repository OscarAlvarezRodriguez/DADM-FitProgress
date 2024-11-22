package com.example.fitprogress.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

// Configuración del esquema de colores para modo oscuro
private val DarkColorScheme = darkColorScheme(
    primary = Color1, // Amarillo anaranjado
    secondary = Color4, // Marrón rojizo oscuro
    tertiary = Color2, // Naranja oscuro
    background = DarkBackground,
    surface = DarkSurface,
    onPrimary = OnPrimary,
    onSecondary = OnSecondary,
    onBackground = OnBackgroundDark,
    onSurface = OnBackgroundDark
)

// Configuración del esquema de colores para modo claro
private val LightColorScheme = lightColorScheme(
    primary = Color1, // Amarillo anaranjado
    secondary = Color2, // Naranja oscuro
    tertiary = Color3, // Rojo ladrillo
    background = LightBackground,
    surface = LightSurface,
    onPrimary = OnPrimary,
    onSecondary = OnSecondary,
    onBackground = OnBackgroundLight,
    onSurface = OnBackgroundLight
)

@Composable
fun FitProgressTheme(
    darkTheme: Boolean = isSystemInDarkTheme(), // Determina si el sistema está en modo oscuro
    dynamicColor: Boolean = false, // Dinámico desactivado por ahora; se puede habilitar para Android 12+
    content: @Composable () -> Unit
) {
    // Selección del esquema de colores según el tema
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    // Configuración del tema de Material3
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
