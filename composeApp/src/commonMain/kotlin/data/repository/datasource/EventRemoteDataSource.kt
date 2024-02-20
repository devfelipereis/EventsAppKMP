package data.repository.datasource

import data.repository.model.Event

interface EventRemoteDataSource {
    suspend fun fetchAll(): List<Event>
    suspend fun search(): List<Event>
    suspend fun fetchByCategory(categoryId: Int): List<Event>
    suspend fun fetchPopular(): List<Event>
}