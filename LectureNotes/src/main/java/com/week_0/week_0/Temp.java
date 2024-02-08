package com.week_0.week_0;

public class Temp {
    public static void main(String[] args) {
        // Initializing the variables that will store the date
        String currentMonth = "January";
        int dayOfMonth = 11;

        // Initializing the variables that will store the forecasts
        double forecastHigh = 19.4;
        double forecastLow = -3.7;

        // Calculating the difference in temperature
        double tempDifference = forecastHigh - forecastLow;

        // Formatting and displaying the final message
        System.out.printf("On %s %d, the difference between the high temperature of %.1fF and the low temperature of %.1fF is %.1fF", currentMonth, dayOfMonth, forecastHigh, forecastLow, tempDifference);
    }
}
