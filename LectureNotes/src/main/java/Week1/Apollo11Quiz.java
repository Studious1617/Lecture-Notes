package Week1;

import static input.InputUtils.intInput;

public class Apollo11Quiz {
    public static void main(String[] args) {
        System.out.println("Quiz time!");
        System.out.println("What year did the Apollo 11 spaceship land on the moon?: ");

        // It's 1969

        int answer = intInput();

        //The != operator tests if two values are NOT equal
        //This condition tests if the answer variable is not equal to 1969
        if (answer != 1969){
            System.out.println("Wrong answer - it was 1969!");
        }

        /*
        Comparison operators
            * == --> Equal to
            * > --> Greater than
            * >= --> Greater than or equal to
            * < --> Less than
            * <= --> Less than or equal to
            * != --> not equal to */


    }
}
