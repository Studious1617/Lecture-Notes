package Week7;

public class Pool {

    private String name;  //Field or a variable
    private double length;  //Another field

    Pool(String poolName, double poolLength){
        this.name = poolName;
        this.length = poolLength;
    }

    //Instance method
    //Instance is another word for an object,
    //An instance of a class
    //A Pool object is an instance of the Pool class
    public double distanceForLaps(int laps){
        //10 laps of pool of length 50, that's 500 meters
        double total = laps * this.length;
        return total;
    }

    @Override
    public String toString(){
        String description = name + " pool is " + length + " meters long.";
        return description;
    }
}
