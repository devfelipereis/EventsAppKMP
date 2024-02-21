package data.remote.mapper

import data.remote.model.Event as RemoteEvent
import data.repository.model.Event as RepoEvent
import domain.model.Event as DomainEvent

class EventMapper {
    fun toRepo(remoteEvent: RemoteEvent): RepoEvent = RepoEvent(
        id = remoteEvent.id,
        name = remoteEvent.name,
        description = remoteEvent.description,
        image = remoteEvent.image,
        startDate = remoteEvent.startDate,
        endDate = remoteEvent.endDate,
        address = remoteEvent.address,
        city = remoteEvent.city,
        state = remoteEvent.state,
        longitude = remoteEvent.longitude,
        latitude = remoteEvent.latitude,
    )

    fun toDomain(remoteEvent: RemoteEvent): DomainEvent = DomainEvent(
        id = remoteEvent.id,
        name = remoteEvent.name,
        description = remoteEvent.description,
        image = remoteEvent.image,
        startDate = remoteEvent.startDate,
        endDate = remoteEvent.endDate,
        address = remoteEvent.address,
        city = remoteEvent.city,
        state = remoteEvent.state,
        longitude = remoteEvent.longitude,
        latitude = remoteEvent.latitude,
    )

    fun toRepo(domainEventList: List<RemoteEvent>): List<RepoEvent> =
        domainEventList.map { toRepo(it) }

    fun toDomain(remoteEventList: List<RemoteEvent>): List<DomainEvent> =
        remoteEventList.map { toDomain(it) }
}