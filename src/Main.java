import controller.EventController;
import controller.ParticipantController;
import controller.ResultController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EventController eventController = new EventController();
        ParticipantController participantController = new ParticipantController();
        ResultController resultController = new ResultController();
       
        while (true) {
            System.out.println("\n==== College Program Management System ====");
            System.out.println("1. Add Event");
            System.out.println("2. Register Participant");
            System.out.println("3. Schedule Event");
            System.out.println("4. View Event Participants");
            System.out.println("5. Manage Results");
            System.out.println("6. View Scoreboard");
            System.out.println("7. Generate Report");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> eventController.addEvent();
                case 2 -> participantController.registerParticipant();
                case 3 -> eventController.scheduleEvent();
                case 4 -> eventController.viewParticipantsByEvent();
                case 5 -> resultController.manageResults();
                case 6 -> resultController.viewScoreboard();
                case 7 -> resultController.generateReport();
                case 8 -> {
                    System.out.println("Exiting System. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
            sc.close();
        }
   
    }
}
