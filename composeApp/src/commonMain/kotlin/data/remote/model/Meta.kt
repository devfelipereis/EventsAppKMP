package data.remote.model

import kotlinx.serialization.Serializable

@Serializable
data class Meta(
    val pagination: Pagination
)