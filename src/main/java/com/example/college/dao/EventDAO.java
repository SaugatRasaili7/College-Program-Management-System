package com.example.college.dao;
import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class EventDAO {
    
    String fileName = "events.txt";

    // -------- ADD EVENT (WRITE TO FILE) --------
    public void addEvent(String name, String date, String venue) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            writer.write(name + "," + date + "," + venue);
            writer.newLine();
            writer.close();

            System.out.println("Event saved to file successfully!");

        } 
        catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    // -------- SHOW ALL EVENTS (READ FROM FILE) --------
    public void showAllEvents() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            System.out.println("\n--- Available Events ---");

            boolean found = false;
            int eventNumber = 0;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                eventNumber++;
                System.out.println(
                        eventNumber + ". Event: " + data[0] +
                        " | Date: " + data[1] +
                        " | Venue: " + data[2]
                );
                found = true;
            }

            reader.close();

            if (!found) {
                System.out.println("No events found.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("No event file found. Add events first.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

    // -------- UPDATE EVENT (SCHEDULE EVENT) --------
    public void updateEvent(String eventName, String newDate, String newVenue) {
        try {

            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            List<String> lines = new ArrayList<>();
            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equalsIgnoreCase(eventName)) {
                    lines.add(eventName + "," + newDate + "," + newVenue);
                    found = true;
                } else {
                    lines.add(line);
                }
            }
            reader.close();

            if (found) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
                for (String updatedLine : lines) {
                    writer.write(updatedLine);
                    writer.newLine();
                }
                writer.close();
                System.out.println(" Event scheduled successfully!");
            } else {
                System.out.println("Event not found!");
            }

        } catch (FileNotFoundException e) {
            System.out.println("No event file found.");
        } catch (IOException e) {
            System.out.println("Error updating event: " + e.getMessage());
        }
    }

}