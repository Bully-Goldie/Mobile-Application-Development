package Components_pr09

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.R
import com.example.mobileapplicationdevelopment_zamt.ui.theme.TextColor
import com.example.mobileapplicationdevelopment_zamt.ui.theme.green
import com.example.mobileapplicationdevelopment_zamt.ui.theme.grey

@Composable
fun TextPayment(modifier: Modifier = Modifier, title: String, subtitle: String, linkText: String, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .width(335.dp)
            .height(161.dp)
    ){
        Text(
            text = title,
            fontSize = 20.sp,
            modifier = Modifier
                .align(Alignment.TopCenter),
            color = green,
            fontWeight = FontWeight.W600,
            lineHeight = 28.sp,
            letterSpacing = 0.38.sp
        )
        Text(
            text = subtitle,
            fontSize = 14.sp,
            modifier = Modifier
                .align(Alignment.Center),
            color = grey,
            fontWeight = FontWeight.W400,
            lineHeight = 20.sp,
            letterSpacing = 0.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = linkText,
            fontSize = 14.sp,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .clickable{onClick},
            color = TextColor,
            fontWeight = FontWeight.W400,
            lineHeight = 20.sp,
            letterSpacing = 0.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
private fun TextPaymentPrev() {
    TextPayment(
        title = "Ваш заказ успешно оплачен!",
        subtitle = "Вам осталось дождаться приезда медсестры и сдать анализы. До скорой встречи!",
        linkText = "Не забудьте ознакомиться с правилами подготовки к сдаче анализов",
        onClick = {}
    )
}