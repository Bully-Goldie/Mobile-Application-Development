package Screen_pr11

import Components_pr11.AnalysisItem
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ListCards(modifier: Modifier = Modifier,analysisList: List<AnalysisItem>) {
    val analysisList = analysisList
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(bottom = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(analysisList, key = { it.id }) { item ->
            ListCards(item = item)
        }
    }
}
