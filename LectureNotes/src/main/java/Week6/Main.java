package Week6;

public class Main {
    public static void main(String[] args) {


        /*Java has lots of ways of reading and writing files
• There are several Java library classes for file input and
output or I/O
• To enable you to read and write to many different
types of files, and handle different circumstances
    – Do you want to read in the file byte by byte, character by
character, or line by line?
    – Are you reading, writing, appending data?
    – Are you reading/writing sequentially, or do you need
random access – the ability to read from/write to any
point in the file?
    – What type of data are you writing? Text or binary?
*/

        /*Today: Reading and writing text files
sequentially; line-by-line
• Opening a text file, and starting to read at the
beginning
• Creating a file and writing lines to the file
• Opening a file and appending data to the end
of that file
• In all cases, writing text data line-by-line or
reading line-by-line*/

        /*Writing to a file
• Steps for writing to a file
1. EITHER create and open file for writing, OR open
an existing file to add data
2. Write data
3. Close the file
Code follows... ignore Exception-related code for
now*/



        /*FileWriter and BufferedWriter
• The FileWriter object can open, create, close, and
write to a file
• FileWriter can write out Strings or chars to a file
• https://docs.oracle.com/en/java/javase/14/docs/a
pi/java.base/java/io/FileWriter.html
• If the file doesn't exist, then FileWriter will create
it
• If the file does exist, it will be overwritten
• If you don't want to overwrite your data, then use
the append flag (example in a few slides time)*/

        /*FileWriter and BufferedWriter
• File I/O (input/output) is slow - about 1000
times slower than reading/writing to memory
• If your program does a lot of I/O it can slow
down considerably
• BufferedWriter class wraps FileWriter and
handles I/O in the background of your program;
so memory-based operations can continue
while the file is being used*/

        /*Writing Integers
• Integers are interpreted as char values,
Unicode values - number codes for characters
• So if you want to write the integer 65 (for
example) it must be converted to a String, so
the desired characters "65" are written to the
file
https://en.wikipedia.org/wiki/
List_of_Unicode_characters*/

        // To add integers and doubles to a file one must either concatenate a string value to it or cast the integer into a string with a method



        /*Reading a file
• Various ways to read a file
    – By lines, characters, bytes?
    – Sequential or random access?
• Simplest to read line-by-line from the beginning to
the end
• Use a BufferedReader to "wrap" a FileReader
• FileReader handles opening and closing the file, and
can reading a file character-by-character
• BufferedReader provides a readLine method to
collect all the characters from one line, put them
together into a String, and then return the String to
your program
*/

        /*Reading a file
• Questions for reading a file - how many lines does the file have?
How do you know you have reached the end of the file?
• Answer: you don't know how many lines you have. There's no
simple way to count - you must read the whole file to find out
• BufferedReader's readLine() method reads one line and returns
it as a String. And, it prepares to read the next line of the file.
• But, when BufferedReader gets to the end of the file, there are
no more lines to read - so readLine will return null
• So to read an entire file, use a while loop that repeats while
readLine() != null

Remember null = special value that means 'no data'. Same as None in Python*/



        /*Exceptions
• An Exception is Java's way of telling you that
there is an error that stops the program
continuing
• Programs throw exceptions when there is an
error
• Exceptions are objects
• There are lots of different types of Exceptions*/

        /*Exceptions
• When your code throws an exception, it
crashes
• If it's a problem with your code, troubleshoot
and fix the error
    – Not initializing a variable = NullPointerException
    – Reading a non-existent index =
ArrayIndexOutOfBounds, IndexOutOfBounds
    – Modifying an ArrayList inside an enhanced for
loop = ConcurrentModificationException*/

        /*Exceptions
• When your code throws an exception, it crashes
• What if it's a problem outside of your code? Like a file not
found?
• You catch that exception, and do something to deal with the
error condition
• Use try and catch blocks
• try block contains code that might throw an exception
• catch block contains code that can attempt to deal with the
exception and allow the program to continue running
    – or quit the program safely
    – and/or log the error message for debugging
    – and/or notify the user that something has gone wrong*/



        /*Types of errors
• Two broad types of errors:
    – Those that are outside of our control (e.g. file IO, network
operations, things that depend on user input or data from
another source)
    – Those that are from coding errors (typically when programmer
has made a mistake, like reading from non-existent array
element)
• For errors outside of our control: be prepared to handle
errors with try-catch (then attempt to recover, or shut
down gracefully) instead of letting your program crash
• For coding errors... attempt to avoid through good
programming practices and thorough testing; consideration
of as many possible circumstances as possible*/

        /*Exceptions and Files
• Reading/writing files is one area where lots of things outside of your
control can go wrong
    – What if the file doesn't exist?
    – You try and write to a read-only directory?
    – Another program is using the file?
    – Somebody or some other program changes/moves/deletes the file
    – Permission denied
    – Disk full
    – Plus lots of other ways to go wrong
• So it's important to anticipate possible errors and think about how you'll
handle them
    – For example, what will your program do if it tries to open a certain file, but fails?
Should it crash? Should it quit? Will it ask the user for another location to look
for the file in? Or do something else?
*/

        /*Checked vs. Unchecked Exceptions
• Outside of our control errors - often throw a checked exception : Java
makes you deal with checked exceptions. These are typically thrown in
situations where your code interacts with something that has no control
over
    – IOException - your program can't stop a file being deleted/moved
    – SQLException - your program can't stop the database server going down
    – Various data parsing exceptions (dates, XML, JSON...)
    – Others
• Coding errors: often from coding errors - these are unchecked
exceptions. Java does not force you deal with unchecked exceptions. You
should attempt to write code that doesn't throw these exceptions
    – NullPointerException
    – ArrayIndexOutOfBoundsException
    – ConcurrentModificationException
    – Various others*/

        /*Handling Exceptions
• The compiler forces you to deal with checked
exceptions, either by
    – A. Telling the compiler that you won't deal with the
exception in this method
• For example, the exception is caused by bad data sent to
the method; that's the caller's problem, so return the
problem to them
    – B. Catching the exception and doing something
about it
• If it's possible to recover; or if the exception should be
logged or recorded somehow*/

        /*Handling Exceptions, option A
A. Telling the compiler that you won't deal with the
exception: indicate that in the method definition of
the method that the exception will be thrown in

Any method that calls this method will then be obliged
to deal with the checked exception - it can decide to
catch it, or throw it

If main() throws an exception, the program crashes*/

        /*Handling Exceptions, option B
• Dealing with the exception
• Place code which may cause an error in a try
block.
• And then if an error occurs, you can trap it in a
catch block, and deal with it, before it crashes
the program. You need to specify what type of
error the catch block will catch
• Can also add an optional finally block - code that
runs whether an exception is thrown or not*/



        /*Prevention is (usually) better than cure
• It's usually better to prevent exceptions
• Exception handling is slow - typically slower
than checking for the issue
When these method are called with a null string, the code on the left, with the
try-catch, is about 40 times slower than code on the right.
But, when called with a non-null string, the code on the left is 30% faster than the
code on the right because no str==null check is made.

TimingExceptions.java in the example repo*/

        /*Prevention vs Cure
• Generally, it's advised to write code that checks for
possible error conditions to avoid causing exceptions
• However, consider a scenario where the check is relatively
slow, and exceptions are relatively unlikely - what's the
best approach now?
• Clarity of code is also important
• Also remember there are cases where you don't have
control over everything, e.g. reading from a file and what
if the file has been moved? You need exception handling
in these cases*/



        /*IOException is being thrown, but program does not crash

Question: What would happen if the try block throws a
different type of error, like a NullPointerException?

Answer: the catch block won't catch it - program will crash
You can add more than one catch block after a try block to
deal with more than one type of Exception


Question: What if the file is opened successfully, but an error
is encountered as the file is being read? Code will never get to
the line where the bufReader is closed, so the resource will
never be closed.

Answer: a finally block*/

        /*Try with resources
• Try with resources put the code to open the resource
(for example, a file reader) in a header for the try
block
• If an exception is thrown within the try block, that
resource is automatically closed AND the catch block
runs
• If no exception is thrown, the file is automatically
closed at the end of the try block
• Result = much neater code*/



        /*Try-with resources
• Use try-with-resources for file input/output
• You can also use it with database code (later)
    – Closes database connections whether there is an
error, or not
• Some other types of exceptions can use this style
• If you need to catch other exceptions: use
regular try-catch blocks*/



        /*Lab in GitHub
• The tests create files as part of checking your work
• They are all written to a directory called
temporary_directory_for_test_files
• You can usually ignore the files created
• But sometimes
checking the data
written to the files
may be helpful for
troubleshooting
• Don't delete this
directory*/

    }
}
