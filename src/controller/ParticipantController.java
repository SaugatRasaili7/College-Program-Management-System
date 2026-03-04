package controller;
import dao.ParticipantDAO;
import dao.EventDAO;
import java.util.Scanner;

public class ParticipantController {
    
    ParticipantDAO PD = new ParticipantDAO();
    EventDAO ED = new EventDAO();
    Scanner sc = new Scanner(System.in);

    // -------- REGISTER PARTICIPANT TO EVENT --------
    public void registerParticipant() {
        System.out.println("\n===== REGISTER PARTICIPANT TO EVENT =====");
        
        // First, show available events
        System.out.println("\nAvailable Events:");
        ED.showAllEvents();

        System.out.print("\nEnter Event Name to register in: ");
        String eventName = sc.nextLine();

        // Get participant details
        System.out.print("Enter Participant ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        // Add participant to the event
        PD.addParticipant(id, name, dept, eventName);
        
        System.out.println("\nParticipant Details:");
        System.out.println("ID: " + id + " | Name: " + name + " | Department: " + dept + " | Event: " + eventName);
    }

    // -------- VIEW ALL PARTICIPANTS --------
    public void viewAllParticipants() {
        PD.showAllParticipants();
    }

    // -------- VIEW PARTICIPANTS BY EVENT --------
    public void viewParticipantsByEvent() {
        System.out.print("\nEnter Event Name: ");
        String eventName = sc.nextLine();
        PD.showParticipantsByEvent(eventName);
    }

   
}