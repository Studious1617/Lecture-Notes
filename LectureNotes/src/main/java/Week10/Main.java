package Week10;

public class Main {
    public static void main(String[] args) {

        /*How do different computer systems talk to each other?
• Scenario to consider:
• An e-commerce retailer. Which systems may work together to display
products (with reviews, similar product suggestions) on pages, take orders, process orders, ship orders... ?
• Typical IT infrastructure within a company has many separate systems that communicate as needed*/

        /*Many technologies to connect different computer
         systems over a network
• Various technologies including CORBA, Message Passing, PubSub... (we
won't cover these)
• One technology that's become very popular is using HTTP
• Same technology used in your web browser, to request web pages
• HTTP can also be used by programs to make requests to API servers
• For example, ask a weather API server for the latest weather forecast
• An API server is much like a web server, but it's designed to respond to
programs, not human. It replies with data, not web pages*/

        /*
HTTP is the protocol used for browsers to request web pages, and
 for servers to send pages, images, other resources in response
• HTTP defines the structure of the request, and the response
• Programs can also "speak" HTTP - so a program can send a HTTP requests to another computer, somewhere else
on the network (or internet)
• The other computer - often an API server - can respond with data of some kind - a file, text, error message, or
JSON*/

        /*API = Application Programming Interface
• An API server is like a web server, but it is designed to be used by computer programs
• A program can request data from an API server
• A program can also ask an API server to add, modify or delete data
    - we won't do that in this class
    - but know that it's possible
        • For example, once an order has been placed, an order manager server needs to tell the product
        inventory server that product(s) have been sold
        • So, the order manager server can send an API request asking the product catalog server to change
        the available quantities of the products*/

        /*JSON
• JavaScript Object Notation, used by the
JavaScript language, but widely
understood by many other programming
languages
• Pronounced like the name "Jason"
• The { } represent an object
• Objects have properties and values
• base, data, rates are properties
• "USD" is the value for the base property
• A JSON response can also contain arrays -
lists of data
• We can turn a JSON response into a Java
object in our program, and use the data*/



        /*How to use an API
• Step 1: read the API documentation to determine what request to
make for the data you need
• Step 2: Test out the API - can we make the request?
• Step 3: Examine the structure of the response
• Step 4: Use API in program
    • Write Java class(es) to map the JSON response to Java object(s)
    • Make the API request
    • Store the response in Java object(s)
    • Use the data in the program*/

        /*Using an API
Step 1: read the documentation to figure out what request to make
    • There's an example URL
    • Paste it into your browser address bar to see what happens*/

        /*Step 2: Test out the API
• Test in browser
• Looks like a random cat fact
• What format is the data in?

JSON response - it's plain text but formatted to be readable by
computers. The structure has key: value pairs*/

        /*Step 3: How is the response structured?
• Note the JSON has keys "fact" and "length".
• We are interested in the fact
• Tip: A JSON formatter browser extension makes it easier to see the
structure
https://chrome.google.com/webstore/detail/json-formatter/bcjindccc
aagfpapjjmafapmmgkkhgoa?hl=en*/

        /*Step 4: Use in program - HTTP
requests with Unirest
• Java has built-in libraries for making HTTP requests but
 they are a little awkward to use
• So, we'll use the Unirest library to help
• http://kong.github.io/unirest-java/
*/

        /*Step 4: Use in program
• Add Unirest library to project
• Create Java class(es) that match the JSON response structure
• Make HTTP request to API
• Parse response into useable form* by converting to Java objects
• Use response in program

* Depending on the data you request, an API server may also respond with plain
Strings, or files, or some other data, which would be processed in a different way.
Example: Unsplash photo library https://unsplash.com and API
https://unsplash.com/developers*/







    }
}
