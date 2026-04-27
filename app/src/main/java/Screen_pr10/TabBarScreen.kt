package Screen_pr10

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileapplicationdevelopment_zamt.R
import com.example.mobileapplicationdevelopment_zamt.ui.theme.TabBarColorFalse
import com.example.mobileapplicationdevelopment_zamt.ui.theme.TabBarColorTrue

@Composable
fun TabBarScreen(items: List<String>, icons: List<Int>) {
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
                            icon = { Icon(
                                painter = painterResource(id = icons[index]),
                                contentDescription = item
                            )  },
                            label = { Text(
                                text = item,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.W400,
                                letterSpacing = 0.sp,
                                lineHeight = 16.sp,
                                textAlign = TextAlign.Center
                                ) },
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
            Text("Выбран экран: ${items[selectedItem]}")
        }
    }
}

@Preview
@Composable
private fun TabBarScreenPrev() {
    TabBarScreen(
        items = listOf("Анализы", "Результаты", "Поддержка", "Профиль"),
        icons = listOf(R.drawable.analizy, R.drawable.results, R.drawable.help, R.drawable.user))
}