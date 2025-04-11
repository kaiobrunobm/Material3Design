package com.kaiobrunobm.material3design

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kaiobrunobm.material3design.ui.theme.Material3DesignTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Material3DesignTheme {
                Buttons()
            }
        }
    }
}

@Composable
fun Buttons(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Text(
                text = "Buttons",
                fontWeight = FontWeight.Bold,
                fontSize = 36.sp
            )
            Text(
                text = "Google Material Design 3",
                fontWeight = FontWeight.Light
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(top = 40.dp)
            ) {
                Button(
                    onClick = { println("Hello") }
                ) {
                    Text(
                        text = "Subscribe"
                    )
                }

                ElevatedButton(
                    onClick = { println("Hello") }
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add to cart icon",
                        modifier = Modifier
                            .size(18.dp)
                    )
                    Spacer(
                        modifier = Modifier
                            .width(8.dp)
                    )
                    Text(
                        text = "Add to cart"
                    )
                }

                FilledTonalButton(
                    onClick = { println("Hello") }
                ) {
                    Text(
                        text = "Open in browser"
                    )
                }

                OutlinedButton(
                    onClick = { println("Hello") }
                ) {
                    Text(
                        text = "Back"
                    )
                }

                TextButton(
                    onClick = { println("Hello") }
                ) {
                    Text(
                        text = "Learn more"
                    )
                }
            }


        }
        Button(
            onClick = { println("Hello") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp)
                .size(60.dp)
        ) {

            Text(
                text = "Next component",
                fontSize = 18.sp
            )
            Spacer(
                modifier = Modifier
                    .size(8.dp)
            )
            Icon(
                Icons.Default.KeyboardArrowUp,
                contentDescription = "Next component button",
                modifier = Modifier
                    .rotate(90f)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ButtonsPreview() {
    Material3DesignTheme {
        Buttons()
    }
}