package Week2;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        //Example int array
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 100;
        //numbers[5] = 3;

        String[] classNames = {"Java", "C#", "Web", "Android", "iOS"};
        //classNames[0] = "Java";
        //classNames[1] = "C#";
        //classNames[2] = "Web";

        System.out.println("One of the second year classes is " + classNames[2]);


        //Create a string array initialzied with data
        String[] classrooms = {"T3010", "T3020", "T3030", "T3040", "T3050", "T3080"};

        //How many elements are in the arrays? What's the size - or length - of the array?
        int numberOfClassrooms = classrooms.length;

        System.out.println("There are " + numberOfClassrooms + " classrooms.");


        //Use a loop to print all the data from the array
        //Notice how the loop counter is used
        for (int x = 0; x < classNames.length; x++) {
            System.out.println("A class name is " + classNames[x]);


        }

        System.out.println(Arrays.toString(classNames));


    }
}
