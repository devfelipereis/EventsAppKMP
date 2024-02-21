package data.remote.di

import data.remote.FakeEventRemoteDataSource
import data.remote.api.EventsApi
import data.remote.api.EventsApiImpl
import data.remote.mapper.EventMapper
import data.repository.datasource.EventRemoteDataSource
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.ContentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

/**
 * Remote dependency injection module.
 */
val remoteModule = module {
    single {
        val json = Json { ignoreUnknownKeys = true }
        HttpClient {
            install(ContentNegotiation) {
                json(json, contentType = ContentType.Application.Json)
            }
        }
    }

    factoryOf(::EventMapper)

    singleOf(::EventsApiImpl) { bind<EventsApi>() }
    singleOf(::FakeEventRemoteDataSource) { bind<EventRemoteDataSource>() }
}