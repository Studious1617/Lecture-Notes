package Week3;

public class Main {
    public static void main(String[] args) {

        // Primitive types cannot have null values or be set to nulll while object types can. In this way a strong is an object

        /*Basic Java Methods
        * public static String makeGreeting(String n){
        *   --Method body--
        *   String greeting = "Hello" + n + "!";
        *   return greeting;   <-- Return statement. This  if your method specifies a return type. This returns a variable or value of the same type that you specified in the method header
        *
        * public <-- modifier and allows the test programs to read it
        * static <-- Lets it be read by the main
        * String <-- Return type must be specified. Don't want to return anything? Just use void as the return type.
        * makeGreeting <-- Method nam
        * String n <-- Parameter(s) need a type and a name. Seperate with commas if there is more than one parameter
        * }*/


        /*Designing with Methods
            • Use methods to...
                – Eliminate repetitive code
                – Organize program into sub-tasks
            • A method should have one specific task it
            does, at a certain level of detail
            • You should be able to describe the purpose of
            your method in 1 or 2 sentences
            • A method may call other methods*/


        /*Code with methods
            • Is easier to test
                – Your lab code is in methods, so a test can check the
                method(s) you work on
                – This principle applies to other projects too
            • Is easier to understand
                – Several small methods are easier to understand
            individually; than one giant block of code
            • Is easier to maintain and debug
                – Can focus on one, or just a few, methods - instead of
            the entire program*/


        /*Reducing repetition with methods
            • It's common to do the same task (or a very
            similar task) more than once
            • To save re-writing code over and over, we can
            put this code in a method
            • If it's a task that's the same process, but uses
            different values of variables, then these
            variables can be arguments to the method*/


        /*Creating a Program: Major steps
            • Requirements
                – Gather, Analyze
            • Design
            • Code
            • Integration
            • Testing
            • Delivery
            • Maintenance
            • Retirement

            Doing all these
            steps in order is
            known as the
            Waterfall method*/

        /*Waterfall Problems
            • What do you do if a problem arises in a stage and you realize you
            need to revisit an earlier stage?
                – For example, you are in the implementation stage and you need to revisit
                the requirements?
                – If you encounter problems in integration; parts don't work together?
                – Or your customer decides they need an extra feature?
                – Or technology changes and now you need to do things differently?
                – This happens a lot – expect your requirements to change!
            • In the classic waterfall, you can't do this – the deadline has passed
            and there's no time or resources to go back to the earlier stage
            • Early software development used this model, and it was responsible
            for many major failed pieces of software
            • http://www.codinghorror.com/blog/2006/05/the-long-dismal-history
            -of-software-project-failure.html*/


        /*An Agile development model works well for small projects
            • Read and understand the requirements
            • Identify a high-level design
            • Build a basic, working prototype with minimal feature
            set
            • Review requirements and refine the prototype – add
            features, improve quality, test with respect to the
            requirements
            • Have regular quick, informal meetings – often daily -
            so everyone knows what is going on
            • Repeat until the project is done*/


        /*Advantages of Agile
            • Response to change in requirements is fast
            • Issues encountered in one stages can be addressed in other
            stages (e.g. design problem found in coding can be fixed)
            • New ideas can be added
            • There's always a working program (even if it isn't complete yet)
                – helpful to show to the customer to get their feedback and
            input
            • Components are integrated earlier, and integrations issues can
            be dealt with
                – Continuous integration/continuous deployment - adding new code
            as it's written; even adding it to the live version of the product
            checking everything still works
            • Programmers tend to like Agile*/


        /*Agile Development Methodology
            • Trying to do everything perfectly, in order, is
            almost impossible
            • Building a minimal version and adding features
            until the app is done, is usually more successful
            • In the right environment, for the right project
            with the right team, Agile can work very well
            • An Agile/prototyping methodology also works
            well with class projects*/


        /*Back to Coding: Methods
            • Two different mechanisms of sending data to
            methods
                – Pass by value – how primitive types and Strings
                are sent
                – Passing object references by value – how arrays
                and most everything else is sent
            • What does this mean??*/


        /*Passing primitive types to methods - a copy is made
            • When starsOutOfTen variable is sent to getStarsOutOFTen method,
            a copy is made and put in the stars variable
            • There are now two independent variables
            • If getStarsOutOfTen modifies stars, then starsOutOfTen is not
            changed
            • If getStarsOutOfTen needs to send the modified value back to main,
            it must return it*/


        /*Pass by value
            • Primitive values (int, double, boolean...) and
            Strings, and objects which wrap primitive types, are
            sent to methods using pass by value
            – A copy of the value is made
            – This copy is given to the method
            – The copy may be modified
            – The original value does not change if the copy is
            modified
            • All primitive variables in scope are stored in a part
            of memory called the stack
            */


        /*Passing objects (like arrays) to methods
            • Compare the previous program to this one
            • getThreeFavoriteMovies doesn't return anything*/


        /*References
            • An array is an object
                – There are many other types of objects in Java that we'll meet later, and you'll
            also create your own types
            • Objects are more complex than primitive types
            • How big is an object?
            • Could be any size, and its size could change
            • So it's hard to organize them in memory
            • So to organize objects, they are saved in a part of the memory called the
            heap, which has lots of room
            • And so the code can find an object, a reference to that object is saved
            on the stack
                – The reference tells the stack where to find the object in the heap
            • Object references are values
            • An object reference is a memory address - basically, a number*/


        /*Passing references by value
            • How are objects (like arrays) sent to methods?
            • Making a copy of an object could be very slow
            • Instead, the object's reference is sent
                – The object is not copied
                – The reference to the object is copied, and that is sent to the method
                (remember a reference is basically a number)
                – A reference to an object is the location of the actual object in the heap
                – So when the method accesses or modifies the object, it looks at it's copy
                of the reference, and uses that to find the original object in the heap
                – So if the method modifies the object, the original object is modified
                – There is only one object (although there are two copies of it's reference)
                – This is why, in the previous programs, the array changes when it is
                modified in the method, and the int does not*/


    }
}
