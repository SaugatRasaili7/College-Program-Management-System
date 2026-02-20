package controller;
import dao.EventDAO;
import java.time.LocalDateTime;
import java.util.Scanner;

public class EventController {
    
   EventDAO ED = new EventDAO();
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
        ED.addEvent(name, date, venue);
       
       }

    public void scheduleEvent() {
        System.out.println("Available Events:");
        ED.showAllEvents();

    

    }

    public void viewParticipantsByEvent() {
       
    }
}



  