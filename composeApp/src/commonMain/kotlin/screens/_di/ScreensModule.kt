package screens._di

import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module
import screens.explore.ExploreScreenModel

/**
 * Screens dependency injection module.
 */
val screensModule = module {
    factoryOf(::ExploreScreenModel)
}