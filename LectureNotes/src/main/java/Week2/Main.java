package Week2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Here are all the dates in January.");
        for (int day = 1; day <= 31; day++){

        }


        /*Arrays
            • Decide how many items you want to store
            • And, what type these items are
            • Use this syntax – note the square brackets
                // Create an array called scores
                // to store 10 int variables*/
                int[] scores = new int[10];

                //Or, you can also create the array this way
                //The previous version is more common
                // int scores[] = new int[10];

        /*Arrays
            //Create an array called scores to store 10
            ints
            int[] scores = new int[10];


            int
            Type of array. This array will hold int variables

            []
            Square brackets – so Java can tell we mean to create an array, not a simple int variable

            scores
            Name of array

            new
            new because arrays are objects, and we are making a new object. We'll see more examples of this syntax soon

            int[10]
            Type of array plus the size of the array in square brackets. Have to declare the size when array is created. This array will be able to hold 10 int variables
            */




        //Creating Arrays - Examples
            //Create an array called data to store 3 ints
                    int[] data = new int[3];
            //Use a variable to specify the size of array
                    int size = 10;
                    int[] moreData = new int[size];
            //Create an array called names to store 100 Strings
                    String[] names = new String[100];
            //Create an array called prices to store 70 doubles
                    double[] prices = new double[70];
        //Putting data into an array
            //Create an array called data to store 3 ints
                int[] data2 = new int[3];
                data2[0] = 10;
                data2[1] = 15;
                data2[2] = 8;




        //Fetching data from an array
            //Create an array called data to store 3 ints
                    int data3[] = new int[3];
                    data3[0] = 10;
                    data3[1] = 15;
                    data3[2] = 8;
            //Print first element
                    System.out.println("first element= " +
                            data3[0]);
            //Store second element in another variable
                    int secondElement = data3[1];
            //Store last element in another variable
                    int lastElement = data3[2];




        /*Put data in your array
            • Array numbering starts at 0
            • The last item is (array size - 1)
            • Example: put some data in the scores array*/
        int[] scores2 = new int[10];
        scores2[0] = 98;
        scores2[7] = 76;
        scores2[4] = 54; //Can edit in any order
        scores2[9] = 98; // The last element
        // scores2[10] = 87; //ERROR
        // scores2[-1] = 92; //ERROR




        //Fetch data from an array
            //• Use the element number and square brackets
        int myScore = scores[7];
        names[6] = "Miriam";
        String theName = names[6];
            /*• Works the same for an array of any type of data
            • Just as long as everything in the array is of the same type*/




        //Can also add data to an array when you create it
        //Put your data in curly brackets, separated by commas
        String[] languages = {"Java", "Python","C#"};
        int[] numbers = { 2, 4, 6, 8, 10, 12 };

    }
}
