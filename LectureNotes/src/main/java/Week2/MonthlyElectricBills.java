package Week2;

import static input.InputUtils.doubleInput;

public class MonthlyElectricBills {
    public static void main(String[] args) {

        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        double total = 0;
        double[] monthExpense = new double[12];

        for (int month = 0; month < monthNames.length; month++){
            String monthName = monthNames[month];
            double amountSpent = doubleInput("What did you spend on electricity in " + monthName + "?: ");
            total += amountSpent;
            monthExpense[month] = amountSpent;
        }


        System.out.println();
        for (int month = 0; month < monthNames.length; month++){
            String monthName = monthNames[month];
            System.out.printf("In %s you spent $%.2f\n", monthName, monthExpense[month]);
        }

        System.out.printf("\nTotal for the year = $%.2f\n", total);
        double totalAverage = total / monthNames.length;
        System.out.printf("Average for each month = $%.2f\n", totalAverage);





    }
}
