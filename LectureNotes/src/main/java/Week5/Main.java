package Week5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /*HashMap - a Map Type
• Like Python's dictionary, C#'s Hashtable, or JavaScript's object
• Stores key-value pairs. A key is mapped to its value
• Keys are unique in a HashMap
• Can add a key-value pair
• Can look up a value for a key (and it's fast)
• Can replace the value for a key
• Can delete a key-value pair
• Can loop over all the keys (or over the values, or both)*/

        /*HashMap Syntax
• Create a Map
• Specify the types of the keys and values in <> angle brackets
• new HashMap<>()
• Like Lists, there are other types of Maps, including HashTable (synchronized) and TreeMap
(keeps keys in sorted order)
https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/Map.html*/

Map<String, Integer> quantitiesOfProducts = new HashMap<>();

// <String  <--Type of keys
// Integer>  <--Type of values
// quantitiesOfProducts  <--name of HashMap

        //If you have a problem where it is important that your keys are in order you can use a class called TreeMap<K,V>




        /*You should know the properties of
each of these data structures
• Array
• Lists (ArrayList, LinkedList, Vector)
• HashMap
• You'll store a lot of data in your programs – useful to know what data
structures are available and what kinds of data they are suitable for,
their advantages and disadvantages*/

        /*What if your data doesn't really
work in any of these?
• Research other data types
    • SortedMap (HashMap with sorted keys), Sets, Trees...
• Extend an existing data type and customize it
• Combine data types
    • you can store arrays as values in a HashMap, for example
    • Or create an List of HashMaps
    • Or a HashMap of HashMaps
    • Or a HashMap of arrays
    • ...
• Create your own data type*/

        //Soon we're going to create our own data types or our own custom way of storing data. We'll be making classes which will allow us to store data in custom ways.

        
    }
}
