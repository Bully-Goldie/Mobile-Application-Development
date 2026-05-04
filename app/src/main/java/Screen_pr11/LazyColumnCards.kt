package Screen_pr11

import Components_pr11.AnalysisItem
import Components_pr11.Cards
import Components_pr11.Categories
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnCards(
    modifier: Modifier = Modifier,
    itemsListCategory: List<String>,
    analysisList: List<AnalysisItem>
) {
    val itemsListCategory = itemsListCategory
    val analysisList = analysisList

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(bottom = 20.dp)
    ) {
        item {
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(horizontal = 20.dp, vertical = 24.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(itemsListCategory) { item ->
                    Categories(
                        onClickBtn = {},
                        textBtn = item,
                        widthBtn = 131,
                        heightBtn = 48
                    )
                }
            }
        }
        items(analysisList, key = { it.id }) { item ->
            Box(
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .dropShadow(
                        shape = RoundedCornerShape(20.dp),
                        shadow = Shadow(
                            radius = 20.dp,
                            spread = 0.dp,
                            color = Color(0x99E4E8F5),
                            offset = DpOffset(0.dp, 0.dp)
                        )
                    )
            ) {
                Cards(
                    name = item.name,
                    day = item.day,
                    price = item.price,
                    onClick = { }
                )
            }
        }
    }
}

@Preview
@Composable
private fun LazyColumnCardsPrev() {
    LazyColumnCards(
        itemsListCategory = listOf("Популярные", "Covid", "Комплексные"),
        analysisList = listOf(
            AnalysisItem(1, "ПЦР-тест на определение РНК коронавируса стандартный", 2, 1800),
            AnalysisItem(2, "Клинический анализ крови с лейкоцитарной формулой", 1, 690),
            AnalysisItem(3, "Биохимический анализ крови, базовый", 1, 2440),
            AnalysisItem(4, "Биохимический анализ крови, базовый", 1, 2440),
            AnalysisItem(5, "СОЭ (венозная кровь)", 1, 240)
        )
    )
}