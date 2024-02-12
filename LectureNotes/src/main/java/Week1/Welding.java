package Week1;

import static input.InputUtils.yesNoInput;

public class Welding {
    public static void main(String[] args) {

        // When taking welding classes at MCTC, you must dress safely. You should wear cotton or wool clothes. And, you should wear closed toe shoes.

        // This program checks if a student is dressed safely for welding

        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes?: ");
        boolean woolClothes = yesNoInput("Are you wearing wool clothes?: ");
        boolean closedToeShoes = yesNoInput("Are you wearing closed toe shoes?: ");

        // TODO - write an if-statement to check if the student is dressed safely

        if ((cottonClothes || woolClothes) && closedToeShoes){
            System.out.println("You're dressed safely.");
        }
        else {
            System.out.println("You're not dressed safely.");
            if ((cottonClothes || woolClothes) == false){
                System.out.println("You must wear either cotton or wool clothes.");
            }
            else {
                System.out.println("You must wear closed toe shoes.");
            }
        }
    }
}
