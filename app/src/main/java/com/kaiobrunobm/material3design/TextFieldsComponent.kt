package com.kaiobrunobm.material3design

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFields(navController: NavController) {

    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)

    ) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Text(
                text = "Text Fields",
                fontWeight = FontWeight.Bold,
                fontSize = 36.sp,
                color = MaterialTheme.colorScheme.onBackground
            )
            Text(
                text = "Google Material Design 3",
                fontWeight = FontWeight.Light,
                color = MaterialTheme.colorScheme.onBackground
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(top = 40.dp)
            ) {

                var contentTextField by remember {
                    mutableStateOf("")
                }

                var contentOutlinedTextField by remember {
                    mutableStateOf("")
                }


                TextField(
                    value = contentTextField,
                    onValueChange = { contentTextField = it },
                    label = {
                        Text("Label")
                    },
                    leadingIcon = {
                        Icon(
                            Icons.Outlined.Email, "Text input "
                        )
                    })

                OutlinedTextField(
                    value = contentOutlinedTextField,
                    onValueChange = { contentOutlinedTextField = it },
                    label = {
                        Text("Label")
                    },
                    trailingIcon = {
                        Icon(
                            Icons.Outlined.Favorite, "Text input "
                        )
                    })

            }


        }
        Button(
            onClick = {
                navController.navigate(Screen.SelectionScreen.route)
            }, modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp)
                .size(60.dp)
        ) {

            Text(
                text = "Next component", fontSize = 18.sp
            )
            Spacer(
                modifier = Modifier.size(8.dp)
            )
            Icon(
                Icons.Default.KeyboardArrowUp,
                contentDescription = "Next component button",
                modifier = Modifier.rotate(90f)
            )
        }
    }
}

