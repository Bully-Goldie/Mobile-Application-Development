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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.ui.theme.InputStroke
import com.example.mobileapplicationdevelopment_zamt.ui.theme.plaseH
import com.example.mobileapplicationdevelopment_zamt.ui.theme.textF

@Composable
fun TextInput(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        placeholder = { Text(
            text = "Поле для ввода с подсказкой",
            color = plaseH.copy(alpha = 0.5f),
            fontSize = 15.sp,
            modifier = modifier
                .width(221.dp)
                .height(20.dp)
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
    TextInput()
}

@Composable
fun TextFieldInf(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("Поле с введенной информацией") }

    TextField(
        value = text,
        onValueChange = { text = it },
        textStyle = TextStyle(
            fontSize = 15.sp,
            color = plaseH
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
    TextFieldInf()
}