package controller;
import java.util.Scanner;

public class ParticipantController {
     Scanner sc = new Scanner(System.in);

    public void registerParticipant() {

        System.out.print("Enter Participant ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.println("Participant ID: " + id + ", Name: " + name + ", Department: " + dept);
        System.out.println("Participant registered successfully!");
        sc.close();
    }
}
