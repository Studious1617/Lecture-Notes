package Week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteArray {
    public static void main(String[] args) throws IOException {

        String[] months = {"Jan", "Feb", "Mar"};

        FileWriter writer = new FileWriter("months.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        for (String month: months){
            bufferedWriter.write(month + "\n");
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
