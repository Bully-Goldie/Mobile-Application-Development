package com.example.mobileapplicationdevelopment_zamt.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)
//pr07
val RobotoFamily = FontFamily(
    Font(R.font.roboto, FontWeight.Normal),
    Font(R.font.roboto_medium, FontWeight.Medium),
    Font(R.font.roboto_bold, FontWeight.Bold),
    Font(R.font.roboto_black, FontWeight.Black)
)

data class AppTypography(
    val headingBlack128: TextStyle,
    val headingBlack96: TextStyle,
    val headingBold36: TextStyle,
    val headingBold24: TextStyle,
    val headingMedium20: TextStyle,
    val subtitleMedium18: TextStyle,
    val subtitleBold16: TextStyle,
    val subtitleMedium16: TextStyle,
    val subtitleRegular16: TextStyle,
)

val LocalAppTypography = staticCompositionLocalOf {
    AppTypography(
        headingBlack128 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Black,
            fontSize = 128.sp
        ),
        headingBlack96 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Black,
            fontSize = 96.sp
        ),
        headingBold36 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp
        ),
        headingBold24 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        ),
        headingMedium20 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp
        ),
        subtitleMedium18 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp
        ),
        subtitleBold16 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        ),
        subtitleMedium16 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp
        ),
        subtitleRegular16 = TextStyle(
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )
    )
}
//pr07