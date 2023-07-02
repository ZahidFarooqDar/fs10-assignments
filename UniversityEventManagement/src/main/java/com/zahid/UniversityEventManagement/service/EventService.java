package com.zahid.UniversityEventManagement.service;

import com.zahid.UniversityEventManagement.model.Event;

import java.util.List;

public interface EventService {
    Event getEventById(Long eventId);

    List<Event> getAllEvents();

    Event createEvent(Event event);

    Event updateEvent(Long eventId, Event event);

    void deleteEvent(Long eventId);
}
