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
fun Title(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .width(335.dp)
            .height(91.dp)
            .background(Color.White)

    ) {
        Text(
            text = "Добро пожаловать!",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier = Modifier
                .align(Alignment.TopCenter)

        )

        Text(
            text = "Войдите, чтобы пользоваться функциями приложения",
            fontWeight = FontWeight.Normal,
            fontSize = 15.sp,
            modifier = Modifier.align(Alignment.BottomEnd)
        )
    }
}

@Preview
@Composable
private fun TitlePrev() {
    Title()
}