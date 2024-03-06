package Week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.positiveDoubleInput;

public class CountIncidences {
    public static void main(String[] args) {

        //Made a new arrayList called speeds
        List<Double> speeds = new ArrayList<>();

        int totalHours = 12;    //Initialized the total hours for the program

        //Main loop which collects the internet speeds for each hour
        for (int hour = 0; hour < totalHours; hour++){
            double speed = positiveDoubleInput("Enter the internet speed for hour " + hour);
            speeds.add(speed);  //Adds each speed collected to the speeds arrayList
        }

        //Makes a table of speeds collected
        System.out.println("\nAll the speeds are: ");

        for (int hour = 0; hour < speeds.size(); hour++){
            double speed = speeds.get(hour);
            System.out.printf("Hour: %d     Speed: %.2f\n", hour, speed);
        }

        //Count the number of times the speed was 0
        int zeroCount = 0;  //Initializes the zeroCount variable

        for (double speed: speeds){
            if (speed == 0){
                zeroCount++;    //Increments the zeroCount variable each time there is a 0 value
            }
        }

        //Informs the user of how many times there were no connections
        System.out.println("Number of times speed was 0 (no connection): " + zeroCount);

        //Remove all zeroes
        while (speeds.contains(0.0)){
            speeds.remove(0.0);
        }

        System.out.println(speeds);     //Displays the speedsList array again

        /*Questions:
        *   -Why remove 0.0 instead of 0?
        *       +This is so the program will remove the value 0.0 instead of the index 0.
        *   -Why is a while loop used instead of a for loop?
        *       +It isn't good to modify the arrays/arrayLists used in constructing a for-loop in that same for loop*/

        //Figures out the average speed
        double total = 0;   //Initializes the total variable
        for (double speed: speeds){
            total = total + speed;
        }

        //Finds the average and makes it a variable and then formats it and prints it out for the user to see
        double average = total / speeds.size();

        System.out.printf("The average speed is %.2f", average);







    }
}
