package Week2;

import java.util.Random;

import static input.InputUtils.intInput;

public class GuessTheNumber {
    public static void main(String[] args) {

        Random randomNumberGenerator = new Random();
        int secretNumber = randomNumberGenerator.nextInt(100) + 1;  //Generates a random number between 1 and 100

        int guess = intInput("Guess the number!: ");
        System.out.println(secretNumber);

        while (guess != secretNumber){
            if (guess > secretNumber){
                System.out.println("\nThat's too high!");
            }
            else if (guess < secretNumber){
                System.out.println("\nThat's too low!");
            }
            guess = intInput("Guess the number!: ");
        }
        System.out.println("Correct! The number was " + secretNumber);




    }
}
