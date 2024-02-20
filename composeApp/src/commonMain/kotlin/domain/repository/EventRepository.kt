package domain.repository

import domain.model.Event

interface EventRepository {
    suspend fun getAll(): List<Event>
    suspend fun search(term: String): List<Event>
    suspend fun getByCategory(categoryId: Int): List<Event>
    suspend fun getPopular(): List<Event>
}