package Week4;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // Made a new arrayList object called arrayList
        List<String> arrayList = new ArrayList<>();

        //Added 4 strings to the arrayList object
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Clara");
        arrayList.add("MCTC");

        //Enhanced for loop that cycles through the arrayList and for each given item in the arrayList will display the string, make the string uppercase, and then also display the length of the string
        for (String s: arrayList){
            System.out.println(s);
            System.out.println(s.toUpperCase());
            System.out.println(s.length());
        }

        //Prints out the whole arrayList
        System.out.println(arrayList);
    }
}
