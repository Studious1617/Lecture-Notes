package Week5;

//Imports
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.positiveIntInput;

public class RoadTrip {
    public static void main(String[] args) {

        //Created a new HashMap of city names and their distances from the user
        Map<String, Integer> distances = new HashMap<>();

        //Adds these values into the HashMap
        distances.put("Duluth", 154);
        distances.put("Ely", 245);
        distances.put("Brainerd", 127);
        distances.put("Stillwater", 26);
        distances.put("Red Wing", 54);

        System.out.println(distances);  //Prints out the distances HashMap

        //Asks the user the maximum distance they are willing to drive and stores the result in the maxDrivingDistance variable
        int maxDrivingDistance = positiveIntInput("Enter the maximum distance you want to drive on your road trip");

        List<String> citiesInRange = new ArrayList<>();  //Makes a new citiesInRange arrayList

        //A loop that cycles through the keys (cities) in the distances HashMap
        for (String city: distances.keySet()){
            int distance = distances.get(city);  //Gets the matched pair for the key (city) which is the value (distance) from the user and then stores the result into the newly created distance variable
            if (distance <= maxDrivingDistance){  //If the distance is less than or equal to the max driving distance the user set then this program will add the selected key (city) into the citiesInRange arraylist
                citiesInRange.add(city);  //Adds the selected city to the citiesInRange arrayList
            }
        }

        if (citiesInRange.isEmpty()){
            System.out.println("Sorry, there are no Minnesota cities are within your driving range.");  //If the citiesInRange arrayList is empty then print out this message
        }
        //If the citiesInRange arrayList isn't empty then print out the message below and cycle through printing out the cities in the citiesInRange arrayList
        else {
            System.out.println("You can visit " + citiesInRange.size() + " cities. Here are the cities you can drive to...");
            for (String city: citiesInRange){
                System.out.println(city);
            }
        }


    }
}
