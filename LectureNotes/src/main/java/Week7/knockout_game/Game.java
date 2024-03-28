package Week7.knockout_game;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.*;

public class Game {
    private DiceCup diceCup;
    private List<Player> players;
    public static void main(String[] args) {
        Game knockout = new Game();
        knockout.startGame();
    }

    public void startGame(){
        //Make player objects - need names
        //Get knockout numbers
        //Create a dice cup
        //Play the game - take turns until only one player is left
        //Each player will roll dice - use dice cup
        //Print winner

        diceCup = new DiceCup(2);
        int numberOfPlayers = positiveIntInput("How many players?");
        createPlayers(numberOfPlayers);

        setKnockoutNumbers();
        
        play();
        
        printGameResults();
    }

    private void createPlayers(int numberOfPlayers) {
        players = new ArrayList<>();

        for (int x = 0; x < numberOfPlayers; x++){
            String name = stringInput("Enter player " + x + "'s name");
            Player player = new Player(name);
            players.add(player);
        }
    }

    private void setKnockoutNumbers() {

        for (Player p: players) {

            int knockoutNumber;

            do {
                knockoutNumber = intInput("Player " + p.getName() + ", enter your knock out number." +
                        " It must be 6, 7, 8, or 9.");
            } while (knockoutNumber < 6 || knockoutNumber > 9);  //Number must be 6, 7, 8, or 9

            p.setKnockoutNumber(knockoutNumber);
        }
    }

    private void play() {

        int playerIndex = 0;
        int totalPlayers = players.size();

        while (moreThanOnePlayerInPlay()){
            Player currentPlayer = players.get(playerIndex);

            if (currentPlayer.isKnockedOut()){
                System.out.println("Sorry, " + currentPlayer.getName() + " you are out!");
            } else {
                String ignore = stringInput("Player " + currentPlayer.getName() + ", press enter to roll.");
                String turnResult = currentPlayer.playTurn(diceCup);
                System.out.println(turnResult);
            }
            playerIndex = (playerIndex + 1) % totalPlayers;
        }
    }

    private boolean moreThanOnePlayerInPlay() {

        int totalPlay = 0;
        for (Player p: players){
            if (!p.isKnockedOut()){
                totalPlay++;
            }
        }
        System.out.println("There are " + totalPlay + " player(s) in the game.");
        if (totalPlay > 1){
            return true;
        } else {
            return false;
        }
    }

    private void printGameResults() {
        for (Player player: players){
            if (player.isKnockedOut()){
                System.out.println("\n\nPlayer " + player.getName() + " was knocked out.");
            } else {
                System.out.println("\n\nPlayer " + player.getName() + " IS THE WINNER!!!");
            }
        }
    }

    /*Questions
* The game ends immediately with 0 players and ends after the knockout number is set for 1 player
* We might need to limit the max number of players for performance issues and since it might make a game that just doesn't end
* We would need to make some methods that deal with the individual values and call it when needed*/


}
