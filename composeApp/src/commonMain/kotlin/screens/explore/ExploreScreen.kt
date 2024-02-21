package screens.explore

import androidx.compose.animation.Crossfade
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.getScreenModel
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

data object ExploreScreen : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val screenModel: ExploreScreenModel = getScreenModel()
        val eventsState by screenModel.events.collectAsState()

        LaunchedEffect(screenModel) {
            screenModel.getEvents()
        }

        Crossfade(
            targetState = eventsState
        ) { state ->
            when (state) {
                is ExploreScreenState.Loading -> Text("Loading")
                is ExploreScreenState.Error -> Text("Error")
                is ExploreScreenState.Empty -> Text("Empty")
                is ExploreScreenState.Loaded -> Text("Events: ${state.data.size}")
            }
        }
    }
}