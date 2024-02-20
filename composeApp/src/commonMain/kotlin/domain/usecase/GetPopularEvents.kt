package domain.usecase

import domain.model.Event
import domain.repository.EventRepository

class GetPopularEvents(private val eventRepository: EventRepository) {
    suspend operator fun invoke(): List<Event> = eventRepository.getPopular()
}