package Week9;

public class Main {
    public static void main(String[] args) {


        //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   <-- new github token

        /*Databases 101
• A database is a separate application to your program
• A database server application organizes, stores and
provides access to the data
• Your Java program connects to the database to
access the data*/

        /*Databases 101
• Databases live in a database server
• A database server is an application
• One database server can manage one or more
databases*/

        /*How does Java talk to a database?
• For our labs, the database server application can be on the same
computer as your Java application
• In the real world, the DB server will be running on a different computer,
somewhere else on the network, or somewhere else on the internet
• Your Java application would connect to the database server application
using a network connection*/

        /*Databases 101
• Each databases can contain 1 or more tables
• Tables contain the data
• Tables are organized into columns and rows*/

        /*Databases 101: Tables
• Each table is organized into columns
• Each column has a name (all one word) and data type
• Types are usually strongly enforced - e.g. error if storing String in int column
• One row will contain each of these piece of data about one thing
– So, one row could represent a customer, or a student, or an inventory
item, or a bank transaction, or a pay stub, or an order...
Student_ID int | Student_Name text | Student_email text | Student_GPA float
1001 | Alex A | alex.a@go.minneapolis.edu | 3.4
1002 | Bev B | bev.b@go.minneapolis.edu | 3.6
1003 | Carl C | carl.c@go.minneapolis.edu | 3.2
*/

        /*Databases 101: Schema
• The tables, column names, data types, constraints,
are collectively known as the database's schema
• Database design is figuring out the schema for
your DB
• Important to decide this early in the
database/application/project design: changing the
schema can necessitate re-writing a lot of code
• A well-designed schema can make code much
more efficient*/



        /*Databases 101: Operations
• Databases support many operations on data
• Databases allow for new data to be added, data
deleted, modified
• Query database for specific data

Operation | Example
Create: add new rows of data | Add a new order
                               Add a new student
Read: query DB to fetch data | Get all today's orders
                               Get all the ITEC students
Update: modify existing data | Mark an order as shipped
                               Update a student's GPA
Delete: remove rows          | Delete completed order
                               Delete graduated student*/

        /*Databases 101 - Primary Key
• A primary key column that contains a value that's unique and
different for each row
• Used to uniquely identify a row of data
• Databases can generate primary key columns
    – Common to use an auto-incrementing integer value
• Or you can insert a value you know will always be unique
• Primary keys are useful in 99% of database tables

Student_ID int | Student_Name text | Student_email text | Student_GPA float
1001 | Alex A | alex.a@go.minneapolis.edu | 3.4
1002 | Bev B | bev.b@go.minneapolis.edu | 3.6
1003 | Carl C | carl.c@go.minneapolis.edu | 3.2
*/

        /*Databases 101 - Constraints
• Restrictions on what data can be stored
• Database will enforce - refuse to add/modify data that
violates a constraint
• Example constraints
    – Every email address is unique
    – A GPA is between 0 and 4
    – An age is not negative
    – A review title has a maximum length
    – A user's role is one of "Student", "Staff" or "Faculty"
    – The title and author of a book, together, must be unique
• Specify constraints when you create a table*/

        /*Talking to a database: client-server
• Client-server: Configure application to connect to a separate database server
• The database is managed by a database server application
• Your applications connects to the database server as a client
    – More complex to set up, but more powerful and more flexible
    – Many users can connect; users may have different roles and permissions to control access to your
    data (so must consider authentication and access by users and applications)
    – Database server can be running on your computer, another computer on your network, another
    computer around the world...
    – Provides suite of management features for accounting, reports etc.
    – Other users/applications can talk to the database: very useful! For example, a web application can
    store orders in a database, and a shipping application can read that database to dispatch orders;
    an accounting application can get the value of all the orders; a re-stocking application can use it
    to figure out what products to order more of...
    – Examples: SQLServer, MySQL, PostgreSQL, Oracle, DB2...
• Client-server databases are very common in industry
• This is the type of setup you'll probably be working with as a developer*/

        /*Talking to a database: embedded
• OR you can embed the database and database server in your
application
    – Simple setup, good for small databases, self contained
    – Harder for other applications to use to this database
• This might be a good thing or a bad thing
    – Embedded databases can typically run most CRUD operations but may
    lack the full set of features in a client/server architecture, e.g.
    authentication, reporting, auditing, encryption
    – The entire database is stored in one file
    – Examples: SQLite (very common in mobile apps, scripts, small programs, Python scripts...), Derby, H2...*/

        /*We'll use SQLite for this class
• The entire database itself will be a file stored in your file
system
• A Java library will provide the connection to the database*/

        /*SQLite - an Embedded Database
• Smaller feature set than MySQL, SQLServer etc.
• Only one connection can edit the database
    – More than one connection can read data
• Only four data types:
    – integer, real (for floating point/double), text, blob
• Easier to set up, good if you don't need the features of a client-
server DB
• Very widely used: every mobile device uses SQLite for app database
storage
• Your web browser uses it for bookmarks, history
• Boeing uses it on their airplanes
• Commonly used for prototyping and testing in early stages of app
development, before being switched out for a real client-server DB
• And many, many other applications*/

        /*DB Connections
• To connect to a database, need to know where it is, and how to talk to it,
and appropriate authentication credentials
• Provide a connection string in the form of a URI (like a URL) which must
contain protocol (what type of DB) and location of the DB
• A SQLite connection string to a SQLite database called movies.db looks
like this
sqlite:movies.db
• For other databases, it also may contain information like the location of
the database server, the name of the database, port number, and any
authentication information needed, e.g. username and password*/



        /*How to talk to a database
SQL: Structured Query Language
• Pronounced "sequel" for Microsoft products e.g.
SQLServer
• Pronounced "s-q-l" for most other DBs
• Very common query language, used by many major
databases
• Used to query database, and send the database commands
to carry out
• Some variations between DBs, but SQL basics are the same
or very similar between databases
• So, learning SQL enables you to communicate with most
databases*/

        /*SQL
• Databases often speak SQL
• You need to construct SQL statements to ask the database to do
tasks
• A SQL statement can
    – create a table
    – add data to a table
    – fetch data from a table
    – delete data from a table
    – modify data
    – delete a table
    – And many other operations...
• We need to wrap the SQL statements into Java method calls so your
program can send them to the database*/

        /*ResultSet
• How much data will be returned from the
query?
• Between 0 and millions (maybe billions?) of
rows
• Loading all the data into memory could be bad
or may be impossible
• So, must access the data using a ResultSet,
one row at a time*/

        /*SQL statements – creating a table
String createTableSQL = "CREATE TABLE cats (name TEXT, age
INTEGER)";
statement.executeUpdate(createTableSQL);

CREATE TABLE cats (name TEXT, age INTEGER)

This is a SQL statement instructing the database to create a table
 called cats with two columns, one called name that stores text.
 The second column is called age and stores integer data.

Remember the order that the columns are in.

Other SQL statements can add data, fetch data, modify data, delete data, delete tables.*/

        /*The cats table
• Imagine the cats table looks like this, with two
columns
• When we add data, one row will contain info
on each data item
• A database can have lots of tables, each with a
unique name*/

        /*SQL statements – adding data to a table
String addDataSQL = "INSERT INTO cats VALUES ('Maru',
10)";
statement.executeUpdate(addDataSQL);
INSERT INTO cats VALUES ('Maru', 10)

This is a SQL statement instructing the database to add a row of data to the cats table.
The data goes in the parentheses, in the same order as the columns were defined in the table.

Strings are enclosed in single quotes.

Table names, column names, and SQL keywords (create table, insert into, values...) are not case sensitive.
String/text data is case sensitive.*/

        /*SQL queries: reading data
• SELECT statements used to read data
• SELECT * FROM cats gets all the columns and rows
– We'll use row and column filters soon
• Use statement.executeQuery(sql) method
• Data is returned in a ResultSet*/

        /*ResultSet
• Loop over the ResultSet using the next()
method in a while loop
• The next() method returns true if there is
another row to read, false otherwise*/

        /*ResultSet
• Read data from one DB row at a time
• getString(colName) method for TEXT
columns,
• getInt(colName) for INTEGER columns,
• getDouble(colName) for REAL columns*/



        /*SQLite Data Types
• No built-in boolean or date types
• Can use boolean as a column type and insert true
and false but the data will be converted to 1 (true)
and 0 (false) in the database
• Java will handle most conversions when storing or
reading boolean data*/

        /*SQLite data types
• No built-in date types
• One solution is to store timestamps in an integer
column
• Reminder - Date objects, getTime() method*/

        /*SQL Select Queries
• Describes an intersection of rows and columns
and returns that data

SELECT which columns?
FROM which table?
WHERE which rows do you want?
*/



        /*Relational Databases
• And many other operations and functions:
    – Create, delete, databases and tables
    – Foreign key relationships
    – More complex queries, e.g. using several tables
    – Run database functions to analyze data, often using more than one
    table
• Examples: what's the average GPA of all the students?
• What is the total value of all of yesterday's orders?
• What are the most common products ordered?
    – Stored procedures - saved queries to run as needed, or periodically
    – Various other tasks, auditing, reporting, managing DB users,
    assigning permissions etc.
• More in your DB class(es)
• Each database has a different set of features*/

        /*Many More SQL Commands
• There's a lot more that databases can do
• You'll study this more in your database classes
• For this class you need to know the basics we just
covered
• But if you know SQL, or you need more complex
database setup/operations in a program, you can
do that in Java!
• Remember SQL dialects vary so make sure you are
looking at SQLite specifically when looking things
up*/

        /*Want more practice? SQL Tutorial
• Never used SQL or need a reminder?
• W3Schools tutorial – read, try examples, also good as a reference
• Covering SQL HOME through SQL Delete will cover everything you
need for this class
• http://www.w3schools.com/sql/ */



        /*Errors
• What happens if the connection string is not in the
expected format?
• What if there's a syntax error in any SQL statement?
• What if the table already exists when you try to
create it?
• What if you try and read data from a non-existent
column?
• What if you try and work with the database after
the connection has been closed?*/

        /*Error Handling
• It's really important in DB applications
• Many ways to go wrong (can't connect to database, wrong
driver, someone else has modified database, don't get the
result set you think you will, the column names are not what
you typed....)
• Plus if someone types in something that will break your SQL
statement, you want to catch the error, not let your DB crash
• All database code should be in try-catch statements and you
should be prepared to catch and handle SQLExceptions, other
Exceptions, and unforeseen problems
• Use try-with-resources to automatically close the database
connection*/

        /*Adding data to a table
• You can construct a SQL statement String in your code
• For example, in your code, you'd like to write this SQL
INSERT INTO movies VALUES ('Dr. Strange', 3, true);
• But the name and stars and watched will be in variables
in your program
• You need to build the SQL query and include your data

String name = "Dr. Strange";
int stars = 3;
boolean watched = true;
addDataSQL = "INSERT INTO Movies VALUES ('" + name + "', " + stars + ", " + watched + ")";
statement.executeUpdate(addDataSQL);
*/

        /*But don't do that
• Don't make SQL Strings that include Strings from variables
• It's no fun, it's hard to form the correct String
• It can permit corrupted or unexpected data in your database
• It can cause errors - what if the user types some special
database characters in their input - can form invalid SQL
• It's a security problem - a user can type more SQL that when
combined into the string, change the meaning of the query
• Don't use String formatting either
    – Except if you have control over the variable data, like constants for table names or DB names*/

        /*Using Prepared Statements to Parameterize Data
Easier to build the Statement Strings

// The ? represent each parameter
// Need to set their values before executing the statement
// Count from 1

String prepStatInsert = "INSERT INTO movies VALUES (?, ?, ?)";
PreparedStatement psInsert = connection.prepareStatement(prepStatInsert);
psInsert.setString(1, name);
psInsert.setInt(2, stars);
psInsert.setBoolean(3, watched);
psInsert.executeUpdate();

connection is a Connection object, representing the connection
 between the code and the database.*/

        /*Using Prepared Statements to Parameterize
Data
Another advantage: can also reuse a prepared statement
multiple times, with different data

//The ? represent each parameter
//Need to set their values before executing the statement
//Count from 1

String prepStatInsert = "INSERT INTO movies VALUES ( ?, ?, ? )";
PreparedStatement psInsert = connection.prepareStatement(prepStatInsert);
psInsert.setString(1, name);
psInsert.setInt(2, stars);
psInsert.setBoolean(3, watched);
psInsert.executeUpdate();

//Later, can reuse the same preparedStatement to enter more data
psInsert.setString(1, "Guardians of the Galaxy");
psInsert.setInt(2, 0);
psInsert.setBoolean(3, false);

psInsert.executeUpdate();*/



        /*Updating movies
• Let's add a method that loops over all the un-watched
movies and asks the user if they have seen that movie
yet
• If they have seen the movie, ask for the number of
stars
• Update the database row for that movie
• Need two new methods in Database.java
    – one to search for unwatched movies
    – one to update a movie*/



        /*Search tips - Case-insensitive
• By default, search is case sensitive
• Search for matches between the uppercase
version of the search name, and the database
data, using upper() function*/



        /*Primary Keys
• Almost every database table benefits from creating
a primary key for the rows
• A column that has a unique value for every row
• Used to tell the rows apart
• One way to create primary keys is to use an integer
number - start at 1, increase by 1 for every new row
• Create a column to store this number
• Can configure the database to create the numbers*/

        /*Your own primary key
• Designate a column as the primary key column
• It's often called something like id
create table birds ( id integer primary key,
name text, species text, age integer,
weight real);
• If you don't provide a value for id, SQLite will
add a unique integer when data is added
*/

        /*Autoincrement id values
• You need to specify the columns you want to
add data to in the new row, and not provide the id value*/

        /*Your own primary key
• Or if you don't want an autoincrementing
primary key, you can designate another
column to be the primary key
• SQLite will reject any duplicate values*/



        /*Validation, Checking Data
• Check in code
    – Example: validation while loops
• Check with database
    – Use constraints
    – Example:
        • unique constraints
        • Checking length
        • Checking numbers within range*/




    }
}
