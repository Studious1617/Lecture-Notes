package Week6;

import java.io.*;

public class HelloReading {
    public static void main(String[] args) throws IOException {

        //Opened file
        FileReader reader = new FileReader("hello.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line = bufferedReader.readLine();  //Reads first line

        while (line != null){  //If line is not empty then code below runs
            System.out.println(line);  //Prints out first line
            line = bufferedReader.readLine();  //Reads next line
        }

        //Closes file
        bufferedReader.close();
    }
}
