package model;

public class Result {
    private Participant participant;
    private Event event;
    private int position; 

    public Result(Participant participant, Event event, int position) {
        this.participant = participant;
        this.event = event;
        this.position = position;
    }

    public Participant getParticipant() { return participant; }
    public Event getEvent() { return event; }
    public int getPosition() { return position; }
}
