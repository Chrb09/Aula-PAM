package com.example.aulapam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.aulapam.ui.theme.AulaPAMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AulaPAMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }

}

@Composable
fun App(){
    Column(
        Modifier
            .background(Color.Black)
            .fillMaxWidth()
    ) {
        Row(
            Modifier
                .background(Color.White)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Text(text = "App de notícias")
        }

        Row(
            Modifier
                .background(Color.White)
                .fillMaxWidth(),
        ) {
            Text(text = "Titulo da notícia")
        }
        Row(
            Modifier
                .background(Color.White)
                .fillMaxWidth(),
        ) {
            Text(text = "Descrição curta da notícia")
        }
        Row(
            Modifier
                .background(Color.White)
                .fillMaxWidth(),
            Arrangement.Absolute.Right
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Leia Mais")
            }
        }
    }
}

@Composable
@Preview
fun AppPreview(){
    AulaPAMTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }

}