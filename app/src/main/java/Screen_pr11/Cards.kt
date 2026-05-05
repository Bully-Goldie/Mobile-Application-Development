package Screen_pr11

import Components_pr11.AnalysisItem
import Components_pr11.Cards
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp

@Composable
fun ListCards(modifier: Modifier = Modifier,
              item: AnalysisItem,
              ) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .dropShadow(
                shape = RoundedCornerShape(20.dp),
                shadow = Shadow(
                    radius = 20.dp,
                    spread = 0.dp,
                    color = Color(0x99E4E8F5),
                    offset = DpOffset(0.dp, 0.dp)
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Cards(
            name = item.name,
            day = item.day,
            price = item.price,
            onClick = { }
        )
    }
}