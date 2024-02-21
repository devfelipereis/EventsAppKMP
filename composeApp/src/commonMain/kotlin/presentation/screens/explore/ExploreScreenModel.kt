package presentation.screens.explore

import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import domain.usecase.GetEvents
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ExploreScreenModel(private val getEventsUseCase: GetEvents) : ScreenModel {
    private val _events: MutableStateFlow<ExploreScreenState> = MutableStateFlow(
        ExploreScreenState.Loading
    )

    val events = _events.asStateFlow()

    suspend fun getEvents() {
        _events.update { ExploreScreenState.Loading }

        screenModelScope.launch {
            try {
                _events.update { ExploreScreenState.Loaded(getEventsUseCase()) }
            } catch (e: Exception) {
                _events.update { ExploreScreenState.Error(e.toString()) }
            }
        }
    }
}