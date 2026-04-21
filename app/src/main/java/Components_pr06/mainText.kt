package Components_pr06

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.ui.theme.green
import com.example.mobileapplicationdevelopment_zamt.ui.theme.grey

@Composable
fun mainText(modifier: Modifier = Modifier, mainText: String, lastText: String) {
    Box(
        modifier = Modifier
            .width(225.dp)
            .height(93.dp)

    ){
        Text(
            text = mainText,
            fontSize = 20.sp,
            modifier = Modifier
                .align(Alignment.TopCenter),
            color = green,
            fontWeight = FontWeight.W600,
            lineHeight = 20.sp,
            letterSpacing = 0.sp,

            )
        Text(
            text = lastText,
            fontSize = 14.sp,
            modifier = Modifier
                .align(Alignment.BottomCenter),
            color = grey,
            fontWeight = FontWeight.W400,
            lineHeight = 20.sp,
            letterSpacing = 0.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
private fun AnalyzesPrev() {
    mainText(mainText = "Анализы", lastText = "Экспресс сбор и получение проб")
}