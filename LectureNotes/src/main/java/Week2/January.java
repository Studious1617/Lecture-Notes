package Week2;

public class January {
    public static void main(String[] args) {

        for(int day = 1; day <= 31; day++){
            if (day == 1 || day == 21 || day == 31){
                System.out.println("January " + day + "st");
            }
            else if (day == 2 || day == 22 || day == 32){
                System.out.println("January " + day + "nd");
            }
            else if (day == 3 || day == 23 || day == 33){
                System.out.println("January " + day + "rd");
            }
            else if (day == 2 || day == 22 || day == 32){
                System.out.println("January " + day + "st");
            }
            else{
                System.out.println("January " + day + "th");
            }

            /*Can start counting wherever, stop counting wherever, increment whatever*/
                //Count by 2
                for (int x = 0 ; x < 10 ; x = x + 2) {
                System.out.println(x);
                }

                //Count by 5
                for (int x = 10 ; x < 100 ; x = x + 5) {
                System.out.println(x);
                }

                //Count down from 5 to 0
                for (int x = 5 ; x >= 0 ; x = x - 1) {
                System.out.println(x);
                }

                //x-- is short for x=x-1 This loop is equivalent to the one above it
                for (int x = 5 ; x >= 0 ; x-- ) {
                System.out.println(x);
                }



        }


    }
}
