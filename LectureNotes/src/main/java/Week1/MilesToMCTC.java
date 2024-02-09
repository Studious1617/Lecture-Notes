package Week1;

import static input.InputUtils.positiveDoubleInput;

public class MilesToMCTC {
    public static void main(String[] args) {
        double miles = positiveDoubleInput("How many miles from your house to MCTC?: ");
        double km = miles * 1.6;
        System.out.println("You live " + km + " kilometers from school.");

        // Check if the user live more than 10 miles away
        if (miles > 10){
            //If they do then this code runs relaying that info to the user
            System.out.println("You live more than 10 miles away.");
        }

    }
}
