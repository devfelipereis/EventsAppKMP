package data.remote.reponse

import data.remote.model.Event
import data.remote.model.Meta
import kotlinx.serialization.Serializable

@Serializable
data class EventsResponse(
    val data: List<Event>,
    val meta: Meta
)