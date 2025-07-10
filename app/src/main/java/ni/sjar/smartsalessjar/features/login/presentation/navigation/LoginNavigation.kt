package ni.sjar.smartsalessjar.features.login.presentation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import ni.sjar.smartsalessjar.features.login.presentation.screens.LoginScreen

const val LOGIN_ROUTE = "login"

fun NavGraphBuilder.loginGraph(navController: NavHostController) {
    composable(LOGIN_ROUTE) {
        LoginScreen(navController)
    }
}