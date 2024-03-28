package Week7.knockout_game;

public class Player {

    //Fields
    private String name;
    private boolean knockedOut;  //Are they still in the game or not?
    private int knockoutNumber;  //What number makes them get knocked out?

    //Constructor
    public Player(String name){  //Input descriptions for calls
        this.name = name;
        this.knockedOut = false;  //Whether a player is knocked out or not starts as false
    }



    //Instance that plays a turn in the game
    public String playTurn(DiceCup diceCup){
        int score = diceCup.rollAll();  //Calls the rollAll() instance from the diceCup class and stores the result in score

        if (playerKnockedOut(score)){
            knockedOut = true;  //If the score from above makes playerKnockedOut output true then knockedOut will be set to true
        }

        String resultTemplate = "Player %s rolled a total of %d and %s knocked out. (Your knockout number was %d)";  //Stores this format template in the resultTemplate variable

        String knockedOutOrNot = "was not"; //Starts off as this no matter what
        if (knockedOut){
            knockedOutOrNot = "was";  //If the current player is knocked out then knockedOutOrNot will be set to this String
        }

        //Formats the final playTurn message and stories it in the result variable
        String result = String.format(resultTemplate, name, score, knockedOutOrNot, knockoutNumber);

        return result;  //Returns the result variable
    }



    //Instance that checks to see if the current player is knocked out or not
    private boolean playerKnockedOut(int score) {
        if (score == knockoutNumber){
            return true;  //If the score is equal to the knockout number then the player is knocked out so return true
        } else {
            return false;  //Else return false
        }
    }



    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isKnockedOut() {
        return knockedOut;
    }

    public void setKnockedOut(boolean knockedOut) {
        this.knockedOut = knockedOut;
    }

    public int getKnockoutNumber() {
        return knockoutNumber;
    }

    public void setKnockoutNumber(int knockoutNumber) {
        this.knockoutNumber = knockoutNumber;
    }
}
