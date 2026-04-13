package Components_pr05

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
import com.example.mobileapplicationdevelopment_zamt.ui.theme.ButtonFalse
import com.example.mobileapplicationdevelopment_zamt.ui.theme.ButtonTrue


@Composable
fun Button(modifier: Modifier = Modifier) {
    Button(
        onClick = {},
        modifier = Modifier
            .width(335.dp)
            .height(56.dp),
        enabled = false,
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = ButtonTrue,
            contentColor = Color.White,
            disabledContainerColor = ButtonFalse,
            disabledContentColor = Color.White
        )) {
        Text(
            text = "Далее",
            fontSize = 17.sp
        )
    }
}

@Preview
@Composable
private fun ButtonFalsePrev() {
    Button()
}