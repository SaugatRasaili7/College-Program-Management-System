package com.example.college.dao;
import java.io.*;
import java.util.*;

public class ParticipantDAO {
    
    String fileName = "participants.txt";

    // -------- ADD PARTICIPANT (WRITE TO FILE) --------
    public void addParticipant(int id, String name, String department, String eventName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            
            // Format: id,name,department,eventName
            writer.write(id + "," + name + "," + department + "," + eventName);
            writer.newLine();
            writer.close();

            System.out.println("✓ Participant added to event successfully!");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // -------- SHOW ALL PARTICIPANTS --------
    public void showAllParticipants() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            System.out.println("\n--- All Participants ---");

            boolean found = false;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println(
                        "ID: " + data[0] +
                        " | Name: " + data[1] +
                        " | Department: " + data[2] +
                        " | Event: " + data[3]
                );
                found = true;
            }

            reader.close();

            if (!found) {
                System.out.println("No participants found.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("No participant file found. Add participants first.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // -------- SHOW PARTICIPANTS BY EVENT --------
    public void showParticipantsByEvent(String eventName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            System.out.println("\n--- Participants in: " + eventName + " ---");

            boolean found = false;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[3].equalsIgnoreCase(eventName)) {
                    System.out.println(
                            "ID: " + data[0] +
                            " | Name: " + data[1] +
                            " | Department: " + data[2]
                    );
                    found = true;
                }
            }

            reader.close();

            if (!found) {
                System.out.println("No participants found for this event.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("No participant file found.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    
}