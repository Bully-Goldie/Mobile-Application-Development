package Components_pr05

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.ui.theme.TextYandex
import com.example.mobileapplicationdevelopment_zamt.ui.theme.ButtonTrue

@Composable
fun Yandex(modifier: Modifier = Modifier, btnText: String, text: String, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .width(335.dp)
            .height(172.dp)

    ) {
        Text(
            text = text,
            fontSize = 15.sp,
            modifier = Modifier
                .align(Alignment.Center),
            color = TextYandex,
            fontWeight = FontWeight.W400,
            lineHeight = 20.sp,
            letterSpacing = 0.sp,
            textAlign = TextAlign.Center
        )
        Button(
            onClick = onClick,
            modifier = Modifier
                .width(335.dp)
                .height(56.dp)
                .align(Alignment.BottomStart),
            border = BorderStroke(1.dp, ButtonTrue),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = ButtonTrue
            )
        ) {
            Text(
                text = btnText,
                fontSize = 17.sp,
                fontWeight = FontWeight.W400,
                lineHeight = 24.sp,
                letterSpacing = 0.sp
            )
        }
    }
}

@Preview
@Composable
private fun YandexPrev() {
    Yandex(text = "Или войдите с помощью", btnText = "Войти с Яндекс", onClick = {})
}