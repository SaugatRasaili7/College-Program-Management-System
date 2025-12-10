package service;

import com.example.college.model.Event;
import com.example.college.model.Participant;

import java.time.LocalDateTime;

public class EventService {
    

    public void addEvent(int id, String name, String venue, LocalDateTime dateTime) {
        Event e = new Event(id, name, venue, dateTime);
        eventDAO.addEvent(e);
    }

    public void addParticipantToEvent(int eventId, Participant p) {
        Event e = eventDAO.findEventById(eventId);
        if (e != null) e.addParticipant(p);
    }

    public Event findEvent(int id) {
        return eventDAO.findEventById(id);
    }

    public void listEvents() {
        for (Event e : eventDAO.getAllEvents()) {
            System.out.println(e.getId() + ": " + e.getName() + " at " + e.getVenue() + " on " + e.getDateTime());
        }
    }
}
