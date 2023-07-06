package ezra.mit.ui.home

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ezra.mit.R
import ezra.mit.navigation.ROUTE_HOME
import ezra.mit.navigation.ROUTE_LOGIN
import ezra.mit.ui.auth.AuthViewModel
import ezra.mit.ui.theme.AppTheme
import ezra.mit.ui.theme.spacing

@Composable
fun HomeScreen(viewModel: AuthViewModel?, navController: NavHostController) {
    val spacing = MaterialTheme.spacing
    
    Box(
        contentAlignment = Alignment.Center

    ) {

        Image(
            painter = painterResource(id = R.drawable.minimalist),
            contentDescription = "Andy Rubin",
            modifier = Modifier.fillMaxSize()

        )


    
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(spacing.medium)
            .padding(top = spacing.extraLarge)
            .background(Color.Transparent),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
 LazyRow(modifier = Modifier
     .fillMaxWidth()
     .wrapContentHeight()
     .horizontalScroll(rememberScrollState())
 )
 {
     items(10){
         Text(text = "Item $it",
             modifier = Modifier
                 .padding(16.dp),
             textAlign = TextAlign.Center

         )
         Text(text = "SKIRTS")
         Text(text = "TROUSERS")
         Text(text = "BEACHWEAR")
         Text(text = "TOPS/BLOUSES")
         Text(text = "DRESSES")


     }
 }













            }
        }
    }



@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    HomeScreen(null, rememberNavController())
}

