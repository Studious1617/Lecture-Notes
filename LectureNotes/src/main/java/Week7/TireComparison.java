package Week7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static input.InputUtils.*;

public class TireComparison {
    public static void main(String[] args) {

        //Makes a new tireList arrayList of the Tire class (filled with Tire objects)
        List<Tire> tireList = new ArrayList<>();

        //A do loop that gets the initial tire info and repeats until the user has inputted all they intend to
        do {
            Tire tire = getTireInfo();  //Calls the getTireInfo() method and stores its info in a Tire object called tire
            tireList.add(tire);  //Adds the new tire into the tireList
        } while (yesNoInput("More tires to add to compare?"));  //Repeat condition

        Collections.sort(tireList);  //Sorts tireList in the way described in itself
        printReportTable(tireList);  //Prints the report table for all the inputted info
    }

    //Method for printing out a report table
    private static void printReportTable(List<Tire> tireList){
        //A for loop that prints out the cost descriptions for each tire in tireList
        for (Tire tire: tireList){
            //Prints out the cost for a set of 4 tires
            System.out.println(tire + " cost per set of 4 is $" + tire.costForSet());
        }
    }

    //Method for getting the tire info from the user
    private static Tire getTireInfo(){
        //Prompts user for name and stores it in name variable
        String name = stringInput("Enter name of tire:");
        //Prompts user for price and stores it in price variable
        double price = positiveDoubleInput("Enter price of " + name + ":");
        //Prompts user for miles under warranty and stores it in milesWarranty variable
        int milesWarranty = positiveIntInput("Enter number of miles warranty:");

        //Makes a new Tire object called tire with the user-inputted data
        Tire tire = new Tire(name, price, milesWarranty);
        return tire;  //Returns tire
    }
}
