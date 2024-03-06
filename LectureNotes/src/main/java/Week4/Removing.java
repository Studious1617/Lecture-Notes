package Week4;

import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {

        //Made new arrayList called classNames
        List<String> classNames = new ArrayList<>();
        //Added some classNames elements
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        //Prints out classNames arrayList
        System.out.println(classNames);

        //Initialized the wasRemoved variable which spits out true if the set variable was removed
        boolean wasRemoved = classNames.remove("Programming Logic");    //Object
        System.out.println(classNames + " " + wasRemoved);

        //Removes by index and then prints out the result
        classNames.remove(0);   //int primitive type - index are primitive
        System.out.println(classNames);

        //Inserted the Systems Analysis at the index of 1 and then printed out the classNames arrayList
        classNames.set(1, "Systems Analysis");
        System.out.println(classNames);

        //Sees if the arrayList has a certain string using a variable
        String search = "Systems Analysis";
        if (classNames.contains(search)){
            System.out.println("The list contains " + search);
        }
        else{
            System.out.println("The list does NOT contain " + search);
        }

        //Shows the size of the classnames arrayList
        System.out.println(classNames.size());

        //Clears the classNames arrayList and then prints out the empty arrayList
        classNames.clear();
        System.out.println(classNames);

        //Displays the size of the classNames arrayList and determines if the arrayList is empty or not
        System.out.println(classNames.size());
        System.out.println(classNames.isEmpty());





    }
}
