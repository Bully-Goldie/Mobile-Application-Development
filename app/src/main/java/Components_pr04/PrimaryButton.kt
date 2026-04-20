package Components_pr04

import android.R
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
fun PrimaryButton(modifier: Modifier = Modifier, onClick: () -> Unit, text: String, enabled: Boolean) {
    Button(onClick = onClick, colors = ButtonDefaults.buttonColors(
        containerColor = colorBtn,
        contentColor = Color.White,
        disabledContainerColor = notColorBtn,
        disabledContentColor = Color.White
    ),
        modifier = modifier
            .width(335.dp)
            .height(56.dp),
        enabled = enabled,
        shape = RoundedCornerShape(10.dp),
    ) {
        Text(
            text = text,
            fontSize = 17.sp,
            fontWeight = FontWeight.W600,
            letterSpacing = 0.sp,
            lineHeight = 24.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
private fun PrimaryButtonPreview() {
    PrimaryButton(onClick = {}, text = "Кнопка", enabled = true)
}