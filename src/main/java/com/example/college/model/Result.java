package model;

public class Result {
    private int eventId;
    private String eventName;
    private String firstPosition;
    private String secondPosition;
    private String thirdPosition;

    // Constructor
    public Result() {
    }

    public Result(int eventId, String eventName, String firstPosition, String secondPosition, String thirdPosition) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.firstPosition = firstPosition;
        this.secondPosition = secondPosition;
        this.thirdPosition = thirdPosition;
    }

    // Getters and Setters
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getFirstPosition() {
        return firstPosition;
    }

    public void setFirstPosition(String firstPosition) {
        this.firstPosition = firstPosition;
    }

    public String getSecondPosition() {
        return secondPosition;
    }

    public void setSecondPosition(String secondPosition) {
        this.secondPosition = secondPosition;
    }

    public String getThirdPosition() {
        return thirdPosition;
    }

    public void setThirdPosition(String thirdPosition) {
        this.thirdPosition = thirdPosition;
    }

    @Override
    public String toString() {
        return "Result{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", firstPosition='" + firstPosition + '\'' +
                ", secondPosition='" + secondPosition + '\'' +
                ", thirdPosition='" + thirdPosition + '\'' +
                '}';
    }
}