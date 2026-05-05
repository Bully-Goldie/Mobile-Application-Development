package Screen_pr11

import Components_pr11.AnalysisItem
import Components_pr11.Cards
import Components_pr11.Categories
import Components_pr11.analysisGet
import Components_pr11.categoryGet
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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

    Column(
        modifier = Modifier.fillMaxSize().background(Color.White)
    ) {
        ListCategory(itemsListCategory = itemsListCategory)

        ListCards(analysisList = analysisList)
    }
}

@Preview
@Composable
private fun LazyColumnCardsPrev() {
    LazyColumnCards(
        itemsListCategory = categoryGet(),
        analysisList = analysisGet()
    )
}