package ezra.mit.ui.skirts

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import ezra.mit.R
import ezra.mit.ui.auth.AuthViewModel


@Composable
fun skirtsScreen(viewModel: AuthViewModel?, navController: NavController) {

  LazyVerticalGrid(columns = GridCells.Adaptive(126.dp) ,
      content ={





      }


  )



}



    @Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
    @Composable
    fun skirtsScreenPreviewLight() {
        skirtsScreen(null, rememberNavController())
    }


