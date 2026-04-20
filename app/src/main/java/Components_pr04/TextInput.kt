package Components_pr04

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.ui.theme.InputStroke
import com.example.mobileapplicationdevelopment_zamt.ui.theme.plaseH
import com.example.mobileapplicationdevelopment_zamt.ui.theme.textF

@Composable
fun TextInput(modifier: Modifier = Modifier, text: String, value: String, onValueChange: (String) -> Unit) {
    var textI by remember { mutableStateOf("") }

    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = { Text(
            text = text,
            color = plaseH.copy(alpha = 0.5f),
            fontSize = 15.sp,
            fontWeight = FontWeight.W400,
            letterSpacing = 0.sp,
            lineHeight = 20.sp
        )},
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = textF,
            unfocusedContainerColor = textF,
            focusedBorderColor = InputStroke,
            unfocusedBorderColor = InputStroke),
        shape = RoundedCornerShape(10.dp),
        modifier = modifier
            .width(335.dp)
            .height(50.dp)
    )
}

@Preview
@Composable
private fun TextInputPreview() {
    val text = remember { mutableStateOf("") }
    TextInput(text = "Поле для ввода с подсказкой", value = text.value, onValueChange = { text.value = it })
}

@Composable
fun TextFieldInf(modifier: Modifier = Modifier, value: String, onValueChange: (String) -> Unit) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        textStyle = TextStyle(
            fontSize = 15.sp,
            color = plaseH,
            fontWeight = FontWeight.W400,
            letterSpacing = 0.sp,
            lineHeight = 20.sp
        ),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = textF
        ),
        shape = RoundedCornerShape(10.dp),
        modifier = modifier
            .width(335.dp)
            .height(48.dp)
    )
}

@Preview
@Composable
private fun TextFieldInfPreview() {
    val text = remember { mutableStateOf("Поле с введенной информацией") }
    TextFieldInf(value = text.value, onValueChange = { text.value = it })
}