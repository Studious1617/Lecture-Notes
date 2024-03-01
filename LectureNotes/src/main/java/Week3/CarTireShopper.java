package Week3;

import static input.InputUtils.*;

public class CarTireShopper {
    public static void main(String[] args) {
        //Input for number of tires
        int numberOfTiresToCompare = positiveIntInput("Enter number of tires");
        //Makes a tireReports string
        String[] tireReports = new String[numberOfTiresToCompare];

        //Makes a loop that gets the tire info from the user
        for (int t = 0; t < numberOfTiresToCompare; t++){
            String report = getTireInfo();
            tireReports[t] = report;
        }

        //prints and formats the tire reports
        printReportTable(tireReports);

    }

    //Loops through an array in order to print out the tire reports in a formatted table
    public static void printReportTable(String[] tireReports) {
        for (int t = 0; t < tireReports.length; t++){
            System.out.println(tireReports[t]);
        }
    }

    //Gets tire info from the user
    public static String getTireInfo(){
        //Gets the tire inputs
        String tireName = stringInput("Enter name of tire ");
        double price = doubleInput("Enter price for " + tireName);
        double miles = doubleInput("Enter warranty miles for " + tireName);
        //Calculates what the price of the tires per 1000 miles would be
        double pricePerThousandMile = price / miles * 1000;
        //Returns the report
        return "The " + tireName + " tire costs $" + pricePerThousandMile + " per thousand miles.";
    }
}
