package Screen_pr09

import Components_pr09.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun OrderScreen(modifier: Modifier = Modifier, onOrderClick: () -> Unit) {
    val textAddress = remember { mutableStateOf("") }
    val textPhone = remember { mutableStateOf("") }
    val textComment = remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 26.dp, vertical = 20.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Order(text = "Оформление заказа", onClick = { })

        Spacer(modifier = Modifier.height(24.dp))

        Input(
            mainText = "Адрес *",
            text = "Введите ваш адрес",
            value = textAddress.value,
            onValueChange = { textAddress.value = it }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Input(
            mainText = "Телефон *",
            text = "Введите ваш номер телефона",
            value = textPhone.value,
            onValueChange = { textPhone.value = it }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Comment(
            mainText = "Комментарий",
            text = "Можете оставить свои пожелания",
            value = textComment.value,
            onValueChange = { textComment.value = it },
            onClick = { }
        )

        Spacer(modifier = Modifier.weight(1f))

        CartButtonStack(
            promoText = "Промокод",
            onClickPromo = onOrderClick,
            orderText = "1 анализ",
            priceText = "690 ₽",
            onClickBtn = {},
            enabled = true,
            buttonText = "Заказать"
        )
    }
}


@Preview
@Composable
private fun OrderScreenPrev() {
    OrderScreen(onOrderClick = {})
}