package data.repository.mapper

import domain.model.Event
import data.repository.model.Event as RepoEvent

class EventMapper {
    fun toDomain(repoEvent: RepoEvent): Event = Event(
        id = repoEvent.id,
        name = repoEvent.name,
        description = repoEvent.description,
        image = repoEvent.image,
        startDate = repoEvent.startDate,
        endDate = repoEvent.endDate,
        address = repoEvent.address,
        city = repoEvent.city,
        state = repoEvent.state,
        longitude = repoEvent.longitude,
        latitude = repoEvent.latitude,
    )

    fun toDomain(repoEventList: List<RepoEvent>): List<Event> = repoEventList.map { toDomain(it) }

    fun toRepo(event: Event): RepoEvent = RepoEvent(
        id = event.id,
        name = event.name,
        description = event.description,
        image = event.image,
        startDate = event.startDate,
        endDate = event.endDate,
        address = event.address,
        city = event.city,
        state = event.state,
        longitude = event.longitude,
        latitude = event.latitude,
    )

    fun toRepo(eventList: List<Event>): List<RepoEvent> = eventList.map { toRepo(it) }
}