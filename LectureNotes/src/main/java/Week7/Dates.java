package Week7;

import java.util.Date;

public class Dates {
    public static void main(String[] args) {

        //A Date object represents a point in time
        //For example, Wednesday October 26 2022, 3:05pm, CST

        Date now = new Date();
        System.out.println(now);

        //Number of miliseconds since Midnight January 1, 1970, UTC
        System.out.println(now.getTime());

        long miliseconds = now.getTime();  //Long, not int
        System.out.println(miliseconds);

        Date dateFromTime = new Date(miliseconds);

        long numberOfMiliseconds = 1234562378765L;  // L at end
        Date date2009 = new Date(numberOfMiliseconds);
        System.out.println(date2009);

        if (date2009.before(now)){
            System.out.println("2009 is earlier than now");
        }
    }
}
