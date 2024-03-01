package Week3;

import static input.InputUtils.doubleInput;

public class MPG {
    public static void main(String[] args) {
        //User input for number of miles driven and gallons of gas
        double miles = doubleInput("Enter number of miles driven: ");
        double gas = doubleInput("Enter gallons of gas used: ");

        //Calls the milesPerGallon method and stores the returned result into the mpg variable
        double mpg = milesPerGallon(miles, gas);
        //Prints out the result of the miles per gallon calculations
        System.out.println("The mpg for this journey is " + mpg + " miles per gallon.");
    }

    //milesPerGallon method which calculates the mpg given a user inputted number of miles and gallons of gas
    public static double milesPerGallon(double miles, double gallonsOfGas){
        //Calculates mpg
        double mpg = miles / gallonsOfGas;
        return mpg;  //Returns mpg
    }
}
