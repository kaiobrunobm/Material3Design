package com.kaiobrunobm.material3design

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
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


@Composable
fun Chips(navController: NavController) {
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
                text = "Chips",
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

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 24.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.Center,

                        ) {
                        AssistChip(onClick = {/*TODO()*/ }, label = {
                            Text(
                                text = "Assist chip"
                            )
                        }, leadingIcon = {
                            Icon(
                                imageVector = Icons.Filled.Settings,
                                contentDescription = "Settings icon",
                                modifier = Modifier.size(AssistChipDefaults.IconSize)
                            )
                        })
                        Spacer(
                            modifier = Modifier.size(8.dp)
                        )

                        FilterChipComponent()

                        Spacer(
                            modifier = Modifier.size(8.dp)
                        )


                    }

                    Row {
                        InputChipComponent()
                        Spacer(
                            modifier = Modifier.size(8.dp)
                        )

                        SuggestionChip(
                            onClick = { Log.d("Suggestion chip", "hello world") },
                            label = { Text("Suggestion chip") })
                    }
                }
            }

            //Navigation Button
            Button(
                onClick = {
                    navController.navigate(Screen.Dialogs.route)
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

@Composable
fun FilterChipComponent() {
    var selected by remember {
        mutableStateOf(false)
    }

    FilterChip(
        onClick = { selected = !selected }, label = {
        Text(
            text = "Filter chip"
        )
    }, selected = selected, leadingIcon = if (selected) {
        {
            Icon(
                imageVector = Icons.Filled.Check,
                contentDescription = "Checked icon",
                modifier = Modifier.size(FilterChipDefaults.IconSize)
            )
        }
    } else {
        null
    })
}

@Composable
fun InputChipComponent() {
    var enable by remember {
        mutableStateOf(true)
    }
    if (!enable) return

    InputChip(
        onClick = { /*TODO()*/ },
        label = { Text("Input chip") },
        selected = enable,
        leadingIcon = {
            Icon(
                imageVector = Icons.Filled.Person,
                contentDescription = "Avatar icon",
                modifier = Modifier.size(InputChipDefaults.IconSize)
            )
        },
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = "Close button",
                modifier = Modifier
                    .size(InputChipDefaults.IconSize)
                    .clickable(
                        onClick = {
                            enable = !enable
                        })
            )
        },

        )
}
