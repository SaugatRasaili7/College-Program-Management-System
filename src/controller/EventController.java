package controller;
import java.time.LocalDateTime;
import java.util.Scanner;

public class EventController {

     Scanner sc = new Scanner(System.in);

    public void addEvent() {

        System.out.print("Enter Event ID: ");
       int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Event Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Venue: ");
        String venue = sc.nextLine();

        System.out.print("Enter DateTime (yyyy-MM-ddTHH:mm): ");
        String dateTimeStr = sc.nextLine();

        LocalDateTime dt = LocalDateTime.parse(dateTimeStr);
        System.out.println("Event added successfully! Event ID: " + id + ", Name: " + name + ", Venue: " + venue + ", DateTime: " + dt);
    }

    public void scheduleEvent() {
        System.out.println("Available Events:");
    
    }

    public void viewParticipantsByEvent() {
       
    }
}
