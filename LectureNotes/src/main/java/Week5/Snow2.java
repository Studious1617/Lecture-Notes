package Week5;

import java.util.HashMap;
import java.util.Map;

public class Snow2 {
    public static void main(String[] args) {

        //Creates a HashMap for String keys and Double values
        Map<String, Double> snowfall = new HashMap<>();

        //Adds the keys and their values to the new snowfall HashMap
        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);
        snowfall.put("December", 3.1);

        System.out.println(snowfall);  //Prints out the snowfall arrayList for testing and user-visibility

        snowfall.put("February", 12.4);  //Puts this into the snowfall arrayList

        //Tells the user how much snowfall these two months got
        System.out.println("The snow in January is " + snowfall.get("January") + " inches");
        System.out.println("The snow in July is " + snowfall.get("July") + " inches");

        //Tells the user if there was snow in July or not depending on whether the month of July was in the snowfall arrayList or not
        if (snowfall.containsKey("July")){
            System.out.println("There was snow in July!");
        }
        else {
            System.out.println("There was no snow in July.");
        }
    }
}
