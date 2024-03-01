package Week3;

import static input.InputUtils.intInput;

public class Credits {
    public static void main(String[] args) {
        //Inputs
        int required = intInput("How many credits does your program require?: ");
        int earned = intInput("How many credits have you earned?: ");
        //Calls the howManyCreditsToGraduate method and stores the returned result into the needed variable
        int needed = howManyCreditsToGraduate(required, earned);
        //Prints out the result of the credits calculations
        System.out.println("You need " + needed + " credits.");
    }

    //howManyCreditsToGraduate method which calculates the credits given a user inputted number of credits needed and credits earned
    public static int howManyCreditsToGraduate(int creditsNeeded, int creditsEarned){
        //Calculates creditsToGraduate
        int creditsToGraduate = creditsNeeded - creditsEarned;
        return creditsToGraduate;  ////Returns creditsToGraduate
    }
}
