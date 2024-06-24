package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.ui.theme.ComposeTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                SecondScreen()
            }
        }
    }
}

@Composable
fun SecondScreen() {
    Text(text = "Welcome to the Second Activity!")
}

@Preview(showBackground = true)
@Composable
fun SecondScreenPreview() {
    ComposeTheme {
        SecondScreen()
    }
}
