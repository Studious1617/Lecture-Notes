package com.week_0.week_0;

public class Address {
    public static void main(String[] args) {

        String city = "Minneapolis";
        String state = "mn"; // let's start with this in lowercase


        // Create a new String variable that has "Minneapolis, MN"

        // Make the variable
        String cityAndState = city + ", " + state.toUpperCase();

        System.out.println(cityAndState);
    }
}
