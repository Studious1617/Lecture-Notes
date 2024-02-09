package Week1;

import static input.InputUtils.intInput;

public class NumberQuizElse {
    public static void main(String[] args) {

        int secretNumber = 6;
        int guess = intInput("Guess the number I am thinking of: ");

        //If the number is equal to the secret number, the user guessed correctly
        if (guess == secretNumber){
            //If the condition is true then this code will run
            System.out.println("You guessed correctly!");
        }
        else{
            //else, if they did not guess correctly, tell them the right answer.
            System.out.println("Sorry, I was thinking of " + secretNumber);
        }

        //This code runs no matter what happens with the conditional code
        System.out.println("The end!");
    }
}
