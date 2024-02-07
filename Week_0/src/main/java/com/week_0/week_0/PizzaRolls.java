package com.week_0.week_0;

public class PizzaRolls {
    public static void main(String[] args) {

        // sharing pizza rolls between people
        double pizzaRolls = 16;
        int people = 3;

        //Initializing and calculating in one line
        double rollsPerPerson = pizzaRolls / people;

        //Displaying answer
        System.out.println("Each person gets " + rollsPerPerson + " pizza rolls.");

        // How to round double to 1 decimal place after the point
        System.out.printf("Each person gets %.1f pizza rolls.", rollsPerPerson);


        //Variable names can't start with numbers
        //Variable names must be consistent. The name of the class must match the name of the java class
        //You must fix any syntax errors before the program will run
        //Make sure to check if the logic makes sense. Logic errors will often not be noticed by Intelliji
        //Work backwards as you debug


    }
}
