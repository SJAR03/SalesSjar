package ni.sjar.smartsalessjar.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import ni.sjar.smartsalessjar.features.login.presentation.navigation.loginGraph

@Composable
fun AppNavHost(navController: NavHostController = rememberNavController()) {
    NavHost(navController, startDestination = "login") {
        loginGraph(navController)
    }
}