package Screen_pr11

import Components_pr11.ViewModel
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun LazyColumnCards(
    modifier: Modifier = Modifier,
    viewModel: ViewModel = viewModel()
) {
    val itemsListCategory by viewModel.categories.collectAsState()
    val analysisList by viewModel.analysisItems.collectAsState()


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        ListCategory(itemsListCategory = itemsListCategory)

        ListCards(analysisList = analysisList)
    }
}

@Preview
@Composable
private fun LazyColumnCardsPrev() {
    LazyColumnCards()
}