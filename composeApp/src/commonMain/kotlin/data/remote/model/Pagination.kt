package data.remote.model

import kotlinx.serialization.Serializable

@Serializable
data class Pagination(
    val page: Int,
    val pageSize: Int,
    val pageCount: Int,
    val total: Int,
)