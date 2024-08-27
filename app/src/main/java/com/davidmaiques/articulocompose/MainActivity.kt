package com.davidmaiques.articulocompose

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.davidmaiques.articulocompose.ui.theme.ArticuloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArticuloComposeTheme {
                    Greeting(
                        modifier = Modifier


                    )
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {

Column(modifier = modifier) {

    Image(
        painter = painterResource(id = R.drawable.bg_compose_background),
        contentDescription = "Imagen cabecera",
        modifier= Modifier.fillMaxWidth(),

    )

    Text(
        text = "Jetpack Compose tutorial",
        modifier = modifier
            .padding(20.dp),
        textAlign = TextAlign.Center,
        style = TextStyle(
            fontSize = 24.sp,
        ),

        


    )

    Text(
        text ="Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies " +
                "and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
        textAlign = TextAlign.Justify,
        modifier = modifier.padding(vertical = 8.dp, horizontal = 20.dp),

    )

    Text(
        text ="In this tutorial, you build a simple UI component with declarative functions. Y" +
                "ou call Compose functions to say what elements you want and the Compose compiler does the rest. " +
                "Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically " +
                "because they let you describe how it should look and provide data dependencies, rather than focus on the process " +
                "of the UI\\'s construction, such as initializing an element and then attaching it to a parent. " +
                "To create a Composable function, you add the @Composable annotation to the function name.",
        textAlign = TextAlign.Justify,
        modifier = modifier.padding(vertical = 8.dp, horizontal = 20.dp),
    )


}


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticuloComposeTheme {
        Greeting()
    }
}