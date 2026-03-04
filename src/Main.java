import controller.EventController;
import controller.ParticipantController;
import controller.ResultController;
import util.Scoreboard;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EventController EC = new EventController();
        ParticipantController PC = new ParticipantController();
        ResultController RC = new ResultController();
        Scoreboard SB = new Scoreboard();
        boolean show = true;

        while (show) {

            System.out.println("║    ----- WELCOME TO COLLEGE PROGRAM MANAGEMENT SYSTEM -----     ║");
            
            System.out.println("\n--- EVENT MANAGEMENT ---");
            System.out.println("1. Add Event");
            System.out.println("2. Schedule Event");
            System.out.println("3. View All Events");
            
            System.out.println("\n--- PARTICIPANT MANAGEMENT ---");
            System.out.println("4. Register Participant to Event");
            System.out.println("5. View All Participants");
            System.out.println("6. View Participants by Event");

            
            System.out.println("\n--- RESULT MANAGEMENT ---");
            System.out.println("7. Add Event Result");
            System.out.println("8. View All Results");
            System.out.println("9. View Result by Event");
            System.out.println("10. Update Result");
         
            
            System.out.println("\n--- SCOREBOARD ---");
            System.out.println("11. View Overall Scoreboard");
            System.out.println("12. View Event Scoreboard");
            
            
            System.out.println("\n13. Exit");
            System.out.print("\nEnter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    EC.addEvent();
                    break;
                case 2:
                    EC.scheduleEvent();
                    break;
                case 3:
                      EC.viewAllEvents();
                    
                    break;
                case 4:
                    PC.registerParticipant();
                    break;
                case 5:
                    PC.viewAllParticipants();
                    break;
                case 6:
                    PC.viewParticipantsByEvent();
                    break;
                
                case 7:
                    RC.addResult();
                    break;
                case 8:
                    RC.viewAllResults();
                    break;
                case 9:
                    RC.viewResultByEvent();
                    break;
                case 10:
                    RC.updateResult();
                    break;
              
                case 11:
                    SB.displayOverallScoreboard();
                    break;
                case 12:
                    SB.displayEventScoreboard();
                    break;
               
                case 13:
                    System.out.println("\n Exiting System , Goodbye ........!");
                    show = false;
           
            }
        }
    }
}