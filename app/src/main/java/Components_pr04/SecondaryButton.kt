package Components_pr04

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.ui.theme.colorBtn

@Composable
fun SecondaryButton(modifier: Modifier = Modifier, text: String, onClick: () -> Unit) {
    OutlinedButton(
        onClick = onClick,
        border = BorderStroke(1.dp, colorBtn),
        modifier = modifier
            .width(335.dp)
            .height(48.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(
            text = text,
            color = colorBtn,
            fontSize = 15.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = 0.sp,
            lineHeight = 20.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
private fun SecondaryButtonPreview() {
    SecondaryButton(text = "Еще одна кнопка", onClick = {})
}