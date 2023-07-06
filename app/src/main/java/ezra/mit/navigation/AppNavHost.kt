package ezra.mit.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ezra.mit.ui.auth.AuthViewModel
import ezra.mit.ui.auth.LoginScreen
import ezra.mit.ui.auth.SignupScreen
import ezra.mit.ui.home.HomeScreen
import ezra.mit.ui.open.openScreen
import ezra.mit.ui.skirts.skirtsScreen

@Composable
fun AppNavHost(
    viewModel: AuthViewModel,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_OPEN
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(ROUTE_LOGIN) {
            LoginScreen(viewModel, navController)
        }


        composable(ROUTE_SIGNUP) {
            SignupScreen(viewModel, navController)
        }


        composable(ROUTE_HOME) {
            HomeScreen(viewModel, navController)
        }

        composable(ROUTE_OPEN) {
            openScreen(viewModel, navController)
        }

    }




}

