package Week7.knockout_game;

import java.util.Random;

public class Dice {
    Random rnd = new Random();  //Makes a new Random object called rnd

    //An instance that rolls the "Dice", generating a number between and including 1 and 6
    public int roll(){
        return rnd.nextInt(6) + 1;  //Add 1 to make the range between 1 and 6
    }
}
