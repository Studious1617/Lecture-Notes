package Week7.knockout_game;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.*;

public class Game {

    //Fields
    private DiceCup diceCup;  //Declares a private DiceCup object named diceCup
    private List<Player> players;  //Declares a private DiceCup object named diceCup

    //Main method
    public static void main(String[] args) {
        Game knockout = new Game();  //Makes a new Game object called knockout
        knockout.startGame();  //Starts the game. Calls the startGame() method for knockout
    }



    //Method that starts the game
    public void startGame(){
        //Make player objects - need names
        //Get knockout numbers
        //Create a dice cup
        //Play the game - take turns until only one player is left
        //Each player will roll dice - use dice cup
        //Print winner

        diceCup = new DiceCup(2);  //Stores a new DiceCup object with 2 dice into the diceCup field
        //Asks user(s) for number of players and stores answer into numberOfPlayers variable
        int numberOfPlayers = positiveIntInput("How many players?");
        //Calls the createPlayers method and inputs numberOfPlayers as the arguement
        createPlayers(numberOfPlayers);

        setKnockoutNumbers();  //Calls the setKnockoutNumbers which sets up the knockout numbers
        
        play();  //Calls the play() method which sets the game into motion
        
        printGameResults();  //Prints the results of the game in a readable format
    }



    //Method that creates the players
    private void createPlayers(int numberOfPlayers) {
        players = new ArrayList<>();  //Initializes the players field with a new ArrayList

        for (int x = 0; x < numberOfPlayers; x++){
            String name = stringInput("Enter player " + x + "'s name");  //Temporarily stores the name of each player
            Player player = new Player(name);  //Makes a new Player object named player and inputs the value of the name variable for each new player
            players.add(player);  //Adds the new Player object to the player arrayList for each player
        }
    }



    //Method for setting the knockout numbers for each player
    private void setKnockoutNumbers() {

        //Loops through each player in the players arrayList
        for (Player p: players) {

            int knockoutNumber;  //Declares the knockoutNumber variable

            //Loop that ensures that the user inputs a knockout number that is 6, 7, 8, or 9
            do {
                knockoutNumber = intInput("Player " + p.getName() + ", enter your knock out number." +
                        " It must be 6, 7, 8, or 9.");  //Asks each player for their knockout number
            } while (knockoutNumber < 6 || knockoutNumber > 9);  //Number must be 6, 7, 8, or 9 to break out of loop

            p.setKnockoutNumber(knockoutNumber);  //Sets the knockout number for each player with the interior Player instance
        }
    }

    //Method that plays the game
    private void play() {

        int playerIndex = 0;  //Initializes the playerIndex variable
        int totalPlayers = players.size();  //Initializes the totalPlayers variable as the number of players in the players arrayList

        //Loop continues while there is more than one player in the game
        while (moreThanOnePlayerInPlay()){
            Player currentPlayer = players.get(playerIndex);  //Stores the playerIndex of the current player in the currentPlayer Player object

            if (currentPlayer.isKnockedOut()){
                System.out.println("Sorry, " + currentPlayer.getName() + " you are out!");  //If the current player is knocked then print out this message
            } else {
                //If the current player isn't knocked out then run the code below
                String ignore = stringInput("Player " + currentPlayer.getName() + ", press enter to roll.");  //Tells the user how to continue
                //Stores the result of the currentPlayer calling the playTurn method with the diceCup field in a variable called turnResult
                String turnResult = currentPlayer.playTurn(diceCup);
                //Prints out the turn result
                System.out.println(turnResult);
            }
            playerIndex = (playerIndex + 1) % totalPlayers;  //Makes sure that everyone gets a turn each round
        }
    }



    //Method that checks to see if there is more than one player in the game
    private boolean moreThanOnePlayerInPlay() {

        int totalPlay = 0;  //Initiazlizes totalPlay

        //Loops through each player in the players arrayList
        for (Player p: players){
            if (!p.isKnockedOut()){
                totalPlay++;  //If the current player is not knocked out then increment totalPlay
            }
        }
        System.out.println("There are " + totalPlay + " player(s) in the game.");  //Tells the user how many players are in the game
        if (totalPlay > 1){
            return true;  //Returns true if there is more than one player in the game
        } else {
            return false;  //Returns false if there is less than one player in the game
        }
    }

    //Method for formatting and printing the game results
    private void printGameResults() {
        //Loops through each player in the players arrayList
        for (Player player: players){
            if (player.isKnockedOut()){  //Checks to see if the current player is knocked out
                System.out.println("\n\nPlayer " + player.getName() + " was knocked out.");  //If so then this prints
            } else {
                System.out.println("\n\nPlayer " + player.getName() + " IS THE WINNER!!!");  //If not then this prints
            }
        }
    }

    /*Questions
* The game ends immediately with 0 players and ends after the knockout number is set for 1 player
* We might need to limit the max number of players for performance issues and since it might make a game that just doesn't end
* We would need to make some methods that deal with the individual values and call it when needed*/


}
