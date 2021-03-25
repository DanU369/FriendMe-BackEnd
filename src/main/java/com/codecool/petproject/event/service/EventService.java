package com.codecool.petproject.event.service;

import com.codecool.petproject.event.model.Event;
import com.codecool.petproject.event.repository.EventRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@Setter
@NoArgsConstructor
public class EventService {

    EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

public void addEvent (Event event){
        eventRepository.save(event);
}

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }


}