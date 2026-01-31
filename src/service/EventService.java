package service;
import java.io.*;
import controller.EventController;

import java.time.LocalDateTime;

public class EventService {
    

    String fileName = "events.txt";

    // -------- ADD EVENT (WRITE TO FILE) --------
    public void addEvent(String name, String date, String venue) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            writer.write(name + "," + date + "," + venue);
            writer.newLine();
            writer.close();

            System.out.println("Event saved to file successfully!");

        } catch (IOException e) {
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

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println(
                        "Event: " + data[0] +
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

   
}

