package Week4;

import java.util.List;

public class ListOf {
    public static void main(String[] args) {

        List<String> animals = List.of("Cat", "Bird", "Zebra");
        System.out.println(animals);
        // animals.add("Frog");     <-- Once you make the above type of list with the List.of method you cannot modify it

    }
}
