package Components_pr04

import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.R
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
        contentPadding = PaddingValues(1.dp),
        modifier = modifier
            .width(96.dp)
            .height(40.dp),
        enabled = enabled,
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(
            text = text,
            fontSize = 14.sp,
            fontFamily = FontFamily(Font(R.font.nunito_semibold, FontWeight.SemiBold)),
            letterSpacing = 0.sp,
            lineHeight = 20.sp
        )
    }
}

@Preview
@Composable
private fun PrimaryButtonPreview() {
    PrimaryButton(onClick = {}, text = "Добавить", enabled = true)
}