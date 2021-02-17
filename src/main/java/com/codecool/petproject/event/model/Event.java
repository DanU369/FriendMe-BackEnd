package com.codecool.petproject.event.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Event")
@Table(name = "events")
@Getter
@Setter
@NoArgsConstructor
public class Event {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE)
    Long id;

    String name;
    String type;
    String description;
    Integer available_spots;

    public Event(String name, String type, String description, Integer available_spots) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.available_spots = available_spots;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", available_spots=" + available_spots +
                '}';
    }
}
