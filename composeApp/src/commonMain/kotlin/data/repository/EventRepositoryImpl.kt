package data.repository

import data.repository.datasource.EventRemoteDataSource
import data.repository.mapper.EventMapper
import domain.model.Event
import domain.repository.EventRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class EventRepositoryImpl(
    private val ioDispatcher: CoroutineDispatcher,
    private val eventRemoteDataSource: EventRemoteDataSource,
    private val eventMapper: EventMapper,
) : EventRepository {
    override suspend fun getAll(): List<Event> = withContext(ioDispatcher) {
        eventRemoteDataSource.fetchAll().map { eventMapper.toDomain(it) }
    }

    override suspend fun search(term: String): List<Event> = withContext(ioDispatcher) {
        eventRemoteDataSource.search().map { eventMapper.toDomain(it) }
    }

    override suspend fun getByCategory(categoryId: Int): List<Event> = withContext(ioDispatcher) {
        eventRemoteDataSource.fetchByCategory(categoryId).map { eventMapper.toDomain(it) }
    }

    override suspend fun getPopular(): List<Event> = withContext(ioDispatcher) {
        eventRemoteDataSource.fetchPopular().map { eventMapper.toDomain(it) }
    }

}