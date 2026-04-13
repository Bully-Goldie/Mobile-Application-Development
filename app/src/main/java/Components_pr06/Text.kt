package Components_pr06

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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.R
import com.example.mobileapplicationdevelopment_zamt.ui.theme.blue
import com.example.mobileapplicationdevelopment_zamt.ui.theme.green
import com.example.mobileapplicationdevelopment_zamt.ui.theme.grey

@Composable
fun Next(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = R.string.Next),
        fontSize = 20.sp,
        color = blue,
        modifier = modifier
            .padding(1.dp)
    )
}

@Preview
@Composable
private fun NextPrev() {
    Next()
}

@Composable
fun Finish(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = R.string.Finish),
        fontSize = 20.sp,
        color = blue,
        modifier = modifier
            .padding(1.dp)
    )
}

@Preview
@Composable
private fun FinishPrev() {
    Finish()
}

@Composable
fun Analyzes(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .width(214.dp)
            .height(73.dp)

    ){
        Text(
            text = stringResource(id = R.string.Analyzes),
            fontSize = 20.sp,
            modifier = Modifier
                .align(Alignment.TopCenter),
            color = green
        )
        Text(
            text = stringResource(id = R.string.Analyzes_2),
            fontSize = 14.sp,
            modifier = Modifier
                .align(Alignment.BottomCenter),
            color = grey
        )
    }
}

@Preview
@Composable
private fun AnalyzesPrev() {
    Analyzes()
}

@Composable
fun Notifications(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .width(216.dp)
            .height(73.dp)

    ){
        Text(
            text = stringResource(id = R.string.Notifications),
            fontSize = 20.sp,
            modifier = Modifier
                .align(Alignment.TopCenter),
            color = green
        )
        Text(
            text = stringResource(id = R.string.Notifications_2),
            fontSize = 14.sp,
            modifier = Modifier
                .align(Alignment.BottomCenter),
            color = grey,
            softWrap = false
        )
    }
}

@Preview
@Composable
private fun NotificationsPrev() {
    Notifications()
}

@Composable
fun Monitoring(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .width(225.dp)
            .height(93.dp)

    ){
        Text(
            text = stringResource(id = R.string.Monitoring),
            fontSize = 20.sp,
            modifier = Modifier
                .align(Alignment.TopCenter),
            color = green
        )
        Text(
            text = stringResource(id = R.string.Monitoring_2),
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            lineHeight = 20.sp,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth(),
            color = grey
        )
    }
}

@Preview
@Composable
private fun MonitoringPrev() {
    Monitoring()
}