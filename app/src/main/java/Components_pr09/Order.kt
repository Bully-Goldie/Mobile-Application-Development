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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.R

@Composable
fun Order(modifier: Modifier = Modifier, text: String, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .width(329.dp)
            .height(84.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.back),
            contentDescription = null,
            modifier = Modifier
                .size(32.dp, 32.dp)
                .clickable{onClick}
        )

        Text(
            text = text,
            fontSize = 24.sp,
            modifier = Modifier
                .align(Alignment.BottomStart),
            color = Color.Black,
            fontWeight = FontWeight.W700,
            lineHeight = 28.sp,
            letterSpacing = 0.33.sp
        )
    }
}

@Preview
@Composable
private fun OrderPrev() {
    Order(text = "Оформление заказа", onClick = {})
}