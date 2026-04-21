package Components_pr06

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.ui.theme.blue
import com.example.mobileapplicationdevelopment_zamt.ui.theme.green
import com.example.mobileapplicationdevelopment_zamt.ui.theme.grey

@Composable
fun nextText(modifier: Modifier = Modifier, text: String, onClick: () -> Unit) {
    Text(
        text = text,
        fontSize = 20.sp,
        color = blue,
        modifier = modifier
            .padding(1.dp)
            .clickable { onClick() },
        fontWeight = FontWeight.W600,
        lineHeight = 20.sp,
        letterSpacing = 0.sp
    )
}

@Preview
@Composable
private fun NextPrev() {
    nextText(text = "Далее", onClick = {})
}