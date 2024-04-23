package Week9.movies;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private String databasePath;

    Database(String databasePath){  //constructor

        //Create table, or make sure it is created

        this.databasePath = databasePath;  //Makes a field for the database path

        //Exception handling for database
        try(Connection connection = DriverManager.getConnection(databasePath);
            Statement statement = connection.createStatement()){  //Establishes a connection and statements

            //Creates a new table if one by the same name is not already made
            statement.execute("CREATE TABLE IF NOT EXISTS " +
                    "movies (id INTEGER PRIMARY KEY, " +
                    "name TEXT UNIQUE CHECK(LENGTH(name) >= 1), " +
                    "stars INTEGER CHECK(stars >= 0 AND stars <= 5), " +
                    "watched BOOLEAN)");

        } catch (SQLException e){
            //Gives user an error message if an SQLException happens
            System.out.println("Error creating movie DB table because " + e);
        }

    }

    public void addNewMovie(Movie movie){

        //Makes a template for inserting variables in the Movie object
        String insertSQL = "INSERT INTO movies(name, stars, watched) VALUES (?, ?, ?)";

        //Exception handling for database
        try(Connection connection = DriverManager.getConnection(databasePath);
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)){

            //Insert into movies values ('Up', 4, true);
            //Sets the ? variables as the name, stars, and watched variables
            preparedStatement.setString(1, movie.getName());
            preparedStatement.setInt(2, movie.getStars());
            preparedStatement.setBoolean(3, movie.isWatched());

            preparedStatement.execute();  //Executes the prepared statement which was the insertion

        } catch (SQLException e){
            //Gives user an error message if an SQLException happens
            System.out.println("Error adding movie " + movie + " because " + e);
        }
    }

    public List<Movie> getAllMovies(){

        //Exception handling for database
        try(Connection connection = DriverManager.getConnection(databasePath);
        Statement statement = connection.createStatement()){
            //Get all movies and orders it by name
            ResultSet movieResults = statement.executeQuery("SELECT * FROM movies ORDER BY name");
            List<Movie> movies = new ArrayList<>();

            while (movieResults.next()){
                //Gets variable data from movies database and stores it in variables
                int id = movieResults.getInt("id");
                String name = movieResults.getString("name");
                int stars = movieResults.getInt("stars");
                boolean watched = movieResults.getBoolean("watched");
                //Makes new Movie object and adds the movie to the database
                Movie movie = new Movie(id, name, stars, watched);
                movies.add(movie);
            }

            return movies;

        } catch (SQLException e){
            //Gives user an error message if an SQLException happens
            System.out.println("Error fetching all movies because " + e);
            return null;  //Returns null
        }
    }

    public List<Movie> getAllMoviesByWatched(boolean watchedStatus){

        //Exception handling for database
        //Selects everything with watched as the variable
        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM movies WHERE watched = ?")){

            //Sets the ? as the watchedStatus
            preparedStatement.setBoolean(1, watchedStatus);
            //Stores the results of the executed query of the preparedStatement
            // in the movieResults ResultSet object
            ResultSet movieResults = preparedStatement.executeQuery();

            //Makes a new arrayList
            List<Movie> movies = new ArrayList<>();

            //Loops through each of the movies in the movieResults
            while (movieResults.next()){
                //Gets variable data from movies database and stores it in variables
                int id = movieResults.getInt("id");
                String name = movieResults.getString("name");
                int stars = movieResults.getInt("stars");
                boolean watched = movieResults.getBoolean("watched");
                //Makes new Movie object and adds the movie to the database
                Movie movie = new Movie(id, name, stars, watched);
                movies.add(movie);
            }

            return movies;

        } catch (SQLException e){
            //Gives user an error message if an SQLException happens
            System.out.println("Error getting movies because " + e);
            return null;
        }
    }

    public void updateMovie(Movie movie){

        //String templates with variable stars, watched status, and id
        String sql = "UPDATE movies SET stars = ?, watched = ?, WHERE id = ?";
        //"UPDATE movies SET stars = 4, watched = true WHERE name = 'Up'; ";

        //Exception handling for database
        try (Connection connection = DriverManager.getConnection(databasePath);
        PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            //Sets the ? variables as the id, stars, and watched variables
            preparedStatement.setInt(1, movie.getStars());
            preparedStatement.setBoolean(2, movie.isWatched());
            preparedStatement.setInt(3, movie.getId());

            preparedStatement.execute();  //Executes the prepared statement which was the update

        } catch (SQLException e){
            //Gives user an error message if an SQLException happens
            System.out.println("Error updating movie " + movie + " because " + e);
        }
    }

    public void deleteMovie(Movie movie){

        //Exception handling for database
        //Deletes everything with id as the variable
        try (Connection connection = DriverManager.getConnection(databasePath);
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM movies WHERE id = ?")){

            //Sets the deletion protocol for the movie id
            preparedStatement.setInt(1, movie.getId());
            //Executes the prepared statement which will delete the movie with the set id
            preparedStatement.execute();

        } catch (SQLException e){
            //Gives user an error message if an SQLException happens
            System.out.println("Error deleting movie " + movie + " because " + e);
        }
    }

    public List<Movie> search(String searchTerm){

        //String templates that compares a name variable with a search term
        String sql = "SELECT * FROM movies WHERE UPPER(name) LIKE UPPER(?)";

        //Exception handling for database
        //Uses the template after establishing the connection with the database
        try (Connection connection = DriverManager.getConnection(databasePath);
        PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            //Prepared statment is set to a string with search term
            preparedStatement.setString(1, "%" + searchTerm + "%");

            //Stores the results of the executed query of the preparedStatement
            // in the movieResults ResultSet object
            ResultSet movieResults = preparedStatement.executeQuery();

            //Made a new movies arrayList
            List<Movie> movies = new ArrayList<>();

            //Loops through the movieResults ResultSet object
            while (movieResults.next()){
                //Gets variable data from movies database and stores it in variables
                int id = movieResults.getInt("id");
                String name = movieResults.getString("name");
                int stars = movieResults.getInt("stars");
                boolean watched = movieResults.getBoolean("watched");

                //Makes new Movie object and adds the movie to the database
                Movie movie = new Movie(id, name, stars, watched);
                movies.add(movie);
            }

            return movies;

        } catch (SQLException e){
            //Gives user an error message if an SQLException happens
            System.out.println("Error searching for " + searchTerm + " because " + e);
            return null;
        }
    }

}
