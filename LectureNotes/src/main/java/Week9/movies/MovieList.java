package Week9.movies;

import java.util.List;

import static input.InputUtils.*;

public class MovieList {

    //Database path
    private static final String DB_PATH = "jdbc:sqlite:movie_watchlist.sqlite";
    private static Database database;

    //Main method
    public static void main(String[] args) {
        //Makes a new database that will live in the database path
        database = new Database(DB_PATH);

        //Method that adds new movies
        addNewMovies();
        System.out.println();

        //Method that checks if a movie is
        // watched and allows the user to rate it
        checkIfWatchedAndRate();
        System.out.println();

        //Method that deletes watched movies
        deleteWatchedMovies();
        System.out.println();

        //Method that searches for movies
        searchMovie();
        System.out.println();

        //Method that displays all movies
        displayAllMovies();
    }



    public static int getRatingOutOfFive(){
        //Gets and stores the rating with positive int validation
        int rating = positiveIntInput("What is your rating for this movie, in stars out of 5?");
        //Loops until user clears the validation
        while (rating < 0 || rating > 5){
            System.out.println("Error, enter a number between 0 and 5");
            rating = positiveIntInput("What is your rating, in stars out of 5?");
        }
        return rating;
    }

    public static String getNonEmptyMovieName(){
        //Gets and stores the name with string validation
        String name = stringInput("Enter a movie name");
        //Loops until user adds a character
        while (name.isEmpty()){
            System.out.println("Error - enter a name");
            name = stringInput("Enter a movie name");
        }
        return name;
    }

    public static void addNewMovies(){
        //Does this first
        do {
            //Calls method and stores non-empty name in movieName variable
            String movieName = getNonEmptyMovieName();
            //Gets and stores user answer in movieWatched variable
            boolean movieWatched = yesNoInput("Have you seen this movie yet?");
            int movieStars = 0;  //Initializes the movieStars variable

            if(movieWatched){
                //Calls method that gets a rating out of five and stores it in movieStores
                movieStars = getRatingOutOfFive();
            }
            //Makes new movie Movie object
            Movie movie = new Movie(movieName, movieStars, movieWatched);
            //Adds new movie with all the
            // above information to the addNewMovie
            // method in the database class
            database.addNewMovie(movie);

        } while (yesNoInput("Add another movie to the watchlist? "));  //Repeats until the user inputs no
    }

    public static void displayAllMovies(){
        //Gets all the movies in the database and stores
        // it in the newly made movies list
        List<Movie> movies = database.getAllMovies();
        if (movies.isEmpty()){
            System.out.println("No movies");  //If the movies list is empty then print this message
        }
        else {
            for (Movie movie: movies){
                System.out.println(movie);  //If the movies list isn't empty then print out all the movies in it
            }
        }
    }

    public static void checkIfWatchedAndRate(){
        //Made a new unwatchedMovies list that gets all the movies that haven't yet been watched
        List<Movie> unwatchedMovies = database.getAllMoviesByWatched(false);

        //Loops through all the unwatched movies
        for (Movie movie: unwatchedMovies){
            //Asks the user if they have watched the movie and stores answer in hasWatched variable
            boolean hasWatched = yesNoInput("Have you watched " + movie.getName() + " yet?");
            //If the user has watched it then the code below runs
            if (hasWatched){
                //Stores number of stars under 5 in stars variable
                int stars = positiveIntInput("What is your rating for " + movie.getName() + " out of 5?");
                //Sets the watched variable to true
                movie.setWatched(true);
                //Sets stars to the above inputted number of stars
                movie.setStars(stars);
                //Updates the movie Movie object in the database
                database.updateMovie(movie);
            }
        }
    }

    public static void deleteWatchedMovies(){

        //Lets the user see what they can delete
        System.out.println("\nHere are all the movies you have seen in case you wish to delete any: ");

        //Gets list of watched movies from database
        List<Movie> watchedMovies = database.getAllMoviesByWatched(true);

        //Loops through all the movies in the watchedMovies list
        for (Movie movie: watchedMovies){
            //Stores user's decision to delete or not in delete variable
            boolean delete = yesNoInput("Delete " + movie.getName() + "?");
            //If user chooses to delete then deletion happens
            if (delete){
                database.deleteMovie(movie);
            }
        }
    }

    public static void searchMovie(){
        //Stores the search term in movieName variable
        String movieName = stringInput("Enter movie name for searching: ");
        //Seaches the database and stores the result(s) in the moviesMatches list
        List<Movie> movieMatches = database.search(movieName);

        if (movieMatches.isEmpty()){
            System.out.println("No matches");  //If the movies list is empty then print this message
        }
        else {
            for (Movie movie: movieMatches){
                System.out.println(movie);  //If the movies list isn't empty then print out all the movies in it
            }
        }
    }
}
