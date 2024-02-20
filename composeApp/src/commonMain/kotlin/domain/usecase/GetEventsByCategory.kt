package domain.usecase

import domain.model.Event
import domain.repository.EventRepository

class GetEventsByCategory(private val eventRepository: EventRepository) {
    suspend operator fun invoke(categoryId: Int): List<Event> =
        eventRepository.getByCategory(categoryId)
}