package Week2;

import java.util.Random;

public class RandomInteger {
    public static void main(String[] args) {

        //Create a Random object - this is a random number generator object
        Random random = new Random();

        int randomNumber = random.nextInt(10);  //Generate a random number between 0 and

        System.out.println("Random secret number between 0 and 9 = " + randomNumber);




    }
}
