package Week7;

import java.util.Date;

public class Dates {
    public static void main(String[] args) {

        //A Date object represents a point in time
        //For example, Wednesday October 26 2022, 3:05pm, CST

        Date now = new Date();  //Makes a new Date object called now
        System.out.println(now);  //Prints the Date object now

        //Number of miliseconds since Midnight January 1, 1970, UTC
        System.out.println(now.getTime());  //Prints out the number of miliseconds since the previously mentioned time

        //Another way to print out the number of miliseconds since Midnight January 1, 1970, UTC
        long miliseconds = now.getTime();  //Long, not int
        System.out.println(miliseconds);

        Date dateFromTime = new Date(miliseconds);  //Makes a new Date object and stores the current date in it

        long numberOfMiliseconds = 1234562378765L;  // L at end
        Date date2009 = new Date(numberOfMiliseconds);  //Stores a date somewhere in 2009 in a Date object named date2009
        System.out.println(date2009);

        if (date2009.before(now)){
            System.out.println("2009 is earlier than now");  //Prints this message if the Date object date2009 is before the current date
        }
    }
}
