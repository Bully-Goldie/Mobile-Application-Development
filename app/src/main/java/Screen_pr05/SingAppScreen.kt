package Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import Components_pr05.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color

@Composable
fun SingAppScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .width(375.dp)
            .height(812.dp)
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.height(60.dp))
        Title()

        Spacer(modifier = Modifier.weight(1f))

        Input()
        Spacer(modifier = Modifier.height(16.dp))
        Button()

        Spacer(modifier = Modifier.weight(1f))

        Yandex()
        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Preview
@Composable
private fun SingAppScreenFalsePrev() {
    SingAppScreen()
}