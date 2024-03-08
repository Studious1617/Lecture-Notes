package Week5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.positiveIntInput;

public class RoadTrip {
    public static void main(String[] args) {
        Map<String, Integer> distances = new HashMap<>();

        distances.put("Duluth", 154);
        distances.put("Ely", 245);
        distances.put("Brainerd", 127);
        distances.put("Stillwater", 26);
        distances.put("Red Wing", 54);

        System.out.println(distances);

        int maxDrivingDistance = positiveIntInput("Enter the maximum distance you want to drive on your road trip");

        List<String> citiesInRange = new ArrayList<>();

        for (String city: distances.keySet()){
            int distance = distances.get(city);
            if (distance <= maxDrivingDistance){
                citiesInRange.add(city);
            }
        }

        if (citiesInRange.isEmpty()){
            System.out.println("Sorry, there are no Minnesota cities are within your driving range.");
        }
        else {
            System.out.println("You can visit " + citiesInRange.size() + " cities. Here are the cities you can drive to...");
            for (String city: citiesInRange){
                System.out.println(city);
            }
        }


    }
}
