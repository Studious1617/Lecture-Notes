package Week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting {
    public static void main(String[] args) throws IOException {

        //File will be created if it does not exist
        //File will be overwritten if it does exist
        //Try with resources handling, file closes no matter what
        try (FileWriter writer = new FileWriter("hello.txt"); BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            //Writing to the file
            bufferedWriter.write("Hello!");
            bufferedWriter.newLine();
            bufferedWriter.write("Hello Java Students!\n");
            bufferedWriter.write("Goodbye!\n");
        } catch (IOException e) {
            System.out.println("Error writing to file " + e);  //IO Exception message to user
        }

        try (FileWriter writer2 = new FileWriter("hello.txt", true); //Append flag - true means add data to the end of the file
             BufferedWriter bufferedWriter2 = new BufferedWriter(writer2)) {

            //Appending data to the file
            bufferedWriter2.write("Other data\n");
            bufferedWriter2.write("Hello programmers!\n");
            bufferedWriter2.write("End of file!\n");

        } catch (IOException e) {
            System.out.println("Error appending data to file " + e);  //IO Exception message to user
        }
    }
}
