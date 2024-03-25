package Week6;

import java.io.*;

public class HelloReading {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("hello.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line = bufferedReader.readLine();

        while (line != null){
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
