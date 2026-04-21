package Components_pr09

import Components_pr06.mainText
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.R
import com.example.mobileapplicationdevelopment_zamt.ui.theme.EmailText
import com.example.mobileapplicationdevelopment_zamt.ui.theme.InputStroke
import com.example.mobileapplicationdevelopment_zamt.ui.theme.plaseH
import com.example.mobileapplicationdevelopment_zamt.ui.theme.textF

@Composable
fun Comment(modifier: Modifier = Modifier, mainText: String, onClick: () -> Unit, text: String, value: String, onValueChange: (String) -> Unit) {
    Box(
        modifier = Modifier
            .width(335.dp)
            .height(152.dp)
    ){
        Text(
            text = mainText,
            fontSize = 14.sp,
            modifier = Modifier
                .align(Alignment.TopStart),
            color = EmailText,
            fontWeight = FontWeight.W400,
            lineHeight = 20.sp,
            letterSpacing = 0.sp
        )
        Image(
            painter = painterResource(id = R.drawable.male),
            contentDescription = null,
            modifier = Modifier
                .size(24.dp, 20.266666412353516.dp)
                .align(Alignment.TopEnd)
                .clickable{onClick}
        )
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
                .height(128.dp)
                .align(Alignment.BottomCenter)
        )
    }
}

@Preview
@Composable
private fun CommentPrev() {
    val text = remember { mutableStateOf("") }
    Comment(mainText = "Комментарий", onClick = {}, text = "Можете оставить свои пожелания", value = text.value, onValueChange = { text.value = it })
}