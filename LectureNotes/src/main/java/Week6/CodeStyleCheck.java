package Week6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CodeStyleCheck {
    public static void main(String[] args) {

        String filename = "HelloWriting.java";  //Stored the filename
        int maxLineLength = 100;  //The maximum line limit

        //Try with resources handling here
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){

            boolean linesTooLong = false;  //Start as false and turns true later if there are any
            int numberOfLinesTooLong = 0;  //Starts as 0

            String line = reader.readLine(); //Reads the first line
            int lineCounter = 1;  //Starts as 1 because program has already read one line

            while (line != null){  //If line is not empty then code below runs
                if (line.length() > maxLineLength){  //If the length of the current line is greater than the maximum then code below runs
                    System.out.println("The line " + lineCounter + " is too long.");  //Tells user which line is too long
                    System.out.println(line);  //Prints the line
                    linesTooLong = true;  //Changes the boolean above to true
                    numberOfLinesTooLong++;  //increments the numberOfLinesTooLong variable for later use
                }
                lineCounter++;  //Increments the line counter so the line number is accurate
                line = reader.readLine();  //Reads the next line
            }

            if (linesTooLong){
                System.out.println("\nThere were " + numberOfLinesTooLong + " lines that were too long.");  //If there
                // were lines that were too long at all then tell the user how many were too long
            }
            else {
                System.out.println("There were no lines that were too long.");  //Inform the user that there are no
                // lines that are too long
            }

        } catch (IOException e){
            System.out.println("Error reading " + filename + " file because " + e);  //If an IO Exception happens then error message prints
        }

    }
}
