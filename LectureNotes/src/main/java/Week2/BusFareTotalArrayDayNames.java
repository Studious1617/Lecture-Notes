package Week2;

import static input.InputUtils.doubleInput;

public class BusFareTotalArrayDayNames {
    public static void main(String[] args) {

        // An array with the names of each day of the week, used to create questions for the user
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        double total = 0;  // Will add each day's expenses to this variable to calculate the week's total

        for (int day = 0; day < dayNames.length; day++){  // Will loop once for each the day in a week
            String dayName = dayNames[day];
            double dayExpense = doubleInput("On " + dayName + ", what did you spend on bus fares?");
            total = total + dayExpense;  // Add the day's expense to the total
        }

        System.out.println("For the week, you spent $" + total + " for the bus fares.");



    }
}
