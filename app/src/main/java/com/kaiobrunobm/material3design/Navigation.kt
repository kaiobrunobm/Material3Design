package com.kaiobrunobm.material3design

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kaiobrunobm.material3design.Menus


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigation(value: Boolean, onValueChange: (Boolean) -> Unit) {


    val navController = rememberNavController()

    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(
                    text = "Back", fontWeight = FontWeight.Light, fontSize = 16.sp
                )
            }, navigationIcon = {
                IconButton(
                    onClick = {
                        navController.popBackStack()
                    }) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowUp,
                        contentDescription = "Back activity button",
                        modifier = Modifier
                            .rotate(-90f)
                            .size(30.dp)
                    )
                }
            }, actions = {
                DarkThemeSwitch(value = value, onValueChange = onValueChange)
            })
        }) { values ->
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(values)
        ) {

            NavHost(
                navController = navController, startDestination = Screen.ButtonScreen.route
            ) {

                composable(route = Screen.ButtonScreen.route, exitTransition = {
                    slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right, tween(500)
                    )
                }, enterTransition = {
                    slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left, tween(500)
                    )
                }) {
                    Buttons(navController = navController)
                }
                composable(route = Screen.TextFieldsScreen.route, exitTransition = {
                    slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right, tween(500)
                    )
                }, enterTransition = {
                    slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left, tween(500)
                    )
                }) {
                    TextFields(navController = navController)
                }
                composable(route = Screen.SelectionScreen.route, exitTransition = {
                    slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right, tween(500)
                    )
                }, enterTransition = {
                    slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left, tween(500)
                    )
                }) {
                    Selections(navController = navController)
                }
                composable(route = Screen.TopAppBarScreen.route, exitTransition = {
                    slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right, tween(500)
                    )
                }, enterTransition = {
                    slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left, tween(500)
                    )
                }) {
                    TopAppBarComponent(navController = navController)
                }
                composable(route = Screen.BadgesScreen.route, exitTransition = {
                    slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right, tween(500)
                    )
                }, enterTransition = {
                    slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left, tween(500)
                    )
                }) {
                    Badges(navController = navController)
                }
                composable(route = Screen.BottomAppBar.route, exitTransition = {
                    slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right, tween(500)
                    )
                }, enterTransition = {
                    slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left, tween(500)
                    )
                }) {
                    BottomAppBar(navController = navController)
                }
                composable(route = Screen.Cards.route, exitTransition = {
                    slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right, tween(500)
                    )
                }, enterTransition = {
                    slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left, tween(500)
                    )
                }) {
                    Cards(navController = navController)
                }
                composable(route = Screen.Chips.route, exitTransition = {
                    slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right, tween(500)
                    )
                }, enterTransition = {
                    slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left, tween(500)
                    )
                }) {
                    Chips(navController = navController)
                }
                composable(route = Screen.Dialogs.route, exitTransition = {
                    slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right, tween(500)
                    )
                }, enterTransition = {
                    slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left, tween(500)
                    )
                }) {
                    Dialogs(navController = navController)
                }

                composable(route = Screen.Menus.route, exitTransition = {
                    slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Right, tween(500)
                    )
                }, enterTransition = {
                    slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Left, tween(500)
                    )
                }) {
                    Menus()
                }
            }

        }
    }
}
