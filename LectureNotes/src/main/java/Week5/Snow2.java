package Week5;

import java.util.HashMap;
import java.util.Map;

public class Snow2 {
    public static void main(String[] args) {
        Map<String, Double> snowfall = new HashMap<>();
        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);
        snowfall.put("December", 3.1);

        System.out.println(snowfall);

        snowfall.put("February", 12.4);

        System.out.println("The snow in January is " + snowfall.get("January") + " inches");
        System.out.println("The snow in July is " + snowfall.get("July") + " inches");

        if (snowfall.containsKey("July")){
            System.out.println("There was snow in July!");
        }
        else {
            System.out.println("There was no snow in July.");
        }

        //What about checking for values?
    }
}
