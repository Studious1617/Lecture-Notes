package Week10;

//Yelp API response classes to JSON to Java objects.
public class YelpResponse {
    //Fields for businesses
    //what type
    //it will be an array
    public Business[] businesses;
}

class Business {
    //represents one business object
    public String name;
    public double rating;
    public Location location;
}

class Location {
    public String city;
    public String address;
}
