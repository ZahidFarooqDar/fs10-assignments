package com.zahid.UniversityEventManagement.service;

import com.zahid.UniversityEventManagement.dao.EventRepository;
import com.zahid.UniversityEventManagement.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    EventRepository eventRepository;

    public Event getEventById(Long eventId) {
        return eventRepository.findById(eventId).orElse(null);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event updateEvent(Long eventId, Event event) {
        Event existingEvent = eventRepository.findById(eventId).orElse(null);
        if (existingEvent != null) {
            existingEvent.setEventName(event.getEventName());
            existingEvent.setLocationOfEvent(event.getLocationOfEvent());
            existingEvent.setDate(event.getDate());
            existingEvent.setStartTime(event.getStartTime());
            existingEvent.setEndTime(event.getEndTime());
            return eventRepository.save(existingEvent);
        } else {
            return null;
        }
    }

    @Override
    public void deleteEvent(Long eventId) {
        eventRepository.deleteById(eventId);
    }
}
