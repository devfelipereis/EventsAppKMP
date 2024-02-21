package presentation.screens.explore

import domain.model.Event

sealed class ExploreScreenState {
    data object Loading : ExploreScreenState()
    data class Error(val cause: String) : ExploreScreenState()
    data class Loaded(val data: List<Event>) : ExploreScreenState()
    data object Empty : ExploreScreenState()
}