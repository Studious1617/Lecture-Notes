package Week9.movies;

public class Movie {

    //Fields
    private int id;
    private String name;
    private int stars;
    private boolean watched;


    //Constuctor 1
    Movie(String name, int stars, boolean watched){
        this.name = name;
        this.stars = stars;
        this.watched = watched;
    }

    //Constructor 2
    Movie(int id, String name, int stars, boolean watched){
        this.id = id;
        this.name = name;
        this.stars = stars;
        this.watched = watched;
    }

    //Override for toString method
    @Override
    public String toString(){
        return "ID: " + id + " | Movie name: " + name + " | Rated: " + stars + " | Have you watched this?: " + watched;
    }

    //Getters and setters for id, name, stars, and watched
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }
}
