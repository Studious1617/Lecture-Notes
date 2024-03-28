package Week7;

public class Pool {

    //Variables are called fields here and these are fields
    private String name;
    private double length;
    private String address;
    private double maxDepth;

    //Constructor
    public Pool(String poolName, double poolLength){  //Input descriptions for calls
        this.name = poolName;
        this.length = poolLength;
    }

    //Instance method
    //Instance is another word for an object,
    //An instance of a class
    //A Pool object is an instance of the Pool class
    //This is a method for finding the distance swam given the number of laps
    public double distanceForLaps(int laps){
        //10 laps of pool of length 50, that's 500 meters
        double total = laps * this.length;  //The total is equal to the number of laps times the length of the pool
        return total;  //Returns the total
    }

    //Overrides the normal toString() method
    @Override
    public String toString(){
        String description = name + " pool is " + length + " meters long.";  //A description of pool name and length
        return description;  //Returns description
    }


    //Some getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0 || length > 10000){
            return;  //If the length of the pool is less than 0 (impossible) or greater than a big number
            // that would honestly make it more of a manmade lake than a pool then nothing will return
        }
        this.length = length;  //Changes the length of the pool if valid input is given
    }

    //Some more getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }
}
