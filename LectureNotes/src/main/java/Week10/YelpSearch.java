package Week10;

import kong.unirest.Unirest;

import java.util.Map;

import static input.InputUtils.stringInput;

public class YelpSearch {
    public static void main(String[] args) {
        //Tells the program the site the information is located in
        String yelpURL = "https://api.yelp.com/v3/businesses/search?sort_by=best_match&limit=20";
        //Gets the api key from the enviroment variable stored in the computer
        final String YELP_API_KEY = System.getenv("YELP_API_KEY");

        //Asks the user what type of restaurant they want
        String typeOfRestaurant = stringInput("What type of restaurant would you like to search for?");
        //Makes a map of query terms to search for in the api call
        Map<String, Object> yelpQuery = Map.of(
                "term", typeOfRestaurant, //Type of restaurant
                "location", "Minneapolis,MN",
                "categories", "restaurants",
                "price", "1");  //Lowest price

        //The process for getting a response from the api
        YelpResponse response = Unirest
                .get(yelpURL)  //Goes to the website
                .header("Authorization", "Bearer " + YELP_API_KEY)  //Gets authorization
                .header("accept", "application/json")
                .queryString(yelpQuery)  //Gives the query / asks the query
                .asObject(YelpResponse.class).getBody();  //Transforms the response into a java
                // object of the YelpResponse class

        //Prints out a response
        System.out.println(response);
        //Prints out more details about the restuarants that fit the bill on what we were
        // looking for in typeOfRestaurant
        for (Business b: response.businesses){
            System.out.println(b.name);  //Prints out restaurant name
            System.out.println("Rating: " + b.rating);  //Prints out rating
            System.out.println(b.location.address + ", " + b.location.city);  //Prints out restaurant address and city
        }
    }
}
