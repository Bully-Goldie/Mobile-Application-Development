package Components_pr05

import android.graphics.fonts.FontFamily
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.ui.theme.ButtonFalse
import com.example.mobileapplicationdevelopment_zamt.ui.theme.ButtonTrue


@Composable
fun Button(modifier: Modifier = Modifier, onClick: () -> Unit, text: String, enabled: Boolean) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .width(335.dp)
            .height(56.dp),
        enabled = enabled,
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = ButtonTrue,
            contentColor = Color.White,
            disabledContainerColor = ButtonFalse,
            disabledContentColor = Color.White
        )) {
        Text(
            text = text,
            fontSize = 17.sp,
            fontWeight = FontWeight.W600,
            lineHeight = 24.sp,
            letterSpacing = 0.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
private fun ButtonFalsePrev() {
    Button(text = "Далее", onClick = {}, enabled = false)
}