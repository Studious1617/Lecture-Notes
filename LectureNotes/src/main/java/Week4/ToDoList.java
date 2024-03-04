package Week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class ToDoList {
    public static void main(String[] args) {

        List<String> toDoList = new ArrayList<>();

        while (true){
            String data = stringInput("Type a task you need to do, or Enter to quit");
            if (data.isEmpty()){
                break;
            }
            if (containsIgnoresCase(toDoList, data)){
                System.out.println("You already added that!\n");
            }
            else{
                toDoList.add(data);
            }
        }

        System.out.println("Thank you, your tasks are: ");

        for (String input: toDoList){
            System.out.println(input);
        }

        System.out.println("You have " + toDoList.size() + " task(s) to do");
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
