package Week1;

import static input.InputUtils.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String userName = stringInput("PLease enter your name: ");
        System.out.println("Welcome, " + userName);

        int howManyClasses = intInput("How many classes are you taking?: ");
        System.out.println("You are taking " + howManyClasses + " classes.");


        //InputUtils method examples
        String name = stringInput("What is your name?: ");

        int candyBars = intInput("How many candy bars?: ");
        //As above, but checks that number is positive as well
        int people = positiveIntInput("How many people?: ");

        double price = doubleInput("What is the price of the item?: ");
        //As above but checks that number is positive
        double length = positiveDoubleInput("How long is the string?: ");

        //User can type "y" or "n" or "yes" or "no" or any of these in uppercase
        boolean ok = yesNoInput("OK to continue?: ");

        //The question is optional, so you can als write code like this...
        System.out.println("What is your name?: ");
        String data = stringInput();
    }
}
