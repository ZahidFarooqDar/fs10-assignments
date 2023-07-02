package com.zahid.UniversityEventManagement.controller;

import com.zahid.UniversityEventManagement.model.Event;
import com.zahid.UniversityEventManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping("/{eventId}")
    public Event getEvent(@PathVariable Long eventId) {
        return eventService.getEventById(eventId);
    }

    @GetMapping("/list")
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @PostMapping("/create")
    public Event createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @PutMapping("/{eventId}")
    public Event updateEvent(@PathVariable Long eventId, @RequestBody Event event) {
        return eventService.updateEvent(eventId, event);
    }

    @DeleteMapping("/{eventId}")
    public void deleteEvent(@PathVariable Long eventId) {
        eventService.deleteEvent(eventId);
    }
}
