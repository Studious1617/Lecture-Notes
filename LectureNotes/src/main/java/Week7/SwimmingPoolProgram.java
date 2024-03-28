package Week7;

public class SwimmingPoolProgram {
    public static void main(String[] args) {
        //Makes a new Pool object called ymca and names it YMCA and sets its length to 50
        Pool ymca = new Pool("YMCA", 50);

        //ymca.name = "ymca";  //Not allowed
        ymca.setName("Minneapolis YMCA");  //Changes ymca Pool name

        double totalSwam = ymca.distanceForLaps(6);  //Stores the result of 6 laps swum at the ymca Pool

        System.out.println(ymca);  //Prints out ymca description. It will print out what was set in the Override toString method

        System.out.println("The total distance is " + totalSwam + " meters.");  //Tells the user how many meters were swum

        //Makes a new Pool object called como and names it Como Park and sets its length to 25
        Pool como = new Pool("Como Park", 25);
        System.out.println(como.distanceForLaps(10));  //Prints out the result of 10 laps swum at the como Pool

        System.out.println(como);  //Prints out the description for the como Pool

        //Makes a new Pool object called edina and names it Edina and sets its length to 50
        Pool edina = new Pool("Edina", 50);
        //Stores the result of 12 laps swum at the edina Pool
        double distance = edina.distanceForLaps(12);
        System.out.println(distance); //Prints out the result of 12 laps swum at the edina Pool
        System.out.println(edina);  //Prints out the description for the edina Pool





    }
}
