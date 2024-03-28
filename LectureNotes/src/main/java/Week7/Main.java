package Week7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*A Java Object
• Is made from a class definition
• It contains data (in variables aka fields)
• AND/OR
• It can do things (with methods)*/

        /*A Java Object
• For example:
• A Java ArrayList object contains data – the list
elements
• A Java ArrayList can also do things – add a new
element, delete an element, tell us it's size...*/
List<String> animals = new ArrayList<String>();
animals.add("cat");
animals.add("fish");
animals.remove(0);
int numberOfAnimals = animals.size();

/*Objects are made from a class definition
• Java already has a class definition for the ArrayList
class
• And many other classes too, such as the ones you've
used to create Hashmap and FileReader objects
• One class definition can be used to make one object,
or many objects
• Think of a class definition as a blueprint, a set of
instructions
• The objects are built from these
blueprints/instructions*/

        /*You can create your own class definitions
• Write one class definition
    – Describe what an object can do – write methods
in the class
    – Describe what data the object stores – declare
variables (also known as field) in the class
• Use that class definition to create and use
objects in your program*/

        /*Principles of Object Orientated Programming
* Object modeling
* Encapsulation - keeping data together
* Abstraction - putting details in one place and then not having to worry about the detail to use the code
* Focusing each class on one task - single responsibility principle*/



        /*Pool objects
* Keep the name and length together
* Can add other attributes if needed
*   -Depth
*   -Opening hours
*   -Open air/inside
*   -etc...*/



        /*Another example: ITEC Course manager
• ITEC course management program
• For each course:
    – Store the name of the course
    – The code for the course (e.g. 1310, 1150)
    – The maximum number of students allowed
    – The names of all the students enrolled
    – Be able to enroll or un-enroll a student for a class
    – Program should be able to display all the info for a certain course*/

        /*Constructors
• If you will be doing the same setup for many
objects of the same type, you can write a
constructor method to do that for you
• A default constructor is always automatically
called when an object is created, whether you
wrote a constructor method or not
ITECCourse maintenance = new ITECCourse();
*/

        /*Rules for Constructors
• They have the same name as the class they
construct objects for
• And they don't have any return type
• The job of a constructor is to set up and initialize an
object
• Optional to have a constructor – Java will still be
able to make objects – but you can add one (or
more, with different arguments) if it makes your
objects easier to create and set up
*/



        /*The Object Oriented Version
• Let's model an object
• Create ITECCourse objects
• A Course object will contain data about one ITEC course
• We can encapsulate ITECCourse properties into one object
• Create ITECCourse objects from a ITECCourse class
    – Remember a class is instructions for making an object
    – One class can make as many objects as you need
• We can change the data ITECCourse objects stored by modifying the class
definition
• What if we want to add the classroom the course will be taught in? We
can just modify the ITECCourse class definition
• Much simpler and safer than adding another variable to our code for all
our courses; easier to remember the variable name*/
String maintenanceCourseClassroom = "T3020";
String datacomCourseClassroom = "T3050"; // yuck

        /*The Object Oriented Version
• Objects store data but can also do things
• Put them to work for you!
• What if we want to add code to check if the
number of students enrolled doesn't exceed
the max?
• We can do that in the ITECCourse class*/

        /*Defining a class
• Use the keyword class plus the name of the class
• Convention is to start class name with an uppercase letter
• Usually write each class definition in its own file
• The file name must match the class name
• So ITECCourse needs to be in a file called ITECCourse.java
public class ITECCourse{
// code here
}
*/



        /*Object Oriented Benefits
• Benefits of OO: simplifies working with data
    – Think of about the difference between the OO and
non-OO version
    – The non-OO version is more complex and harder
to modify*/

        /*OO Benefits
• Programs should always be designed with change in
mind
• Because you'll have to add new features, or the
requirements will change, or you'll find a bug, or you'll
want to use some of the code in another program...
• If you use OO well, it makes it easier to write a modular
program that is easier to re-use
• Objects help break code into independent modules (or
as independent as possible)
• Makes it easier to change parts of the program without
breaking other parts*/



        /*Encapsulation
• A well-designed object hides how it works
internally
• It only shares the data that is necessary
• It should have a well-designed set of methods
which other code can use to work with this
object*/

        /*Encapsulation
Why?
    1. This facilitates reuse – if there is a well-defined,
documented interface, it is easier to use that object
    2. You know what the publicly accessible parts of the
objects are, so you know what it's OK to change and
what will affect other parts of your code
    3. Helps prevent accidentally modifying an object's data.
Doesn't stop you doing it, just makes it a little harder*/

        /*Public, Protected, Private
• Often make all instance variables (aka fields)
private
• Make methods that will be used by other
classes in the same package protected
• Make methods that any other class can use
public
• final (constant) variables can be made public,
protected or private, as appropriate
• Make all other methods private*/

        /*Access Modifiers: Public, Protected, Private
• Public: any other class can access this method or
variable
• Protected: other classes in the same package can
access this method or variable (also subclasses, later
class)
• Private: only this object can access this private variable.
No other objects can access this method or variable
• If you don't specify an access modifier, package-
protected is assumed (like protected; available in same
package, but subclasses in a different package can't
access it)*/

        /*Access Modifiers: Public, Protected, Private
• Use the most restrictive access modifier you
can
• Protected: useful because often public enables
too much access, but private is too restrictive
• Package: a directory containing Java code
• Another good reason to use packages – helps
contain data/functionality to classes which
need to use it = another way of implementing
encapsulation*/



        /*Collections.sort
• Can only sort things that describe how they are
sorted
• In other words, what makes a thing of that
type, greater than another thing of that type
• So for Strings, it's before/after in the alphabet
• For Tire objects, how to compare? Java doesn't
know what makes a Tire before or after another
Tire in a sorted list
• We need to help Java*/




    }

    public class examplePool {

        private String name;  //Field also known as a variable
        private double length;  //Another field

        //Constructor
        examplePool(String poolName, double poolLength){
            this.name = poolName;
            this.length = poolLength;
        }

        //Instance method
        //Instance is another word for an object,
        //An instance of a class
        //A Pool object is an instance of the Pool class
        public double distanceForLaps(int laps){
            //10 laps of pool of length 50, that's 500 meters
            double total = laps * this.length;
            return total;
        }


        //Another instance method
        @Override
        public String toString(){
            String description = name + " pool is " + length + " meters long.";
            return description;
        }
    }
}
