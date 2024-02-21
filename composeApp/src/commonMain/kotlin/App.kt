import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import presentation.screens.explore.ExploreScreen

@Composable
fun App() {
    MaterialTheme {
        Navigator(ExploreScreen)
    }
}