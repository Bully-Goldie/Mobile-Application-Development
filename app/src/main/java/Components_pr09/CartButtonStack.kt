package Components_pr09

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.example.mobileapplicationdevelopment_zamt.ui.theme.ButtonFalse
import com.example.mobileapplicationdevelopment_zamt.ui.theme.ButtonTrue
import com.example.mobileapplicationdevelopment_zamt.ui.theme.TextYandex

@Composable
fun CartButtonStack(
    modifier: Modifier = Modifier,
    promoText: String,
    onClickPromo: () -> Unit,
    orderText: String,
    priceText: String,
    onClickBtn: () -> Unit,
    enabled: Boolean,
    buttonText: String
) {
    Box(
        modifier = modifier
            .width(375.dp)
            .height(225.dp)
            .padding(horizontal = 20.dp, vertical = 24.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter)
                .clickable { onClickPromo() },
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = promoText,
                fontSize = 15.sp,
                color = TextYandex,
                fontWeight = FontWeight.W500
            )
            Image(
                painter = painterResource(id = R.drawable.next),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = orderText,
                fontSize = 17.sp,
                color = Color.Black,
                fontWeight = FontWeight.W600
            )
            Text(
                text = priceText,
                fontSize = 17.sp,
                color = Color.Black,
                fontWeight = FontWeight.W600
            )
        }

        Button(
            onClick = onClickBtn,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .align(Alignment.BottomCenter),
            enabled = enabled,
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = ButtonTrue,
                contentColor = Color.White,
                disabledContainerColor = ButtonFalse,
                disabledContentColor = Color.White
            )
        ) {
            Text(
                text = buttonText,
                fontSize = 17.sp,
                fontWeight = FontWeight.W600
            )
        }
    }
}

@Preview
@Composable
private fun CartButtonStackPrev() {
    CartButtonStack(promoText = "Промокод", onClickPromo = {}, orderText = "2 анализа", priceText = "2490 ₽", onClickBtn = {}, enabled = true, buttonText = "Заказать")
}