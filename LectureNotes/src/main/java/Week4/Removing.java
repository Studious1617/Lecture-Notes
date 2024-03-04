package Week4;

import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        System.out.println(classNames);

        boolean wasRemoved = classNames.remove("Programming Logic");    //Object
        System.out.println(classNames + " " + wasRemoved);

        classNames.remove(0);   //int primitive type - index are primitive
        System.out.println(classNames);

        classNames.set(1, "Systems Analysis");
        System.out.println(classNames);

        String search = "Systems Analysis";
        if (classNames.contains(search)){
            System.out.println("The list contains " + search);
        }
        else{
            System.out.println("The list does NOT contain " + search);
        }

        System.out.println(classNames.size());

        classNames.clear();

        System.out.println(classNames);

        System.out.println(classNames.size());
        System.out.println(classNames.isEmpty());





    }
}
