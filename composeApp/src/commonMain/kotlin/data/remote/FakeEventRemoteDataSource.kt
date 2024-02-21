package data.remote

import data.repository.datasource.EventRemoteDataSource
import data.repository.model.Event

class FakeEventRemoteDataSource : EventRemoteDataSource {
    override suspend fun fetchAll(): List<Event> = listOf()
    override suspend fun search(): List<Event> = listOf()
    override suspend fun fetchByCategory(categoryId: Int): List<Event> = listOf()
    override suspend fun fetchPopular(): List<Event> = listOf()
}