package Components_pr09

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
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
import org.w3c.dom.Text

@Composable
fun Payment(modifier: Modifier = Modifier, text: String) {
    Box(
        modifier = Modifier
            .width(375.dp)
            .height(48.dp)
    ){
        Text(
            text = text,
            fontSize = 20.sp,
            modifier = Modifier
                .align(Alignment.TopCenter),
            color = Color.Black,
            fontWeight = FontWeight.W600,
            lineHeight = 28.sp,
            letterSpacing = 0.38.sp
        )
    }
}

@Preview
@Composable
private fun PaymentPrev() {
    Payment(text = "Оплата")
}