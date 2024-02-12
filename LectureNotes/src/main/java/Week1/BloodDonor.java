package Week1;

import static input.InputUtils.*;

public class BloodDonor {
    public static void main(String[] args) {
        // Testing if two things are true with AND, the && operator
        // a person can be a blood donor if they weight at least 110 pounds AND are 17 or older

        System.out.println("What is your weight?: ");
        double weight = positiveDoubleInput();

        System.out.println("How old are you?: ");
        int age = positiveIntInput();


        if (weight >= 110 && age >= 17) {
            System.out.println("You are eligible to be a blood donor.");
        }
        else {
            System.out.println("Sorry, you are not eligible.");
            // Figures out why the user wasn't eligible
            //If the user didn't weight enough the program communicates that
            if (weight < 110){
                System.out.println("You do not weight enough.");
            }

            //If the user wasn't old enough the program communicates that
            if (age < 17){
                System.out.println("You are not old enough. You must be 17 or older.");
            }
        }
    }
}
