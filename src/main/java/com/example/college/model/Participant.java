package model;

public class Participant {
    private int id;
    private String name;
    private String department;
    private String eventName;

    // Constructor
    public Participant() {
    }

    public Participant(int id, String name, String department, String eventName) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.eventName = eventName;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", eventName='" + eventName + '\'' +
                '}';
    }
}