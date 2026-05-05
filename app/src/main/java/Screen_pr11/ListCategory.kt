package Screen_pr11

import Components_pr11.Categories
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ListCategory(modifier: Modifier = Modifier,
                 itemsListCategory: List<String>) {
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