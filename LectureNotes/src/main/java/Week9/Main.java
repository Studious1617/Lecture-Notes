package Week9;

public class Main {
    public static void main(String[] args) {

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





    }
}
