package Components_pr04

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.ui.theme.AccentColor
import com.example.mobileapplicationdevelopment_zamt.ui.theme.TextColor
import com.example.mobileapplicationdevelopment_zamt.ui.theme.colorOnboardDescription

@Composable
fun OnboardHeader(modifier: Modifier = Modifier, text: String) {
    Text(
        text = text,
        color = AccentColor,
        fontSize = 20.sp,
        fontWeight = FontWeight.W600,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
    )
}

@Preview
@Composable
private fun OnboardHeaderPreview() {
    OnboardHeader(text = "Заголовок")
}

@Composable
fun OnboardDescription(modifier: Modifier = Modifier, text: String) {
    Text(
        text = text,
        color = colorOnboardDescription,
        fontSize = 14.sp,
        fontWeight = FontWeight.W400,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        textAlign = TextAlign.Center
    )
}

@Preview
@Composable
private fun OnboardDescriptionPreview() {
    OnboardDescription(text = "Описание")
}

@Composable
fun TextButton(modifier: Modifier = Modifier, text: String, onClick: () -> Unit) {
    Text(
        text = text,
        color = TextColor,
        fontSize = 20.sp,
        fontWeight = FontWeight.W600,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        modifier = Modifier
            .clickable{onClick()}
    )
}

@Preview
@Composable
private fun TextButtonPreview() {
    TextButton(text = "Текст, на который можно нажать", onClick = {})
}