package domain.usecase

import domain.model.Event
import domain.repository.EventRepository

class GetEvents(private val eventRepository: EventRepository) {
    suspend operator fun invoke(): List<Event> = eventRepository.getAll()
}