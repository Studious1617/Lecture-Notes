package Week2;

import static input.InputUtils.*;

public class SquareOfStars {
    public static void main(String[] args) {

        //Display a square of *
        String character = stringInput("What character(s) do you want to display a table of?: ");
        int verticalSize = positiveIntInput("How many vertical \"" + character + "\" do you want?: ");
        int horizontalSize = positiveIntInput("How many horizontal \"" + character + "\" do you want?: ");
        System.out.println("\n");


        //The outer loop prints one row per loop repeat
        for (int x = 0; x < verticalSize; x++){

            //Inner for loop. For each row print a star 5 times
            for (int y = 0; y < horizontalSize; y++){
                //Notice System.out.print() - not println. This doesn't add the newline at the end of the output, so all the stars are on the same line
                System.out.print(character);
            }
            //And then move to the next line
            System.out.println();
        }



    }
}
