package Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import Components_pr05.*
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color

@Composable
fun SignAppScreen(
    modifier: Modifier = Modifier,
    onNextClick: () -> Unit
) {
    val text = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.height(60.dp))
        Title(
            helloText = "Добро пожаловать!",
            refText = "Войдите, чтобы пользоваться функциями приложения"
        )

        Spacer(modifier = Modifier.weight(0.4f))


        Input(
            label = "Вход по E-mail",
            placeholderText = "example@mail.ru",
            value = text.value,
            onValueChange = { text.value = it })
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            text = "Далее",
            onClick = onNextClick,
            enabled = true
        )

        Spacer(modifier = Modifier.weight(1f))

        Yandex(text = "Или войдите с помощью", btnText = "Войти с Яндекс", onClick = {})
        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Preview
@Composable
private fun SignAppScreenPrev() {
    SignAppScreen(onNextClick = {})
}