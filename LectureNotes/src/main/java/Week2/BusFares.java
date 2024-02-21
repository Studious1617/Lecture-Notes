package Week2;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class BusFares {
    public static void main(String[] args) {


        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        double total = 0;

        // Off by one error - fixed!
        for (int day = 0; day < dayNames.length; day++){
            String dayName = dayNames[day];
            double amountSpent = doubleInput("What did you spend on bus fares on " + dayName + "?: ");
            total += amountSpent;
        }
        System.out.printf("Total for the week = $%.2f", total);


    }
}
