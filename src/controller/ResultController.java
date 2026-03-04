package controller;
import dao.ResultDAO;
import dao.EventDAO;
import dao.ParticipantDAO;
import java.util.Scanner;


public class ResultController {
    
    ResultDAO RD = new ResultDAO();
    EventDAO ED = new EventDAO();
    ParticipantDAO PD = new ParticipantDAO();
    Scanner sc = new Scanner(System.in);

    // -------- ADD RESULT FOR EVENT --------
    public void addResult() {
        System.out.println("\n===== ADD EVENT RESULT =====");
        
        // Show all events
        System.out.println("Available Events:");
        ED.showAllEvents();

        System.out.print("\nEnter Event Name: ");
        String eventName = sc.nextLine();

        // Check if event exists
        if (!eventNameExists(eventName)) {
            System.out.println("✗ Event not found!");
            return;
        }

        // Check if result already exists
        if (RD.resultExists(eventName)) {
            System.out.println(" Result already exists for this event!");
            System.out.print("Do you want to update it? (yes/no): ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                updateResult();
            }
            return;
        }

        // Show participants for this event
        System.out.println("\nParticipants in this event:");
        PD.showParticipantsByEvent(eventName);

        // Get winner information
        System.out.print("\nEnter 1st Position Winner Name: ");
        String firstPosition = sc.nextLine();

        System.out.print("Enter 2nd Position Winner Name: ");
        String secondPosition = sc.nextLine();

        System.out.print("Enter 3rd Position Winner Name: ");
        String thirdPosition = sc.nextLine();

        // Generate event ID (can be simplified)
        int eventId = eventName.hashCode();

        // Add result to DAO
        RD.addResult(eventId, eventName, firstPosition, secondPosition, thirdPosition);

        // Display confirmation
        System.out.println("\n========== RESULT SUMMARY ==========");
        System.out.println("Event: " + eventName);
        System.out.println(" 1st Position: " + firstPosition);
        System.out.println(" 2nd Position: " + secondPosition);
        System.out.println(" 3rd Position: " + thirdPosition);
        
    }

    // -------- VIEW ALL RESULTS --------
    public void viewAllResults() {
        RD.showAllResults();
    }

    // -------- VIEW RESULT BY EVENT --------
    public void viewResultByEvent() {
        System.out.print("\nEnter Event Name: ");
        String eventName = sc.nextLine();
        RD.showResultByEvent(eventName);
    }

    // -------- UPDATE RESULT --------
    public void updateResult() {
        System.out.println("\n===== UPDATE EVENT RESULT =====");
        
        System.out.print("Enter Event Name: ");
        String eventName = sc.nextLine();

        if (!RD.resultExists(eventName)) {
            System.out.println("✗ Result not found!");
            return;
        }

        // Show current result
        System.out.println("\nCurrent Result:");
        RD.showResultByEvent(eventName);

        // Get new winners
        System.out.print("\nEnter new 1st Position Winner Name: ");
        String firstPosition = sc.nextLine();

        System.out.print("Enter new 2nd Position Winner Name: ");
        String secondPosition = sc.nextLine();

        System.out.print("Enter new 3rd Position Winner Name: ");
        String thirdPosition = sc.nextLine();

        // Update result
        RD.updateResult(eventName, firstPosition, secondPosition, thirdPosition);
    }

 
    // -------- HELPER METHOD TO CHECK IF EVENT EXISTS --------
    private boolean eventNameExists(String eventName) {
        // You can implement this by reading from events.txt
        // For now, returning true (assumes user enters valid event)
        return true;
    }
}