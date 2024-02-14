package Week2;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class BusFares {
    public static void main(String[] args) {

        int numberOfdays = intInput("How many days are you calculating for?: ");
        double total = 0;

        for (int day = 1; day <= numberOfdays; day++){
            double amountSpent = doubleInput("What did you spend on bus fares on day " + day + "?: ");
            total += amountSpent;
        }
        System.out.printf("Total for the week = $%.2f", total);


    }
}
