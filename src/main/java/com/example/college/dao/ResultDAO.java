package com.example.college.dao;
import java.io.*;
import java.util.*;

public class ResultDAO {
    
    String fileName = "results.txt";

    // -------- ADD RESULT (WRITE TO FILE) --------
    public void addResult(int eventId, String eventName, String firstPosition, String secondPosition, String thirdPosition) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            
            // Format: eventId,eventName,firstPosition,secondPosition,thirdPosition
            writer.write(eventId + "," + eventName + "," + firstPosition + "," + secondPosition + "," + thirdPosition);
            writer.newLine();
            writer.close();

            System.out.println("✓ Result saved successfully!");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // -------- SHOW ALL RESULTS --------
    public void showAllResults() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            System.out.println("\n========== ALL EVENT RESULTS ==========");

            boolean found = false;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("\n--- Event: " + data[1] + " ---");
                System.out.println(" 1st Position: " + data[2]);
                System.out.println(" 2nd Position: " + data[3]);
                System.out.println(" 3rd Position: " + data[4]);
                
                found = true;
            }

            reader.close();

            if (!found) {
                System.out.println("No results found.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("No result file found. Add results first.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // -------- SHOW RESULT BY EVENT NAME --------
    public void showResultByEvent(String eventName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            System.out.println("\n========== RESULT FOR: " + eventName + " ==========");

            boolean found = false;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[1].equalsIgnoreCase(eventName)) {
                    System.out.println(" 1st Position: " + data[2]);
                    System.out.println(" 2nd Position: " + data[3]);
                    System.out.println(" 3rd Position: " + data[4]);
                    
                    found = true;
                    break;
                }
            }

            reader.close();

            if (!found) {
                System.out.println("✗ No result found for this event.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("No result file found.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // -------- UPDATE RESULT --------
    public void updateResult(String eventName, String newFirst, String newSecond, String newThird) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            List<String> lines = new ArrayList<>();
            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[1].equalsIgnoreCase(eventName)) {
                    lines.add(data[0] + "," + eventName + "," + newFirst + "," + newSecond + "," + newThird);
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
                System.out.println("✓ Result updated successfully!");
            } else {
                System.out.println("✗ Result not found!");
            }

        } catch (FileNotFoundException e) {
            System.out.println("No result file found.");
        } catch (IOException e) {
            System.out.println("Error updating result: " + e.getMessage());
        }
    }


    // -------- CHECK IF RESULT EXISTS --------
    public boolean resultExists(String eventName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[1].equalsIgnoreCase(eventName)) {
                    reader.close();
                    return true;
                }
            }
            reader.close();

        } catch (FileNotFoundException e) {
            // File doesn't exist yet, which is fine
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return false;
    }
}