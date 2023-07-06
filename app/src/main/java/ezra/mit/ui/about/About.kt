package ezra.mit.ui.about


import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import ezra.mit.R
import ezra.mit.data.Resource
import ezra.mit.navigation.ROUTE_ABOUT
import ezra.mit.navigation.ROUTE_HOME
import ezra.mit.navigation.ROUTE_LOGIN
import ezra.mit.navigation.ROUTE_SIGNUP
import ezra.mit.ui.auth.AuthViewModel
import ezra.mit.ui.theme.AppTheme
import ezra.mit.ui.theme.spacing
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.NonDisposableHandle.parent

@OptIn(ExperimentalMaterial3Api::class, InternalCoroutinesApi::class)
@Composable
fun AboutScreen(viewModel: AuthViewModel?, navController: NavController) {

    Column() {

        Image(
            painter = painterResource(id = R.drawable.purple),
            contentDescription = "Andy Rubin",
            modifier = Modifier.fillMaxWidth()
        )



    }






}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun AboutScreenPreviewLight() {
    AppTheme {
        AboutScreen(null, rememberNavController())
    }
}

