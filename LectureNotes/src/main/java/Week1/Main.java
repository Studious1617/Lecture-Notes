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

        /*Scope
         *
         * The scope of a variable defines where it exists, or where it can be used in the program.
         *
         * Assumptions: thinking about scope of variables in methods within a class.
         *
         * The rules are different with global variables and static variables which can be accessed from other classes (Java files)
         *
         * If a variable doesn't exist, or is not in scope, it's an error to use it.
         *
         * Scope of a variable is from where it is created, to the end of the block it is created in.
         *
         * The block it is created in is defined by curly braces ({}). The closest open curly brace (the closest one above the variable definition) is the start of the block. The matching closed curly brace is the end of the scope.
         *
         * When a variable goes out of scope, it can no longer be used in the program.
         *
         * Scopes and blocks can be nested. When you create a method, that creates a block. When you create an if-statement, there's another block. An else statement has its own block. Loops have blocks too.
         *
         * Restricting scope of variables is important
         *   -It allows us to re-use variable names
         *   -If a variable could be used anywhere, then any part of the program could change it, which could lead to bugs if that variable was used or changed accidentally.
         *   -If variables existed everywhere at all times, it would use a lot of memory.
         *   -It allows Java to free up memory used by variables when they go out of scope */

        //A bookstore has a 10% student discount for students with a .edu email
        //System.out.print(email);  // error - can't use variable before created

        //To find the block for the email variable just look above your variable definition and look at the first open curly brace and then the first closed curly brace that matches the first

        //The scope is when it is first defined to its ending curly brace

        //This would give an error --> System.out.println(email);  //error - variable has not yet been created

        String email = stringInput("Enter your email: ");

        double bookPrice = 40;

        double discount = 0;
        if (email.endsWith(".edu")) {
            System.out.println("Your student email is " + email);
            discount = 10;
        }

        System.out.println(email);
        //Calculate final price with any discounts
        bookPrice = bookPrice / 100 * (100 - discount);

        System.out.println(bookPrice);

        /* double check = positiveDoubleInput("Enter your food cost: ");
        double tip;

        for (double x = .1; x <= .30; x = x + 0.05) {
            tip = check * x;
            System.out.println(tip + " = " + check + " * " + x);
            double finalTotal = check + tip;
            System.out.println(finalTotal + " = " + check + " + " + tip);
            System.out.println();
        }
        */

    }
}
