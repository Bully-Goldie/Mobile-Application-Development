package com.example.mobileapplicationdevelopment_zamt

import Screen.SingAppScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobileapplicationdevelopment_zamt.ui.theme.MyTheme
import com.example.mobileapplicationdevelopment_zamt.ui.theme.MyTheme_pr07

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyTheme_pr07 {
                SingAppScreen()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    SingAppScreen()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyTheme_pr07 {
        Greeting("Android")
    }
}