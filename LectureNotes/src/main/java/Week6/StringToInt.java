package Week6;

public class StringToInt {
    public static void main(String[] args) {

        String hopeThisIsANumber = "50";  //Use a number and a string like "cat"

        try {
            int number = Integer.parseInt(hopeThisIsANumber);  //Main part of the code - gets a number from a string made entirely of numerical strings
            System.out.println("The number is " + number);  //Prints out the number
        } catch (NumberFormatException e){
            System.out.println(hopeThisIsANumber + " is not a valid number.");  //IO Exception error message
        }

        System.out.println("This is the end of the program.");  //Sign off
    }
}
