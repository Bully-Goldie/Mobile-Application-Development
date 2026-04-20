package Components_pr05

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Title(modifier: Modifier = Modifier, helloText: String, refText: String) {
    Box(
        modifier = Modifier
            .width(335.dp)
            .height(91.dp)

    ) {
        Text(
            text = helloText,
            fontSize = 24.sp,
            modifier = Modifier
                .align(Alignment.TopCenter),
            fontWeight = FontWeight.W700,
            lineHeight = 28.sp,
            letterSpacing = 0.33.sp

        )

        Text(
            text = refText,
            fontSize = 15.sp,
            modifier = Modifier.align(Alignment.BottomEnd),
            fontWeight = FontWeight.W400,
            lineHeight = 20.sp,
            letterSpacing = 0.sp
        )
    }
}

@Preview
@Composable
private fun TitlePrev() {
    Title(helloText = "Добро пожаловать!", refText = "Войдите, чтобы пользоваться функциями приложения")
}