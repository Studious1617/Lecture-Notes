package Week2;

import static input.InputUtils.stringInput;

public class WhileLoopPassword {
    public static void main(String[] args) {

        String secretPassword = "kittens";

        System.out.println();
        String userPassword = stringInput("Enter the password: ");

        //Always use the .equals method to check if two strings have the exact same characters

        //Before we let the user in we need to check that the password is correct
        //This loop will repeat while the password is not "kittens", our secretPassword

        int maxGuesses = 5;
        while (! userPassword.equals(secretPassword) && maxGuesses > 1){
            //The user got the password wrong. Print an error message
            System.out.println("Password incorrect, access denied!");

            //And ask the user to try again
            System.out.println("Try again.");
            System.out.println();

            //Repeat userPassword with the user's next attempt.
            userPassword = stringInput("Enter the password:");
            //If the user gets it wrong, the loop will repeat

            maxGuesses--;
        }

        if (maxGuesses > 1){  //Ran out of guesses
            //If the loop condition is false, then the user got the password right.
            //Print "access granted" method

            System.out.println("Correct password - access granted.");
        }
        else {
            System.out.println("Max number of password guesses reached.");
            System.exit(0);
        }



    }
}
