package Week2;

public class OilChange {
    public static void main(String[] args) {

        int mileage = 15000;
        int interval = 3000;

        for (int miles = mileage; miles < (mileage + 8 * interval); miles += interval){
            System.out.println("Get oil change at " + mileage + " miles.");
        }


    }
}
