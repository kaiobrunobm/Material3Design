package com.kaiobrunobm.material3design

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun DarkThemeSwitch(value: Boolean, onValueChange: (Boolean) -> Unit) {

    var switch by remember {
        mutableStateOf(
            ToggleableInfo(
                isChecked = value
            )
        )
    }



    Row(
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 18.dp, end = 18.dp)
    ) {
        Switch(
            checked = value, onCheckedChange = onValueChange, thumbContent = {
                Icon(
                    painterResource(
                        if (switch.isChecked) {
                            R.drawable.mon
                        } else {
                            R.drawable.sun
                        }
                    ),
                    contentDescription = "Theme switcher",
                    modifier = Modifier.size(18.dp),
                    tint = MaterialTheme.colorScheme.inversePrimary
                )
            }

        )

    }
}