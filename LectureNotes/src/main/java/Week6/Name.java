package Week6;

import java.io.*;

public class Name {
    public static void main(String[] args) throws IOException {

        //Stored needed data in variables for modularity
        String filename = "data.txt";  //Stored the filename
        String name = "Clara";
        String favoriteColor = "blue";
        int classCode = 2454;

        //Write to the file
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data.txt"));
        bufferedWriter.write(name + "\n");
        bufferedWriter.write(favoriteColor);
        bufferedWriter.newLine();
        bufferedWriter.write(classCode + "\n");

        bufferedWriter.close();  //Closes file

        //Read the file
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String line = bufferedReader.readLine();

        while (line != null){  //If line is not empty then code below runs
            System.out.println(line);  //Prints out the line
            line = bufferedReader.readLine();  //Reads the next line
        }

        bufferedReader.close();  //Closes file

    }
}
