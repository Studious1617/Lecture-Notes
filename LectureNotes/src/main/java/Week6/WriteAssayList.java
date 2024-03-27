package Week6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAssayList {
    public static void main(String[] args) throws IOException {

        final String filename = "ITEC_Classes.txt";  //Stores the filename and makes it unchangeable
        //Write lines to the file "ITEC 2545 Java" and "ITEC 2560 Web" etc.
        List<String> classNames = List.of("Java", "Web", "C#");  //Makes an unchangeable arrayList of strings

        //Another way to make an arrayList and add strings
        //List<String> classes = new ArrayList<>();
        //classes.add("Java");
        //classes.add("Web");
        //classes.add("C#");

        List<Integer> classCodes = List.of(2545, 2560, 2505); //Makes an unchangeable arrayList of ints

        //Opens file for writing purposes
        FileWriter writer = new FileWriter(filename);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        //Writes array data to file
        for (int i = 0; i < classNames.size(); i++){  //Loops for the size of the classNames array
            String name = classNames.get(i);  //name variable is the current element in the classNames array
            int code = classCodes.get(i);  //code variable is the current element in the classCodes array
            String outputLine = String.format("ITEC %d %s \n", code, name);  //Formats the name and code
            bufferedWriter.write(outputLine);  //Writes to the file
        }

        bufferedWriter.close();  //Closes file


        //Opens file for reading purposes
        FileReader reader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(reader);

        List<String> classDescriptions = new ArrayList<>();  //Makes a new classDescriptions arrayList

        String line = bufferedReader.readLine();  //Reads the first line

        while (line != null){  //If line is not empty then code below runs
            classDescriptions.add(line);  //Line is added to classDescriptions for later printing
            line = bufferedReader.readLine();  //Reads the next line
        }

        System.out.println("End of file reached");  //Signs off
        System.out.println(classDescriptions);  //Prints out the aforementioned classDescriptions arrayList
    }
}
