package Week7.knockout_game;

import java.util.Random;

public class Dice {
    Random rnd = new Random();
    public int roll(){
        return rnd.nextInt(6) + 1;  //Add 1 to make the range between 1 and 6
    }
}
