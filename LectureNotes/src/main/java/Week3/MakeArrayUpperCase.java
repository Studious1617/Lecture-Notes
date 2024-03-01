package Week3;

import java.util.Arrays;

public class MakeArrayUpperCase {
    public static void main(String[] args) {

        //Made sponsers array
        String[] sponsers = {"ikea", "at&t", "cvs", "3m"};

        //Called the makeArrayUppercase method
        makeArrayUppercase(sponsers);
        //Printed out the changed array
        System.out.println(Arrays.toString(sponsers));
    }

    //Method that makes string in an array uppercase
    public static void makeArrayUppercase(String[] array) {
        //Loop that goes through strings in an array and uses .toUpperCase to make them all in uppercase
        for (int x = 0; x < array.length; x++){
            array[x] = array[x].toUpperCase();
        }
    }
}
