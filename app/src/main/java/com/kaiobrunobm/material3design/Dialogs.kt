package com.kaiobrunobm.material3design

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Dialogs(navController: NavController) {
    var openAlertDialog by remember { mutableStateOf(false) }
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Text(
                text = "Dialogs",
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
                Button(
                    modifier = Modifier.padding(bottom = 24.dp), onClick = {
                        openAlertDialog = !openAlertDialog
                    }) {
                    Text("Open dialog")
                }

                when {
                    openAlertDialog -> {
                        AlertDialogComponent(
                            onDismissRequest = { openAlertDialog = false },
                            onConfirmation = {
                                openAlertDialog = false
                                println("Confirmation registered") // Add logic here to handle confirmation.
                            },
                            dialogTitle = "Alert dialog example",
                            dialogText = "This is an example of an alert dialog with buttons.",
                            icon = Icons.Default.Info
                        )
                    }
                }

            }

            //Navigation Button
            Button(
                onClick = {
                    navController.navigate(Screen.Menus.route)
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
fun AlertDialogComponent(
    onDismissRequest: () -> Unit,
    onConfirmation: () -> Unit,
    dialogTitle: String,
    dialogText: String,
    icon: ImageVector,
) {
    AlertDialog(icon = {
        Icon(icon, contentDescription = "Example Icon")
    }, title = {
        Text(text = dialogTitle)
    }, text = {
        Text(text = dialogText)
    }, onDismissRequest = {
        onDismissRequest()
    }, confirmButton = {
        TextButton(
            onClick = {
                onConfirmation()
            }) {
            Text("Confirm")
        }
    }, dismissButton = {
        TextButton(
            onClick = {
                onDismissRequest()
            }) {
            Text("Dismiss")
        }
    })
}
