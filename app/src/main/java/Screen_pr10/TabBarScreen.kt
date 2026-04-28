package Screen_pr10

import Components_pr11.AnalysisItem
import Components_pr11.Cards
import Components_pr11.Categories
import Screen.Screen
import Screen_pr09.paymentScreen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.R
import com.example.mobileapplicationdevelopment_zamt.ui.theme.TabBarColorFalse
import com.example.mobileapplicationdevelopment_zamt.ui.theme.TabBarColorTrue

private val vertical = Arrangement.spacedBy(16.dp)

@Composable
fun TabBarScreen(
    items: List<String>,
    icons: List<Int>,
    itemsListCategory: List<String>,
    analysisList: List<AnalysisItem>
) {
    var selectedItem by remember { mutableIntStateOf(0) }

    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = Color.Transparent,
                tonalElevation = 0.dp
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    Arrangement.spacedBy(19.dp)
                ) {
                    items.forEachIndexed { index, item ->
                        val isSelected = selectedItem == index
                        NavigationBarItem(
                            icon = {
                                Icon(
                                    painter = painterResource(id = icons[index]),
                                    contentDescription = item
                                )
                            },
                            label = {
                                Text(
                                    text = item,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.W400,
                                    letterSpacing = 0.sp,
                                    lineHeight = 16.sp,
                                    textAlign = TextAlign.Center
                                )
                            },
                            selected = isSelected,
                            onClick = { selectedItem = index },
                            colors = NavigationBarItemDefaults.colors(
                                selectedIconColor = TabBarColorTrue,
                                selectedTextColor = TabBarColorTrue,
                                unselectedTextColor = TabBarColorFalse,
                                unselectedIconColor = TabBarColorFalse,
                                indicatorColor = Color.Transparent
                            )
                        )
                    }
                }
            }
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            when (selectedItem) {
                0 -> {
                    val itemsListCategory = itemsListCategory
                    val analysisList = analysisList

                    LazyColumn(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color(0xFFF5F5F5)),
                        verticalArrangement = Arrangement.spacedBy(16.dp),
                        contentPadding = PaddingValues(bottom = 20.dp)
                    ) {
                        item {

                            LazyRow(
                                modifier = Modifier.fillMaxWidth(),
                                contentPadding = PaddingValues(horizontal = 20.dp),
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
                            Box(modifier = Modifier.padding(horizontal = 20.dp)) {
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
                else -> {
                    Text(
                        text = "Выбран экран: ${items[selectedItem]}",
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun TabBarScreenPrev() {
    TabBarScreen(
        items = listOf("Анализы", "Результаты", "Поддержка", "Профиль"),
        icons = listOf(R.drawable.analizy, R.drawable.results, R.drawable.help, R.drawable.user),
        itemsListCategory = listOf("Популярные", "Covid", "Комплексные"),
        analysisList = listOf(
            AnalysisItem(1, "ПЦР-тест на определение РНК коронавируса стандартный", 2,1800),
            AnalysisItem(2, "Клинический анализ крови с лейкоцитарной формулой", 1, 690),
            AnalysisItem(3, "Биохимический анализ крови, базовый", 1, 2440),
            AnalysisItem(4, "Биохимический анализ крови, базовый", 1, 2440),
            AnalysisItem(5, "СОЭ (венозная кровь)", 1, 240)))
}