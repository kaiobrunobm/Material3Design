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
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun BottomAppBar(navController: NavController) {
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
                text = "Bottom app bar",
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
                // Content

                BottomAppBar(modifier = Modifier.padding(bottom = 24.dp), actions = {
                    IconButton(
                        onClick = {/*TODO()*/ }) {
                        Icon(
                            imageVector = Icons.Filled.Check, contentDescription = "Check button"
                        )
                    }
                    IconButton(
                        onClick = {/*TODO()*/ }) {
                        Icon(
                            imageVector = Icons.Filled.Create, contentDescription = "Pencil button"
                        )
                    }
                    IconButton(
                        onClick = {/*TODO()*/ }) {
                        Icon(
                            painter = painterResource(R.drawable.mic_24dp_e3e3e3_fill1_wght400_grad0_opsz24),
                            contentDescription = "Mic button"
                        )
                    }
                    IconButton(
                        onClick = {/*TODO()*/ }) {
                        Icon(
                            painter = painterResource(R.drawable.image),
                            contentDescription = "Image button"
                        )
                    }
                }, floatingActionButton = {
                    FloatingActionButton(
                        onClick = {/*TODO()*/ },
                        containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                        elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Add,
                            contentDescription = "Add floating button"
                        )
                    }
                })

            }

            //Navigation Button
            Button(
                onClick = {
                    navController.navigate(Screen.Cards.route)
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
}
