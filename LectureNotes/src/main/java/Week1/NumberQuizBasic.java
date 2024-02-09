package Week1;

import static input.InputUtils.intInput;

public class NumberQuizBasic {
    public static void main(String[] args) {
        int secretNumber = 6;
         int guess = intInput("Guess the number I am thinking of: ");

         //This tests if the guess variable is equal to the secret number variable
         if (guess == secretNumber){
             //If the condition is true then this code will run
             System.out.println("You guessed correctly!");
         }

         //This code runs no matter what happens with the conditional code
        System.out.println("The end!");

    }
}
