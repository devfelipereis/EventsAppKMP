package data.repository.model

data class Event(
    val id: Int,
    val name: String,
    val description: String,
    val image: String,
    val startDate: String,
    val endDate: String,
    val address: String,
    val city: String,
    val state: String,
    val latitude: Double,
    val longitude: Double,
)
