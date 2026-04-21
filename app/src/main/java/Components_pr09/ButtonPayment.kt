package Components_pr09

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.ui.theme.colorBtn
import com.example.mobileapplicationdevelopment_zamt.ui.theme.notColorBtn

@Composable
fun ButtonPayment(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String,
    enabled: Boolean = true,
    isPrimary: Boolean = true
) {
    val containerColor = if (isPrimary) colorBtn else Color.White
    val contentColor = if (isPrimary) Color.White else colorBtn

    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor,
            contentColor = contentColor,
            disabledContainerColor = notColorBtn,
            disabledContentColor = Color.White
        ),
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp),
        enabled = enabled,
        shape = RoundedCornerShape(12.dp),
        border = if (!isPrimary) BorderStroke(1.dp, colorBtn) else null
    ) {
        Text(
            text = text, fontSize = 17.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = 0.sp,
            lineHeight = 24.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview()
@Composable
private fun ButtonsPreview() {
    ButtonPayment(text = "Чек покупки", onClick = {}, isPrimary = false)
}
