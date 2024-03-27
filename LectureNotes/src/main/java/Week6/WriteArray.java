package Week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteArray {
    public static void main(String[] args) throws IOException {

        String[] months = {"Jan", "Feb", "Mar"};  //Array of months for later use

        //Opens the months.txt file
        FileWriter writer = new FileWriter("months.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        //Writes each month in the months array to the months.txt file
        for (String month: months){
            bufferedWriter.write(month + "\n");  //Month written to file
            bufferedWriter.newLine();  //Newline
        }

        bufferedWriter.close();  //Closes file
    }
}
