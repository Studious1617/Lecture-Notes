package Week3;

public class Marathon {
    public static void main(String[] args) {

        double currentDistance = 1;
        double targetDistance = 26.2;
        double percentIncrease = 1.20;  //Used to increase by 10%

        marathonSchedule(currentDistance, targetDistance, percentIncrease);
    }

    public static void marathonSchedule(double currentDistance, double targetDistance, double percentIncrease){
        int week = 1;
        //Loop until the current distance is greater than the target distance
        //The loop will count the number of weeks
        while (currentDistance < targetDistance){
            System.out.println(week + " " + currentDistance);
            currentDistance = currentDistance * percentIncrease;  //Increase by 10%
            week++;  //Count the number of weeks
        }

        //Need to print one more line - the distance that is greater than the marathon distance
    }
}
