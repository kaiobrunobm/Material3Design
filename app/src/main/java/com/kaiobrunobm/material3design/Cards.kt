package com.kaiobrunobm.material3design

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable

fun Cards(navController: NavController) {
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
                text = "Cards",
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
                modifier = Modifier.padding(top = 24.dp)
            ) {
                // Content
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {

                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .padding(14.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth(),
                    ) {
                        Text(
                            text = "Filled",
                            textAlign = TextAlign.Center,
                        )
                        IconButton(
                            onClick = {/*TODO()*/ }) {

                            Icon(
                                imageVector = Icons.Filled.MoreVert,
                                contentDescription = "More card button"
                            )
                        }
                    }


                }

                ElevatedCard(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .padding(14.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth(),
                    ) {
                        Text(
                            text = "Elevated",
                            textAlign = TextAlign.Center,
                        )
                        IconButton(
                            onClick = {/*TODO()*/ }) {

                            Icon(
                                imageVector = Icons.Filled.MoreVert,
                                contentDescription = "More card button"
                            )
                        }
                    }

                }

                OutlinedCard(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .padding(14.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth(),
                    ) {
                        Text(
                            text = "OutLined",
                            textAlign = TextAlign.Center,
                        )
                        IconButton(
                            onClick = {/*TODO()*/ }) {

                            Icon(
                                imageVector = Icons.Filled.MoreVert,
                                contentDescription = "More card button"
                            )
                        }
                    }

                }

            }

            //Navigation Button
            Button(
                onClick = {
                    navController.navigate(Screen.Chips.route)
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
