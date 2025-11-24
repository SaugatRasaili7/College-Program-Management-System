
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //FEATURES SHOWN IN ORDER :

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
        int num = sc.nextInt();
        sc.nextLine(); 

         switch (num) {
                case 1 -> addEvent();

                case 2 -> addParticipant();

                case 3 -> ScheduleEvent();

                case 4 -> eventParticipants();

                case 5 -> manageResult();

                case 6 -> viewScoreboard();

                case 7 -> generateReport();

                case 8 -> {
                    System.out.println("Exiting System. Goodbye!");
                    return;
                }

                default -> System.out.println("Invalid choice! Try again.");
            }
    }
}


        // FEATURE 1: ADD EVENT


       static void addEvent() {
        System.out.print("Enter Event Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Venue: ");
        String venue = sc.nextLine();
        System.out.print("Enter Date & Time: ");
        String dateTime = sc.nextLine();

        System.out.println("Event Added Successfully!");
    }

     // FEATURE 2: REGISTER PARTICIPANT

    static void addParticipant(){
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.println("Participant Registered!");
    }

       // FEATURE 3: SCHEDULE EVENTS

    static void  ScheduleEvent(){


    }
  
    
       // FEATURE 4: VIEW EVENT PARTICIPANTS

    static void eventParticipants(){
    
    }


       // FEATURE 5: MANAGE RESULTS
     
    static void manageResult(){

    }


    // FEATURE 6: VIEW SCOREBOARD

    static void viewScoreboard(){

    }



   // FEATURE 7: GENERATE REPORT

    static void generateReport(){

    }
