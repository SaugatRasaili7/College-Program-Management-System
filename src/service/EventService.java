package service;

import dao.EventDAO;

public class EventService {
    
    EventDAO eventDAO = new EventDAO();

    public void scheduleEvent(String eventName, String dateTime, String venue) {
        eventDAO.updateEvent(eventName, dateTime, venue);
    }
}