package Week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class ToDoList {
    public static void main(String[] args) {

        //Made a new arrayList called toDoList
        List<String> toDoList = new ArrayList<>();

        //Loop to add values to the toDoList arrayList
        while (true){
            String data = stringInput("Type a task you need to do, or Enter to quit");      //User input
            //Breaks if the arrayList is empty
            if (data.isEmpty()){
                break;
            }
            //Doesn't allow user to add the same thing to the list, ignoring case
            if (containsIgnoresCase(toDoList, data)){
                System.out.println("You already added that!\n");
            }
            else{
                toDoList.add(data);     //Adds the data if the user hasn't already added it
            }
        }

        //Displays the valid items the user added to the toDoList arrayList
        System.out.println("Thank you, your tasks are: ");

        for (String input: toDoList){
            System.out.println(input);
        }

        System.out.println("You have " + toDoList.size() + " task(s) to do");   //Informs the user of how many tasks they have to do using the size of the toDoList arrayList
    }

    //Made a new method to know if an array contains a certain string while ignoring case
    //NOTE: Can use List<String> for ArrayList<String> in methods
    public static boolean containsIgnoresCase(List<String> list, String data){
        for (String item: list){
            if (item.equalsIgnoreCase(data)){
                return true;
            }
        }
        return false;
    }
}
