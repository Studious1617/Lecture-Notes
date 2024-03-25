package Week6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CodeStyleCheck {
    public static void main(String[] args) {

        String filename = "HelloWriting.java";
        int maxLineLength = 100;

        //Try with resources handling here
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){

            boolean linesTooLong = false;
            int numberOfLinesTooLong = 0;
            String line = reader.readLine();
            int lineCounter = 1;
            while (line != null){
                if (line.length() > maxLineLength){
                    System.out.println("The line " + lineCounter + " is too long.");
                    System.out.println(line);
                    linesTooLong = true;
                    numberOfLinesTooLong++;
                }
                lineCounter++;
                line = reader.readLine();
            }

            if (linesTooLong){
                System.out.println("\nThere were " + numberOfLinesTooLong + " lines that were too long.");
            }
            else {
                System.out.println("There were no lines that were too long.");
            }

        } catch (IOException e){
            System.out.println("Error reading " + filename + " file because " + e);
        }

    }
}
