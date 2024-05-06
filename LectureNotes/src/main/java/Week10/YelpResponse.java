package Week10;

//Yelp API response classes to JSON to Java objects.
public class YelpResponse {
    //Fields for businesses
    //what type
    //it will be an array
    public Business[] businesses;
}

class Business {
    //represents the name, rating, and location
    // of one business object
    public String name;
    public double rating;
    public Location location;
}

class Location {
    //Represents the city name and address of one location object
    public String city;
    public String address;
}
