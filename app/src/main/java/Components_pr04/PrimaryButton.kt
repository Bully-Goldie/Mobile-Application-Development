package Components_pr04

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.ui.theme.colorBtn
import com.example.mobileapplicationdevelopment_zamt.ui.theme.notColorBtn

@Composable
fun PrimaryButton(modifier: Modifier = Modifier) {
    Button(onClick = {}, colors = ButtonDefaults.buttonColors(
        colorBtn, Color.White),
        modifier = modifier
            .width(335.dp)
            .height(56.dp),
        shape = RoundedCornerShape(10.dp),
    ) {
        Text(
            text = "Кнопка",
            modifier = modifier
                .width(59.dp)
                .height(24.dp),
            fontSize = 17.sp
        )
    }
}

@Preview
@Composable
private fun PrimaryButtonPreview() {
    PrimaryButton()
}
@Composable
fun NotPrimaryButton(modifier: Modifier = Modifier) {
    Button(onClick = {}, enabled = false, colors = ButtonDefaults.buttonColors(
        disabledContainerColor = notColorBtn, disabledContentColor = Color.White),
        modifier = modifier
            .width(335.dp)
            .height(56.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(
            text = "Неактивная кнопка",
            modifier = modifier
                .height(24.dp)
                .width(156.dp),
            fontSize = 17.sp
        )
    }
}

@Preview
@Composable
private fun NotPrimaryButtonPreview() {
    NotPrimaryButton()
}