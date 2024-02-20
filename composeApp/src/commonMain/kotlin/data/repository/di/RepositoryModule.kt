package data.repository.di

import data.repository.EventRepositoryImpl
import data.repository.mapper.EventMapper
import domain.repository.EventRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.withOptions
import org.koin.core.qualifier.named
import org.koin.dsl.module

/**
 * Repository dependency injection module.
 */
val repositoryModule = module {
    single(named("IODispatcher")) {
        Dispatchers.IO
    }

    // Mappers
    factoryOf(::EventMapper)

    // Repositories
    single {
        EventRepositoryImpl(get(named("IODispatcher")), get(), get())
    } withOptions {
        bind<EventRepository>()
    }
}