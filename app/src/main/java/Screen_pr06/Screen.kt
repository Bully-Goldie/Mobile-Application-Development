package Screen

import Components_pr06.Analyzes
import Components_pr06.Finish
import Components_pr06.Monitoring
import Components_pr06.Next
import Components_pr06.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mobileapplicationdevelopment_zamt.R

@Composable
fun Screen(modifier: Modifier = Modifier) {
    val images = listOf(
        R.drawable.illustration,
        R.drawable.__2022_09_17__19_21_1,
        R.drawable._30_1
    )
    val group = listOf(
        R.drawable.group_2,
        R.drawable.group_2_1_,
        R.drawable.group_2_2_
    )
    val imageSizes = listOf(
        Modifier.size(204.00411987304688.dp, 200.46591186523438.dp),
        Modifier.size(366.dp, 217.dp),
        Modifier.size(359.dp, 269.dp)
    )

    var indexIMG by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top
        ) {
            Row {
                Spacer(modifier = Modifier.padding(10.dp))
                when (indexIMG) {
                    0 -> Next(modifier = Modifier.clickable{indexIMG = (indexIMG + 1) % images.size})
                    1 -> Next(modifier = Modifier.clickable{indexIMG = (indexIMG + 1) % images.size})
                    2 -> Finish(modifier = Modifier.clickable{indexIMG = (indexIMG + 1) % images.size})
                }
            }
            Image(
                painter = painterResource(id = R.drawable.shape),
                contentDescription = null,
                modifier = Modifier.size(167.04.dp, 163.11.dp)
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        when (indexIMG) {
            0 -> Analyzes()
            1 -> Notifications()
            2 -> Monitoring()
        }

        Spacer(modifier = Modifier.height(30.dp))

        Image(
            painter = painterResource(id = group[indexIMG]),
            contentDescription = null
        )

        Spacer(modifier = Modifier.weight(1f))

        Image(
            painter = painterResource(id = images[indexIMG]),
            contentDescription = null,
            modifier = Modifier
                .then(imageSizes[indexIMG])
        )
    }
}

@Preview
@Composable
private fun ScreenPrev() {
    Screen()
}