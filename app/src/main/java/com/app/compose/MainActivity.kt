package com.app.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.compose.ui.theme.JetpackComposeTheme
import com.app.compose.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        Greeting("Android")
                        CustomText("Hi Himanshu")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun CustomText(text: String) {
    Text(
        text = text,
        style = Typography.headlineLarge
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .weight(2f),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Surface(
                    modifier = Modifier
                        .width(200.dp)
                        .height(50.dp),
                    color = MaterialTheme.colorScheme.primary
                ) {}
                Surface(
                    modifier = Modifier
                        .width(200.dp)
                        .height(50.dp),
                    color = MaterialTheme.colorScheme.secondary
                ) {}
                Surface(
                    modifier = Modifier
                        .width(200.dp)
                        .height(50.dp),
                    color = MaterialTheme.colorScheme.tertiary
                ) {}
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Surface(
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp),
                    color = MaterialTheme.colorScheme.primary
                ) {}
                Surface(
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp),
                    color = MaterialTheme.colorScheme.secondary
                ) {}
                Surface(
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp),
                    color = MaterialTheme.colorScheme.tertiary
                ) {}
            }
        }
    }
}