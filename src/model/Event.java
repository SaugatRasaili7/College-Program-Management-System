package model;

public class Event {
    private int id;
    private String name;
    private String dateTime;
    private String venue;

    // Constructors
    public Event() {
    }

    public Event(int id, String name, String dateTime, String venue) {
        this.id = id;
        this.name = name;
        this.dateTime = dateTime;
        this.venue = venue;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", venue='" + venue + '\'' +
                '}';
    }
}