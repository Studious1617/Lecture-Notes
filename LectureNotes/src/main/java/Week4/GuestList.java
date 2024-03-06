package Week4;

//Imports
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static input.InputUtils.*;

public class GuestList {
    public static void main(String[] args) {

        List<String> guestList = new ArrayList<>();

        //Collects names and adds them to guest list
        while (true) {
            //Input for names of guests
            String name = stringInput("Enter name of guest or Enter to quit");

            if (name.isEmpty()) {  //If user presses Enter, name will be an empty string
                break;
            }

            if (containsIgnoresCase(guestList, name)) {    //Ignores duplicates
                System.out.println("You already added " + name);
            } else {
                System.out.println("Adding " + name + " to the guest list...");
                guestList.add(name);
            }
        }

        Collections.sort(guestList); //Sort alphabetically

        printGuestNames(guestList);  //Calls the printGuestNames method

        //Remove guests from list if needed
        while (yesNoInput("Do you want to remove any guests?")) {  //If the user responds yes then the procedure to remove guests will be done while if the user answers no then the loop will not be run
            System.out.println("Here are all the guests");
            printGuestNames(guestList);

            //Stops the loop if there are no more guests to remove
            if (guestList.isEmpty()) {
                System.out.println("There are no more guests to remove");
                break;
            }

            //Creates an index variable which will be a user-selected positive int
            int index = positiveIntInput("Enter the number of the guest to remove");
            index--;   //The guests are printed in a 1-based list, so 1, 2, 3 for three guests. Subtract 1 to get 0-based index
            if (index < guestList.size()) {   //Verify index is in range to avoid a crash
                String removedGuest = guestList.remove(index);
                System.out.println("Removed guest " + removedGuest);
            }
            //Validation for if the user inputs a number that doesn't correspond with an index in the guestList arraylist, like if there are 4 elements and the user inputs 10 as the input number to be removed
            else {
                System.out.println("Error - please enter a valid number of a guest");
            }
        }

        printGuestNames(guestList);  //Calls the printGuestNames method

        System.out.println("The number of guests in the guest list is " + guestList.size());  //Informs the user of how many guests are in the guest list

        selectPrizeWinner(guestList);  //Calls method which selects a prize winner from the people in the guest list
    }

    //Method to select a prize winner from the people in the guest list
    public static void selectPrizeWinner(List<String> guests) {
        //Validation for if the guest list is empty
        if (guests.isEmpty()) {
            System.out.println("Warning - no guests - no-one to win the prize");
            return;
        }

        //Makes a random number generator called rng
        Random rng = new Random();
        //Chooses a random index of a guest to be the prize winner and uses the size of the guest list to be the range used
        int randomGuestIndex = rng.nextInt(guests.size());  // 0, 1, 2, 3 for a guest list with the size of 4

        String prizeWinner = guests.get(randomGuestIndex);  //Puts the string attached to the index gained from the above code into another variable called PrizeWinner

        //Informs the user of who won
        System.out.println("Guest number " + (randomGuestIndex + 1) + " "
                + prizeWinner + " wins a prize!");
    }

    //Method that prints out the guest names
    public static void printGuestNames(List<String> guests) {

        System.out.println("Your guest list is: \n");

        if (guests.isEmpty()) {
            System.out.println("There are no guests in the list.");
        } else {
            for (int i = 0; i < guests.size(); i++) {
                System.out.println((i + 1) + ": " + guests.get(i));
            }
        }
    }

    //Makes a contains method that ignores case and returns true if a String arrayList contains a certain String and returns false if not
    public static boolean containsIgnoresCase(List<String> list, String data) {
        for (String item : list) {
            if (item.equalsIgnoreCase(data)) {  //Main code --> sees if the item for this rendition of the for-loop equals the data we're testing for, ignoring case
                return true;
            }
        }
        return false;
    }
}
