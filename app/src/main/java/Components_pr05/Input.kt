package Components_pr05

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.ui.theme.EmailText
import com.example.mobileapplicationdevelopment_zamt.ui.theme.InputBG
import com.example.mobileapplicationdevelopment_zamt.ui.theme.InputS

@Composable
fun Input(modifier: Modifier = Modifier, label: String, placeholderText: String, value: String, onValueChange: (String) -> Unit) {
    var emailValue by remember { mutableStateOf("") }
    Box(
        modifier = Modifier
            .width(335.dp)
            .height(72.dp)

    ) {
        Text(
            text = label,
            fontSize = 14.sp,
            color = EmailText,
            fontWeight = FontWeight.W400,
            lineHeight = 20.sp,
            letterSpacing = 0.sp
        )
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = InputBG,
                unfocusedContainerColor = InputBG,
                focusedBorderColor = InputS,
                unfocusedBorderColor = InputS
            ),
            placeholder = {
                Text(
                    text = placeholderText,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.W400,
                    lineHeight = 20.sp,
                    letterSpacing = 0.sp
                )
            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .align(Alignment.BottomCenter)
        )
    }
}

@Preview
@Composable
private fun InputPrev() {
    val text = remember { mutableStateOf("") }
    Input(label = "Вход по E-mail", placeholderText = "example@mail.ru", value = text.value, onValueChange = { text.value = it })
}