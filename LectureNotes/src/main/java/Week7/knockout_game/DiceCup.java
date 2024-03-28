package Week7.knockout_game;

import java.util.ArrayList;
import java.util.List;

public class DiceCup {

    private List<Dice> allDice;  //Declared List of Dice objects called allDice

    //Constructor
    public DiceCup(int numberOfDice){  //Input descriptions for calls
        allDice = new ArrayList<>();  //Initialized allDice arrayList

        //For loop that makes Dice objects for the number of dice previously specified
        for (int d = 0; d < numberOfDice; d++){
            Dice dice = new Dice();  //Makes a new Dice object named dice
            allDice.add(dice);  //Adds new Dice object to the allDice List
        }
    }

    //Instance for rolling all the dice
    public int rollAll(){
        int total = 0;  //Initializes the total as 0

        //Loops through each dice in the allDice arrayList
        for (Dice dice: allDice){
            int diceRoll = dice.roll();  //Rolls each dice with the roll() instance
            total = total + diceRoll;  //Stores the result of the previous total and the dice roll number added together
        }

        return total;  //Returns the final total
    }



}
