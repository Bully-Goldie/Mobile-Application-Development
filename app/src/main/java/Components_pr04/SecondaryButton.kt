package Components_pr04

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mobileapplicationdevelopment_zamt.ui.theme.colorBtn

@Composable
fun SecondaryButton(modifier: Modifier = Modifier) {
    OutlinedButton(
        onClick = { },
        border = BorderStroke(1.dp, colorBtn),
        modifier = modifier
            .width(335.dp)
            .height(48.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(
            text = "Еще одна кнопка",
            color = colorBtn,
            modifier = modifier
                .width(119.dp)
                .height(20.dp)
        )
    }
}

@Preview
@Composable
private fun SecondaryButtonPreview() {
    SecondaryButton()
}