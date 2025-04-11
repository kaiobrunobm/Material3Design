package com.kaiobrunobm.material3design

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kaiobrunobm.material3design.ui.theme.Material3DesignTheme

class SelectionComponents : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Material3DesignTheme {
                Selections()
            }
        }
    }
}

data class ToggleableInfo(
    val isChecked: Boolean, val text: String
)

@Composable
fun Selections() {
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
                text = "Selections",
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


                Column {
                    Checkboxes()
                }

                SwitchComponent()

                RadioButtonComponent()


            }

        }

        //Navigation Button
        Button(
            onClick = { println("Hello") },
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


@Composable
fun Checkboxes() {
    val checkboxes = remember {
        mutableStateListOf(
            ToggleableInfo(
                isChecked = false, text = "Photo"
            ), ToggleableInfo(
                isChecked = false, text = "Audio"
            ), ToggleableInfo(
                isChecked = false, text = "Video"
            )
        )
    }

    var triState by remember {
        mutableStateOf(ToggleableState.Indeterminate)
    }

    val toggleTriState = {
        triState = when (triState) {
            ToggleableState.Indeterminate -> ToggleableState.On
            ToggleableState.On -> ToggleableState.Off
            else -> ToggleableState.On
        }

        checkboxes.indices.forEach { index ->
            checkboxes[index] = checkboxes[index].copy(
                isChecked = triState == ToggleableState.On
            )
        }
    }

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        TriStateCheckbox(
            state = triState, onClick = toggleTriState
        )

        Text(
            text = "File Type", color = MaterialTheme.colorScheme.onBackground
        )
    }
    checkboxes.forEachIndexed { index, info ->
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp)
        ) {
            Checkbox(
                checked = info.isChecked,
                onCheckedChange = { isChecked ->
                    checkboxes[index] = info.copy(
                        isChecked = isChecked
                    )
                },
            )
            Text(
                text = info.text, color = MaterialTheme.colorScheme.onBackground
            )
        }
    }
}

@Composable
fun SwitchComponent() {
    var switch by remember {
        mutableStateOf(
            ToggleableInfo(
                isChecked = false, text = "Dark mode"
            )
        )
    }

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 18.dp, end = 18.dp)
    ) {
        Text(
            text = switch.text, color = MaterialTheme.colorScheme.onBackground
        )

        Switch(
            checked = switch.isChecked, onCheckedChange = { isChecked ->
                switch = switch.copy(
                    isChecked = isChecked
                )
            })

    }
}

@Composable
fun RadioButtonComponent() {
    val radioButtons = remember {
        mutableStateListOf(
            ToggleableInfo(
                isChecked = true, text = "PNG"
            ), ToggleableInfo(
                isChecked = false, text = "JPG"
            ), ToggleableInfo(
                isChecked = false, text = "GIF"
            )
        )
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 18.dp)
    ) {
        Text(
            text = "Type of image", color = MaterialTheme.colorScheme.onBackground
        )
    }
    Column {
        radioButtons.forEachIndexed { index, info ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 18.dp)
            ) {
                RadioButton(
                    selected = info.isChecked,
                    onClick = {
                        radioButtons.replaceAll {
                            it.copy(
                                isChecked = it.text == info.text
                            )

                        }
                    },
                )
                Text(
                    text = info.text, color = MaterialTheme.colorScheme.onBackground
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    Material3DesignTheme {
        Selections()
    }
}