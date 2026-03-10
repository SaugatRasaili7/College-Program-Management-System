package com.example.college.util;
import com.example.college.dao.ResultDAO;
import java.util.Scanner;

public class Scoreboard {
    
    ResultDAO RD = new ResultDAO();
    Scanner sc = new Scanner(System.in);

    // -------- DISPLAY OVERALL SCOREBOARD --------
    public void displayOverallScoreboard() {
        System.out.println("║ ------------ COLLEGE EVENT RESULTS SCOREBOARD -------------- ║");
        RD.showAllResults();
    }

    // -------- DISPLAY EVENT SPECIFIC SCOREBOARD --------
    public void displayEventScoreboard() {
        System.out.print("\nEnter Event Name: ");
        String eventName = sc.nextLine();
        
        System.out.println("║ ------------ EVENT SCOREBOARD ------------ ║");
        RD.showResultByEvent(eventName);
    }

}