package domain.di

import domain.usecase.GetEvents
import domain.usecase.GetEventsByCategory
import domain.usecase.GetPopularEvents
import domain.usecase.SearchEvents
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

/**
 * Domain dependency injection module.
 */
val domainModule = module {
    factoryOf(::GetEvents)
    factoryOf(::GetEventsByCategory)
    factoryOf(::GetPopularEvents)
    factoryOf(::SearchEvents)
}