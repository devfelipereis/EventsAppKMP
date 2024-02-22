package data.remote

import data.repository.datasource.EventRemoteDataSource
import data.repository.model.Event
import kotlinx.coroutines.delay

class FakeEventRemoteDataSource : EventRemoteDataSource {
    override suspend fun fetchAll(): List<Event> {
        delay(1_000)
        return List(30) { index ->
            Event(
                id = index,
                name = "Event $index",
                description = "test",
                image = "test",
                startDate = "test",
                endDate = "test",
                address = "test",
                city = "test",
                state = "test",
                latitude = 1.0,
                longitude = 2.0
            )
        }
    }

    override suspend fun search(): List<Event> = listOf()
    override suspend fun fetchByCategory(categoryId: Int): List<Event> = listOf()
    override suspend fun fetchPopular(): List<Event> = listOf()
}