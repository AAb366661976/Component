package com.example.component

import android.R.attr.text
import android.R.attr.value
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.component.ui.theme.ComponentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComponentTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Greeting(
                        name = "黃歆芝",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var x = remember { mutableStateOf(value = 0) }

    Column {

        Row{
            Button(
                modifier = modifier,

                onClick = {
                    var x=0
                }

            ) {

                Text(text="歸零")


                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "圖片",
                    modifier =modifier.size(30.dp),

                )
            }


            Button(
                modifier = modifier,
                onClick ={
                    x.value*=2
                }
            ) {
                Text(text="雙倍")
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "圖片",
                    modifier =modifier.size(30.dp),
                )

            }
        }


        Row {
            Text(
                text = stringResource(R.string.author),
                fontFamily = FontFamily(Font(R.font.hand)),
                fontSize = 50.sp,
                color = Color.Blue,
                modifier = modifier
            )
            Image(
                painter = painterResource(id = R.drawable.xin),
                contentDescription = "圖片",
                alpha = 0.7f,
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.Black)
            )

        }
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center

        ) {
            Image(
                painter = painterResource(id = R.drawable.xin),
                contentDescription = "圖片",
                alpha = 0.7f,
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.Black)
            )
        }

    }

}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComponentTheme {
        Greeting("Android")
    }
}