package Week5;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class Snow {
    public static void main(String[] args) {
        //Use generic types in HashMaps too
        //You need to specify the type of the Keys, and the type of the Values
        //Specify in pointy brackets: < TypeOfKey, TypeOfValues>
        //In this example, all the keys must be Strings and all the values must be Doubles (or doubles)

        //Creates a HashMap for String keys, and Double values
        Map<String, Double> snowfall = new HashMap<>();

        //Adds the keys and their values to the new snowfall HashMap
        snowfall.put("January", 3.1);   // Add key = January with value = 31.
        snowfall.put("February", 10.8);   // Add key = February with value = 10.8
        snowfall.put("December", 3.1);
        snowfall.put("March", 4.1);
        snowfall.put("April", 0.0);

        System.out.println(snowfall);   // {January=3.1, February=10.8}

        for (String month: snowfall.keySet()){
            double snow = snowfall.get(month);
            System.out.printf("The snow in %s was %.2f inches\n", month, snow);
        }

        snowfall.put("February", 12.4);  // Update February snow

        System.out.println(snowfall);   // {January=3.1, February=12.4}   Old value was overwritten

        if (snowfall.containsKey("July")){
            System.out.println("There was snow in July!");
        }
        else {
            System.out.println("There was no snow in July.");  //There is no July in the snowfall HashMap so this will print
        }

        //Some user inputs
        String newMonth = stringInput("Enter name of month");
        double newSnow = positiveDoubleInput("Enter amount of snow for " + newMonth);

        Double snow = snowfall.get(newMonth);  // I put a Uppercase Double here so that we could check if snow variable was not equal to null since primitive types are not allowed to be null, only objects

        if (snow == null) {
            snowfall.put(newMonth, newSnow);  //If the new month's amount of snow does not exist then this code will run, putting in the new month and the new snow
        }
        //Overwrite protocol which asks the user if they wish to overwrite the previous data and does so if answered positively
        else {
            boolean overwrite = true;

            if (snowfall.containsKey(newMonth)) {
                snow = snowfall.get(newMonth);
                System.out.println(newMonth + " is already in the HashMap");
                System.out.println("Snowfall for " + newMonth + " was " + snow + " inches.");
                overwrite = yesNoInput("Do you want to overwrite the old data?");
                if (overwrite) {
                    snowfall.put(newMonth, newSnow);  //Overwrites the old data
                } else {
                    System.out.println("HashMap was not modified.");
                }
            }
        }

        System.out.println(snowfall);  //Prints out the snowfall arrayList

        // Calculate total snow by adding all the values
        double total = 0;

        // Loop over all the values in the HashMap and adds up the amounts for a total
        for (double snows: snowfall.values()) {
            total += snows;
        }

        System.out.println("Total snowfall is " + total + " inches.");  //Informs the user of the total snowfall amount

    }
}
