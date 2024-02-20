package domain.usecase

import domain.model.Event
import domain.repository.EventRepository

class SearchEvents(private val eventRepository: EventRepository) {
    suspend operator fun invoke(term: String): List<Event> = eventRepository.search(term)
}