package ezra.mit.ui.open

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import ezra.mit.R
import ezra.mit.data.Resource
import ezra.mit.navigation.ROUTE_ABOUT
import ezra.mit.navigation.ROUTE_HOME
import ezra.mit.navigation.ROUTE_LOGIN
import ezra.mit.navigation.ROUTE_OPEN
import ezra.mit.navigation.ROUTE_SIGNUP
import ezra.mit.ui.auth.AuthViewModel
import ezra.mit.ui.theme.AppTheme
import ezra.mit.ui.theme.md_theme_dark_shadow
import ezra.mit.ui.theme.spacing
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.NonDisposableHandle.parent

@OptIn(ExperimentalMaterial3Api::class, InternalCoroutinesApi::class)
@Composable
fun openScreen(viewModel: AuthViewModel?, navController: NavController) {

    Box(
        contentAlignment = Alignment.Center

    ) {

        Image(
            painter = painterResource(id = R.drawable.fantasy),
            contentDescription = "Andy Rubin",
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.FillBounds,
            alpha = DefaultAlpha
        )

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ) {

            Text(
                modifier = Modifier
                    .clickable {
                        navController.navigate(ROUTE_LOGIN) {
                            popUpTo(ROUTE_OPEN) { inclusive = true }
                        }
                    },
                text = "SHOP WITH US",
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline,
                style = TextStyle(
                    shadow = Shadow(
                        color = Color.Black)
                )
            )



        }

    }
}






@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun openScreenPreviewLight() {
    AppTheme {
        openScreen(null, rememberNavController())
    }
}

