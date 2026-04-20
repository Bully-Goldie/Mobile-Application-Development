package com.example.mobileapplicationdevelopment_zamt.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

//pr04
val AccentColor = Color(0xFF00B712)
val colorOnboardDescription = Color(0xFF939396)

val TextColor = Color(0xFF57A9FF)
val colorBtn = Color(0xFF1A6FEE)
val notColorBtn = Color(0xFFC9D4FB)
val textF = Color(0xFFF5F5F9)
val InputStroke = Color(0xFFEBEBEB)
val plaseH = Color(0xFF000000)
//pr04

//pr05
val EmailText = Color(0xFF7E7E9A)
val InputBG = Color(0xFFF5F5F9)
val InputS = Color(0xFFEBEBEB)
val ButtonFalse = Color(0xFFC9D4FB)
val ButtonTrue = Color(0xFF1A6FEE)
val TextYandex = Color(0xFF939396)
//pr05

//pr06
val blue = Color(0xFF57A9FF)
val green = Color(0xFF00B712)
val grey = Color(0xFF939396)
//pr06

//pr07
data class AppColors(
    val primary: Color,
    val secondary: Color,
    val success: Color,
    val warning: Color,
    val info: Color,
    val error: Color,
    val blacktext1: Color,
    val blacktext2: Color,
    val gray1: Color,
    val gray2: Color,
    val white: Color
)

val LocalAppColors = staticCompositionLocalOf {
    AppColors(
        primary = Color.Unspecified,
        secondary = Color.Unspecified,
        success = Color.Unspecified,
        warning = Color.Unspecified,
        info = Color.Unspecified,
        error = Color.Unspecified,
        blacktext1 = Color.Unspecified,
        blacktext2 = Color.Unspecified,
        gray1 = Color.Unspecified,
        gray2 = Color.Unspecified,
        white = Color.Unspecified
    )
}
//pr07