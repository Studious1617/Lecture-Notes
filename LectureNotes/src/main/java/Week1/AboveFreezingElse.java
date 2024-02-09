package Week1;

import static input.InputUtils.doubleInput;

public class AboveFreezingElse {
    public static void main(String[] args) {

        double temp = doubleInput("Enter today's temperature in F");

        //Indentation in if blocks is optional but strongly suggested
        //It's a standard convention that improves readability

        if (temp > 32){
            //This will inform the user of the above freezing weather if the condition is true
            System.out.println("It's above freezing.");
        }
        // Runs if the condition above is not true
        else {
            // This will inform the user of the freezing or below freezing weather if the condition is true
            System.out.println("It's below freezing.");
        }


    }
}
