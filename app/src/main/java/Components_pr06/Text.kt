package Components_pr06

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.R
import com.example.mobileapplicationdevelopment_zamt.ui.theme.blue
import com.example.mobileapplicationdevelopment_zamt.ui.theme.green
import com.example.mobileapplicationdevelopment_zamt.ui.theme.grey
import kotlin.math.max

@Composable
fun Next(modifier: Modifier = Modifier, text: String, onClick: () -> Unit) {
    Text(
        text = text,
        fontSize = 20.sp,
        color = blue,
        modifier = modifier
            .padding(1.dp)
            .clickable { onClick() },
        fontWeight = FontWeight.W600,
        lineHeight = 20.sp,
        letterSpacing = 0.sp
    )
}

@Preview
@Composable
private fun NextPrev() {
    Next(text = "Далее", onClick = {})
}

@Composable
fun Finish(modifier: Modifier = Modifier, text: String, onClick: () -> Unit) {
    Text(
        text = text,
        fontSize = 20.sp,
        color = blue,
        modifier = modifier
            .padding(1.dp)
            .clickable { onClick() },
        fontWeight = FontWeight.W600,
        lineHeight = 20.sp,
        letterSpacing = 0.sp
    )
}

@Preview
@Composable
private fun FinishPrev() {
    Finish(text = "Завершить", onClick = {})
}

@Composable
fun Analyzes(modifier: Modifier = Modifier, mainText: String, lastText: String) {
    Box(
        modifier = Modifier
            .width(214.dp)
            .height(73.dp)

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
    Analyzes(mainText = "Анализы", lastText = "Экспресс сбор и получение проб")
}

@Composable
fun Notifications(modifier: Modifier = Modifier, mainText: String, lastText: String) {
    Box(
        modifier = Modifier
            .width(216.dp)
            .height(73.dp)

    ){
        Text(
            text = mainText,
            fontSize = 20.sp,
            modifier = Modifier
                .align(Alignment.TopCenter),
            color = green,
            fontWeight = FontWeight.W600,
            lineHeight = 20.sp,
            letterSpacing = 0.sp
        )
        Text(
            text = lastText,
            fontSize = 14.sp,
            modifier = Modifier
                .align(Alignment.BottomCenter),
            color = grey,
            softWrap = false,
            fontWeight = FontWeight.W400,
            lineHeight = 20.sp,
            letterSpacing = 0.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
private fun NotificationsPrev() {
    Notifications(mainText = "Уведомления", lastText = "Вы быстро узнаете о результатаx")
}

@Composable
fun Monitoring(modifier: Modifier = Modifier, mainText: String, lastText: String) {
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
            letterSpacing = 0.sp
        )
        Text(
            text = lastText,
            fontSize = 14.sp,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth(),
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
private fun MonitoringPrev() {
    Monitoring(mainText = "Мониторинг", lastText = "Наши врачи всегда наблюдают за вашими показателями здоровья")
}