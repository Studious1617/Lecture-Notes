package com.week_0.week_0;

public class PizzaRolls {
    public static void main(String[] args) {
        // sharing pizza rolls between people
        double pizzaRolls = 40;
        int people = 7;

        double rollsPerPerson = pizzaRolls / people;

        System.out.println("Each person gets " + rollsPerPerson + " pizza rolls.");
    }
}
