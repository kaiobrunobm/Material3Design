package com.kaiobrunobm.material3design

sealed class Screen(val route: String) {
    object ButtonScreen : Screen(route = "button_screen")
    object TextFieldsScreen : Screen(route = "text_field_screen")
    object SelectionScreen : Screen(route = "selection_screen")
    object TopAppBarScreen : Screen(route = "top_app_bar_screen")
    object BadgesScreen : Screen(route = "badges_screen")
    object BottomAppBar : Screen(route = "bottom_app_bar")
    object Cards : Screen(route = "cards")
    object Chips : Screen(route = "chips")
    object Dialogs : Screen(route = "dialogs")
    object Menus : Screen(route = "menus")
}