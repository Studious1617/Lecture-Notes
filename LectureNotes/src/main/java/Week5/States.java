package Week5;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class States {
    public static void main(String[] args) {

        Map<String, String> stateAbbreviations = new TreeMap<>();  //You can replace HashMap with TreeMap if you want an ordered HashMap. When run like this it will print in alphabetical order
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");
        stateAbbreviations.put("Iowa", "IA");

        System.out.println(stateAbbreviations);

        System.out.println(stateAbbreviations.get("Minnesota"));
        System.out.println(stateAbbreviations.get("Iowa"));

        String wisconsinAbbreviation = stateAbbreviations.get("Wisconsin");
        System.out.println(wisconsinAbbreviation);



        //How about looking up Abbreviations for states?

        //Loop over HashMap keys
        for (String stateName: stateAbbreviations.keySet()){
            System.out.println(stateName);
            System.out.println(stateAbbreviations.get(stateName));
        }

        //Loop over HashMap values
        for (String abbreviation: stateAbbreviations.values()){
            System.out.println(abbreviation);
        }


        //One way - loop over key-value pairs until value is found
        String searchAbbreviation = "MI";

        for (String stateName: stateAbbreviations.keySet()){
            System.out.println(stateName);
            String abbreviation = stateAbbreviations.get(stateName);
            if (abbreviation.equals(searchAbbreviation)){
                System.out.println("Found it! The state for " + searchAbbreviation + " is " + stateName);
            }
        }

        //Another way - create a new hashmap - each key becomes a value and each value becomes a key
        Map<String, String> abbreviationsStateNames = new HashMap<>();

        for (Map.Entry<String, String> entry: stateAbbreviations.entrySet()){
            String state = entry.getKey();
            String abbreviation = entry.getValue();
            abbreviationsStateNames.put(abbreviation, state);
        }
        System.out.println(stateAbbreviations);
        System.out.println(abbreviationsStateNames);

        System.out.println("There are " + stateAbbreviations.size() + " states listed.");
    }
}
