package com.codecool.petproject.event.controller;


import com.codecool.petproject.event.model.Event;
import com.codecool.petproject.event.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
@CrossOrigin(origins = "http://localhost:3000")
public class EventController {

private EventService eventService;


    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping()
    public void addEvent(@RequestBody Event event) {
        System.out.println(event);
        eventService.addEvent(event);
    }

    @GetMapping()
    public List<Event> getEvents(){
        System.out.println("AICIIIII" + eventService.getAllEvents());
return eventService.getAllEvents();
    }
}
