package Components_pr04

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.ui.theme.AccentColor
import com.example.mobileapplicationdevelopment_zamt.ui.theme.colorOnboardDescription

@Composable
fun OnboardHeader(modifier: Modifier = Modifier) {
    Text(
        text = "Заголовок",
        color = AccentColor,
        fontSize = 20.sp
    )
}

@Preview
@Composable
private fun OnboardHeaderPreview() {
    OnboardHeader()
}

@Composable
fun OnboardDescription(modifier: Modifier = Modifier) {
    Text(
        text = "Описание",
        color = colorOnboardDescription,
        fontSize = 14.sp
    )
}

@Preview
@Composable
private fun OnboardDescriptionPreview() {
    OnboardDescription()
}

@Composable
fun TextButton(modifier: Modifier = Modifier) {
    Text(
        text = "Текст, на который можно нажать",
        color = colorOnboardDescription,
        fontSize = 20.sp,
        modifier = modifier
            .clickable{ }
    )
}

@Preview
@Composable
private fun TextButtonPreview() {
    TextButton()
}