package presentation._di

import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module
import presentation.screens.explore.ExploreScreenModel

/**
 * Screens dependency injection module.
 */
val presentationModule = module {
    factoryOf(::ExploreScreenModel)
}