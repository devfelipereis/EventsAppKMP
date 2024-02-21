package data.remote

import data.remote.api.EventsApi
import data.remote.mapper.EventMapper
import data.repository.datasource.EventRemoteDataSource
import data.repository.model.Event

class EventRemoteDataSourceImpl(
    private val api: EventsApi,
    private val eventMapper: EventMapper,
) : EventRemoteDataSource {
    override suspend fun fetchAll(): List<Event> =
        api.fetchAll().let { eventMapper.toRepo(it.data) }

    override suspend fun search(): List<Event> {
        TODO("Not yet implemented")
    }

    override suspend fun fetchByCategory(categoryId: Int): List<Event> {
        TODO("Not yet implemented")
    }

    override suspend fun fetchPopular(): List<Event> {
        TODO("Not yet implemented")
    }
}