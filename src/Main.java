import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        if (num == 1) {
            System.out.println("1. Add Event");
            System.out.print("Please enter the event name: ");
            String eventName = sc.nextLine();
            System.out.println("Event " + eventName + " added successfully!");

        }

    else if(num==2){
          System.out.println("2. Register Participant");
            System.out.print("Please enter the Participant's name: ");
            String pname = sc.nextLine();
            System.out.println("Participant" + pname + " added successfully!");

    }


      else if(num==3){
          System.out.println("3. Schedule Event");
            System.out.print("Which Event do you want to schedule: ");
            String scheduleEvent = sc.nextLine();
        

    }


    
    else if(num==4){
          System.out.println("4. View Event Participants");
          

    }


      
    else if(num==5){
          System.out.println("5. Manage Results");
          

    }


    
    else if(num==6){
          System.out.println("6. View Scoreboard");
          

    }

   
     else if(num==7){
          System.out.println("7. Generate Report");
          

    }


    
     else if(num==8){
          System.out.println("8. Exit");
          

    }


        sc.close();
    }
}
