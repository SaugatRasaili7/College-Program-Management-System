package controller;
import service.EventService;
import java.time.LocalDateTime;
import java.util.Scanner;

public class EventController {
    
   EventService es = new EventService();
     Scanner sc = new Scanner(System.in);
   
    public void addEvent() {

        System.out.print("Enter Event ID: ");
       int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Event Name: ");
        String name = sc.nextLine();

        System.out.print("Enter DateTime (yyyy-MM-ddTHH:mm): ");
        String date = sc.nextLine();

        System.out.print("Enter Venue: ");
        String venue = sc.nextLine();
        es.addEvent(name, date, venue);
       
       }

    public void scheduleEvent() {
        System.out.println("Available Events:");
        es.showAllEvents();

    

    }

    public void viewParticipantsByEvent() {
       
    }
}



  