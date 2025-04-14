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
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarComponent(navController: NavController) {
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
                text = "Top App Bar",
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
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(top = 30.dp)
            ) {

                HorizontalDivider()

                TopAppBar(title = {
                    Text("Top App Bar")
                }, navigationIcon = {
                    IconButton(
                        onClick = {/*TODO()*/ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Default.ArrowBack,
                            contentDescription = "Back Button",
                        )
                    }
                }, actions = {
                    IconButton(
                        onClick = {/*TODO()*/ }) {
                        Icon(
                            imageVector = Icons.Outlined.Settings,
                            contentDescription = "Settings Button"
                        )
                    }
                })

                HorizontalDivider()

                MediumTopAppBar(title = {
                    Text("Medium Top App Bar")
                }, navigationIcon = {
                    IconButton(
                        onClick = {/*TODO()*/ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Default.ArrowBack,
                            contentDescription = "Back Button",
                        )
                    }
                }, actions = {
                    IconButton(
                        onClick = {/*TODO()*/ }) {
                        Icon(
                            imageVector = Icons.Outlined.Settings,
                            contentDescription = "Settings Button"
                        )
                    }
                })

                HorizontalDivider()

                LargeTopAppBar(title = {
                    Text("Large Top App Bar")
                }, navigationIcon = {
                    IconButton(
                        onClick = {/*TODO()*/ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Default.ArrowBack,
                            contentDescription = "Back Button",
                        )
                    }
                }, actions = {
                    IconButton(
                        onClick = {/*TODO()*/ }) {
                        Icon(
                            imageVector = Icons.Outlined.Settings,
                            contentDescription = "Settings Button"
                        )
                    }
                })

                HorizontalDivider()

            }


        }
        Button(
            onClick = {
                navController.navigate(Screen.BadgesScreen.route)
                      },
            modifier = Modifier
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

