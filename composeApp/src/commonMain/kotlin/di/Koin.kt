package di

import data.remote.di.remoteModule
import data.repository.di.repositoryModule
import domain.di.domainModule
import org.koin.core.context.startKoin
import screens._di.screensModule

fun initKoin() {
    startKoin {
        modules(
            domainModule,
            remoteModule,
            repositoryModule,
            screensModule,
        )
    }
}