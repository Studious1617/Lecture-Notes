package com.week_0.week_0;

public class StringEscapeCharacters {
    public static void main(String[] args) {
        /*
         * String Part 2
         *   -Special characters like tab, newline, backslash, and double quotes must be escaped in String literals
         *       -Escape codes are the same as Python
         *   -\t --> tab
         *   -\n --> newline
         *   -\" --> double quote
         *   -\\ --> \ in a String literal*/


        // Escaping quotes
        String message = "This class is \"Java Programming\"";
        System.out.println(message);

        // Adding new lines within one string
        String anotherMessage = "Welcome, everyone!\nI hope you enjoy the class!";
        System.out.println(anotherMessage);

        // Adding tabs
        String andAnotherMessage = "Videoes\tLabs\tZoom";
        System.out.println(andAnotherMessage);


        /*
        * Primitive Variable Types: Booleans
        *   -Can store one of two values: true or false
        *   -Useful in conditional statements
        *   -Ex.*/
               boolean allDone = false;
               boolean easyMode = true;
               if (allDone) {
                   System.out.println("Great!");
               }


        /*
        * Other Primitive Types
        *   -Ex. byte, long and short for integers
        *       -long is for large numbers
        *           -Anything around 2 billion or -2 billion needs to be stored in a long variable
        *   -int and double are defaults. If you want to use a different type you'll have to tell the compiler
        *   -Code Example:*/
                float temp = 67.4f;         // f to denote a float and not a double
                long bigNumber = 1234567012;     // That's a letter 1 at the end and 1234567012341 is the original number
        // Most of the time we'll use int and double

    }
}
