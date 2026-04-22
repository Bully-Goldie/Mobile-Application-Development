package com.example.mobileapplicationdevelopment_zamt

import Screen.SignAppScreen
import Screen_pr09.OrderScreen
import Screen_pr09.paymentScreen
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mobileapplicationdevelopment_zamt.ui.theme.MyTheme_pr07

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = "auth"
            ) {
                composable("auth") {
                    SignAppScreen(
                        onNextClick = {
                            navController.navigate("order")
                        }
                    )
                }

                composable("order") {
                    OrderScreen(
                        onOrderClick = {
                            navController.navigate("payment_success")
                        },
                        backClick = {
                            navController.popBackStack()
                        }
                    )
                }

                composable("payment_success") {
                    paymentScreen(
                        homeBack = {},
                        checkOrder = {}
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyTheme_pr07 {
        Greeting("Android")
    }
}