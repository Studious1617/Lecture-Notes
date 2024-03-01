package Week3;

import static input.InputUtils.stringInput;

public class HelloMethods {
    public static void main(String[] args) {

        // Get input
        String name = stringInput("Please enter your name: ");

        // Call the makeGreeting method and store result/return in the greeting variable
        String greeting = makeGreeting(name);

        // Display greeting
        System.out.println(greeting);
    }

    // Make new makeGreeting method
    public static String makeGreeting(String n){
        // Store the premade greeting "Hello" and the user's inputted name as well as an !
        String greeting = "Hello" + n + "!";
        return greeting;  // Return or output the message
    }




}
