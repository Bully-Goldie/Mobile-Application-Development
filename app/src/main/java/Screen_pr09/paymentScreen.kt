package Screen_pr09

import Components_pr09.ButtonPayment
import Components_pr09.Payment
import Components_pr09.TextPayment
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mobileapplicationdevelopment_zamt.R

@Composable
fun paymentScreen(
    modifier: Modifier = Modifier,
    homeBack: () -> Unit,
    checkOrder: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 26.dp, vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Payment(text = "Оплата")

        Spacer(modifier = Modifier.weight(1f))

        Image(
            painter = painterResource(id = R.drawable.illustration),
            contentDescription = null,
            modifier = Modifier
                .size(204.00411987304688.dp, 200.46591186523438.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        TextPayment(
            title = "Ваш заказ успешно оплачен!",
            subtitle = "Вам осталось дождаться приезда медсестры и сдать анализы. До скорой встречи!",
            linkText = "Не забудьте ознакомиться с правилами подготовки к сдаче анализов",
            onClick = {}
        )

        Spacer(modifier = Modifier.weight(1f))

        ButtonPayment(text = "Чек покупки", onClick = {}, isPrimary = false)
        Spacer(modifier = Modifier.height(14.dp))
        ButtonPayment(text = "На главную", onClick = homeBack, isPrimary = true)
    }
}


@Preview
@Composable
private fun paymentScreenPrev() {
    paymentScreen(
        homeBack = {},
        checkOrder = {}
    )
}