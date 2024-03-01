package Week3;

import static input.InputUtils.intInput;

public class Count {
    public static void main(String[] args) {
        //Input for range
        int smallNumber = intInput("Enter a small number: ");
        int largeNumber = intInput("Enter a large number: ");

        //Informs the user about what the range is
        System.out.println("I will count from " + smallNumber + " to " + largeNumber);

        //Calls the count method
        count(smallNumber, largeNumber);
    }

    //Methods that don't return anything - return type is void
    public static void count(int min, int max){
        //Loop that prints out the numbers, starting from the small number and ending at the bigger number
        for (int i = min; i <= max; i++){
            System.out.println(i);
        }
    }
}
