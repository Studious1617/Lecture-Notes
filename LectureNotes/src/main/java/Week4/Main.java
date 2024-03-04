package Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Reminder: Arrays
int[] someNumbers = new int[10]; //10 ints
String[] names = new String[4]; //4 Strings
• Fixed size, data structure
• Stores items of the same type; defined when created
• Can contain Objects or primitive types, but all the things in
one array, must be the same type
• Simple, fast, and efficient – minimal and fixed storage
requirements
• Simple syntax to create array, store items, retrieve items;
loop over an array
• BUT difficult to rearrange items in an array; can't resize the
array; add items in the middle of the array; delete an item
• No built-in capability for searching an array*/

        /*Lists
• A resizable, ordered collection of items
• Items are kept in order
• Can create empty list
• Can add items to the end - list gets bigger
• Can add items to the start or in the middle
• Can get any item from the list by index
• Can remove items from the start, middle or end - list
get smaller
    – Can remove by value, or by index
• Can search for items in the list
• Can find out the size of the list, if it is empty*/

        /*Lists are everywhere
• List of classes in
D2L
• Friend list in
social media
apps
• List of emails*/

        /*Java Lists
• Three kinds of Lists in Java
    – ArrayList
    – LinkedList
    – Vector
• Java thinks about different ways you might use a list
• Some data? Lots of data?
• Do you need to search for data in the list?
• Will you add and remove data from the start, or end,
or middle?*/




        /*Java Lists
• ArrayList, LinkedList, and Vector are all
created, and used, in the same way
• So why 3
different types?*/

        /*ArrayList - contains an array
• An ArrayList uses an an array to store data
    – Arrays are simple and
fast
• When adding or removing items, the array can be
replaced with a larger or smaller array, as needed
• Fast to search
• Fast to add/remove items at the end of the list
• Slow to add/remove items at the start or middle of the
list - gets slower with more items in list*/

        /*ArrayList Internals
dataA dataB dataC dataD dataE null null null null null
dataA dataB dataC dataD dataE dataF null null null null

ArrayList starts with a big, empty array, and it is filled from element 0 up.
ArrayList remembers the number of items you've stored – this is the considered to be size of the ArrayList - and won’t let you add items outside the current size.
So, if you have an array with 5 items you can't add another item in position 8.

Diagram: data item being added to the end of the ArrayList. Simple – just add in the next empty space and move the size pointer up one. Deleting from the end is similar – store null in the last space and move the pointer down.

null = a special value an object can have – it means that it doesn't have a value.
dataA*/

        /*
Adding or deleting items in the middle takes longer.
Diagram: data item dataG being added to position 3 of the ArrayList. Need to copy all
the data items after the insertion point up one, then add the new item in the empty
space. Reverse process to delete – move items after deleted item down 1 place*/

        List<String> trees = new ArrayList<>();

        trees.add("Pine");  //Add data at the end
        trees.add("Oak");   //Add data at the end
        trees.add("Elm");   //Add data at the end
        trees.add("Aspen"); //Add data at the end

        trees.add(2, "Palm");  //Add data at index 2, in the middle

        System.out.println("Tree at index 1 is " + trees.get(1));   //Get by index. Prints "Oak"

        for (String tree: trees){
            System.out.println(tree);
        }

        trees.remove("Oak");    //Remove by value
        trees.remove(0);    //Remove at index 0, the first element

        System.out.println(trees);

        if (trees.contains("Aspen")){
            System.out.println("Tree list contains Aspen");
        }

        int numberOfTrees = trees.size();
        System.out.println("There are " + numberOfTrees + " trees in the list.");




        /*LinkedList - a chain of nodes
• Made of nodes linked together
• Each node stores one list item
• Each node has a link to the node immediately before
and after itself
• A LinkedList knows where the start and end node
are, but can't access the middle nodes directly*/

        /*Getting an item from the middle?
• Suppose we need to test if dataC is in the LinkedList
    – Start at the beginning, follow the links until we get to
dataC; return true. If we get to the end without finding
dataC, then return false
• Can also retrieve the nth node (counting from 0)
    – Start at the beginning, count along the links n times
• Easy to fetch the first or last node*/

        /*Adding an item in the middle?
• Suppose we want to add dataH in position 2
(which happens to be between dataB and
dataC)
• Start at the beginning, follow the links until we
get to node 1 (dataB)
• Break link between dataB and dataC
• Make new links to insert dataH in between
them
• Remember we count from 0*/

        /*LinkedList - a chain of nodes
• Fairly fast to search, slower for larger Lists
    – Follow links along the nodes until the item is
found, or get to end of list
• Fast to add items at the start or end
• Fast to remove items at the start or end
• Fairly fast to add items in the middle*/

        //Everything you can do with an ArrayList, you can also do with a LinkedList and a Vector. They just do certain things at different speeds or check for things the others don't like with Vector checking for multithreading.

        /*Vector
• Vectors are very similar to ArrayList, and use an array
to store data internally
• But Vector is thread-safe aka synchronized
    – Threads in a program are tasks that can run at the same
time. What if two threads tried to add an item to a List?
    – Vector makes sure that two different parts of the program don't modify a Vector at once
    – But this makes it slower than ArrayList
    – Unless you are writing a program with more than one
thread, use ArrayList
    – When we write GUI code, we'll use Vector*/

        /*Comparing ArrayList and LinkedList
                                    ArrayList           LinkedList
Adding to the end                   Very Fast           Fast
Adding in the middle                Slow*               Fairly fast*
Adding at the start                 Very slow*          Fast
Searching for an item               Fast*               Fast*
Removing an item from the end       Very Fast           Fast
Removing an item from the middle    Slow*               Fairly Fast*
Removing an item from the start     Slow*               Fast
Looping                             Fast                Almost as fast
Storage needed in addition to data
stored
                                    Minimal             More than ArrayList
* = operation will get slower as list gets longer*/

        /*Classic Java Interview Questions
ArrayList vs Linked List
• Which one is faster to add data to?
    – Adding to the the end? The start? The middle?
• Which one is faster to fetch data from?
    – From the end? The start? The middle?
• Which one is faster to delete data from?
    – From the end? The start? The middle?
• Which one takes up more storage space?
• Think about large datasets – what if you have
1000 items? 1,000,000 items?
*/




        /*Which one to choose for code?
• ArrayList is faster for most common tasks
    – Adding/removing at the end of list, looping,
searching for item in list
• Unless you will need to add/remove a lot of
data from the start or middle of list - then
LinkedList is faster
    – LinkedList has some extra methods for
adding/removing at start and at end
• Remember, other than creating the list, your
code will be the same for both types of list*/

        /*Creating an List
• What type of List - ArrayList, LinkedList, Vector?
• What type of data does it store? Strings,
integer, doubles... ?
• Give the List a name*/

        List<String> cities = new ArrayList<>();

        /*List<String>    <-- This list will store Strings
        cities      <--List is called cities
        ArrayList   <--It's an ArrayList*/

        /*<> Generic Types
• Almost all the lists you use will contain data of just
one type
    – An ArrayList of names only contains Strings
    – An ArrayList of prices only contains Doubles
• So Java recommends you specify that a List can only
contain one particular type of value
• The compiler will enforce that - only that type will be
permitted = safer code
• And when you remove data from the List, you know
what type it is*/

        /*ArrayList for primitive types
• Use the Object names for the generic type
    – int -> Integer
    – boolean -> Boolean
    – double -> Double*/

        /*Lists of primitive types
• Use the object names (Integer, Double etc.) for
the generic type
• Can add primitive values (int, double etc.) to
the List - Java compiler handles conversion
between object and primitive value*/




        /*LinkedList, ArrayList and Vector are Collection objects
• They also have the type Collection
    – They actually implement an interface called Collection
    – For now –LinkedList, ArrayList and Vector are also Collection objects
• Java provides a class called Collections which has
several utility methods that operate on Collection
objects – sort, max, min, shuffle, reverse, copy, fill...
• https://docs.oracle.com/en/java/javase/14/docs/api/
java.base/java/util/Collections.html*/

        List<String> animals = new ArrayList<>();

        animals.add("Cat");
        animals.add("Zebra");
        animals.add("Fish");
        animals.add("Bird");
        animals.add("Fish");    //Will add "fish" twice


        System.out.println("Original animals list: " + animals);

        Collections.sort(animals);      //Sort into order - only if the type of data in the list is sortable

        System.out.println("Sorted animal list: " + animals);

        Collections.replaceAll(animals, "Fish", "Shark");    //Replace all "Fish" elements with "Shark"
        System.out.println("Replaced \"Fish\" with \"Shark\", now the list is: " + animals);

        Collections.reverse(animals);   //Reverse the order of the list
        System.out.println("In reverse order: " + animals);

        Collections.shuffle(animals);   //Put elements in random order
        System.out.println("Shuffled list: " + animals);


        //Display the minimum value = lowest value = for strings, the first in the alphabet
        System.out.println("First in the alphabet: " + Collections.min(animals));
        //Display the maximum value = the lowest value = for Strings, the last in the alphabet
        System.out.println("Last in the alphabet: " + Collections.max(animals));

        Collections.fill(animals, "Koala");     //Fill the entire ArrayList with "Koala"
        System.out.println("Replaced every element with Koala and now the list is: " + animals);

    }
}
