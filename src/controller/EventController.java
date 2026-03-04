package controller;
import dao.EventDAO;
import java.util.Scanner;


public class EventController {
    
   EventDAO ED = new EventDAO();
   Scanner sc = new Scanner(System.in);
   
    public void addEvent() {
        System.out.print("Enter Event Name: ");
        String name = sc.nextLine();

        System.out.print("Enter DateTime (yyyy-MM-ddTHH:mm): ");
        String date = sc.nextLine();

        System.out.print("Enter Venue: ");
        String venue = sc.nextLine();
        
        ED.addEvent(name, date, venue);
    }

    public void scheduleEvent() {
        System.out.println("\n===== SCHEDULE EVENT =====");
        System.out.println("Available Events:");
        ED.showAllEvents();

        System.out.print("\nEnter Event Name to schedule: ");
        String eventName = sc.nextLine();

        System.out.print("Enter new DateTime (yyyy-MM-ddTHH:mm): ");
        String newDate = sc.nextLine();

        System.out.print("Enter new Venue: ");
        String newVenue = sc.nextLine();

        ED.updateEvent(eventName, newDate, newVenue);
    }

    // ------- VIEW ALL EVENTS --------
    public void viewAllEvents() {
        ED.showAllEvents();
    }

    public void viewParticipantsByEvent() {
       
    }
}