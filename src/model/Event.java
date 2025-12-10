package model;

import java.time.LocalDateTime;
import java.util.List;

public class Event {
    private int id;
    private String name;
    private String venue;
    private LocalDateTime dateTime;
    

    public Event(int id, String name, String venue, LocalDateTime dateTime) {
        this.id = id;
        this.name = name;
        this.venue = venue;
        this.dateTime = dateTime;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getVenue() { return venue; }
    public LocalDateTime getDateTime() { return dateTime; }
   

}
