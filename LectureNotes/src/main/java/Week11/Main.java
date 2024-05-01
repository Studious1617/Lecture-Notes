package Week11;

public class Main {
    public static void main(String[] args) {

        /*Why do we have tests in your labs?
• Is it just for grading?
• They are used to help calculate your grade
• But the idea of testing is important to check
 code quality in real-world projects
• As a software developer, you'll be expected to
 write code that passes tests
• AND write your own tests to check
code!*/

        /*Software Testing
• Testing is very important for finding bugs and errors in code
• And to verify correctness: does this application meet requirements?
Does it do what the customer wants?*/

        /*Testing can:
• Improve reliability (does the application work correctly?)
• Improve availability (avoid being down for maintenance)
• Improve software quality (makes programmers more thoughtful
 about writing good code)
• Improve user experience, increase user retention
• Reduce the risk of security issues (SQL injection, DoS, other
vulnerabilities)*/

        /*Humans vs. automatic testing
• Two broad types of testing
• Human tests (by you, or the QA staff, or later in the
 process, select customers, alpha/beta testers)
• Automated tests (integration tests, unit tests such as
 Java's unit tests)
• Important to have both automatic tests, and human testers
• This is why I ask you to run and test your lab code, and
 run the lab's tests*/

        /*Software Testing by humans
• Humans will use your app, so to make sure it truly works,
 we need a human to try it and test it out
• Software testing is a skilled job
• Testers need to
• understand the code
• understand the requirements
• understand the users
• know how and where the code will be deployed/used
• be creative, possess a thorough knowledge of how to break code
• Often companies will have Quality Assurance (QA) staff or
 testers who work independently from the developers
• And have developers test their own, and other people's code*/

        /*Testing with unit tests
• Running and testing your application with many combinations of
input is time consuming
• Remember you should repeat tests when anything changes, in case
you broke working code
• Software tests - often called unit tests - can automate this process*/

        /*Automatic tests - unit tests - can be helpful
• For each part (or unit) of your program,
• Specify example input(s) to your program, and the expected
 output/result
• Tests will run code with input, check the expected output/result
 is produced
• That's what the tests in your labs are doing
• A "unit" is usually a method
• A simple method may have 1-2 tests
• A more complex method may have several tests, each to check
different aspects of its functionality*/

        /*Automatic Testing
• Writing code that tests your code
• A test can call a method with some input, checks the output is as
expected
• Can create set of tests, each test checks one aspect of your code
• Together, the tests will try and check as many aspects of your project
as possible - test coverage
• Much faster than manual testing
• But, does not replace manual testing, we still need to do both
• The tests are part of a project*/

        /*Unit tests with JUnit
• JUnit is the standard unit testing framework for Java code
• You can write a unit test to test a unit (usually one method or
part of a method) of your Java code for correct functionality
• Developers create a set of unit tests for a project as they work on it
• Run tests as needed to verify code is still working, and that you
haven't broken anything else
• Other languages have their own unit test frameworks. Python and C#
unit tests are like Java JUnit tests*/

        /*Writing code in methods enables testing
• This is an important reason for why we write code in methods
• A method has defined input, through parameters, and defined
 output as a return value
• So, we can create tests that call the method with example input,
and check the output*/

        /*Writing code in methods enables testing
• Test for getNextMovie method
• Create an example list
• Call getNextMovie, with that list
• Store the result
• Check that the result is the first movie in the list
• Can check other aspects of how the method works
    - for example, this test checks that the example list still has
    3 movies in it*/



        /*First Unit Test
Collect this lab https://classroom.github.com/a/O5mVIeCk
For this lab, we'll work with
the code and the test files*/

        /*Assertions
• Central to unit testing
• Assert that your code is behaving correctly
• If things are working as expected, the assertions are happy, test
passes
• If things are not working as expected, assertion causes test to fail
• If your code being tested throws an exception, that also counts
as a test fail*/

        /*Open the test file Question_1_Create_Welcome_Message_Test.java
• Tests often have an Arrange - Action - Assert structure
• Arrange: set up the scenario the test is checking
• Action: call the method to test
• Assert: check that things worked as expected*/

        /*Good practices with testing
• Test AS you develop, NOT at the end - or even before you write code!
• Agile methodology stresses ongoing testing
• Writing tests then writing code is called "test driven development"
• Test with valid input - "happy paths"
• Test with invalid, weird, missing, random, malicious input
    - "unhappy paths"
• Test everything every time anything is changed
• Automatic tests and human tests are both important*/

        /*Testing Concerns
• Remember that we wrote the test, so testing depends on writing the
right test
• It's easy to write a broken test
• You should verify that the test is running and it's checking the
correct thing
• Independently calculate what a method should do, and test that
• Testing often done in teams: more people develop and review each
test*/



        /*Writing code that we can test
• So, why do we write code in smaller methods, each with a focused
 task to do, rather than in one big block?
• Why is it better for a method to return data, than it is to print
 the answer?
• Which one of these methods would be easier to test?*/



        /*Why run tests at GitHub?
• First, let's think about what happens to your code after you write it
• How are other people going to be able to use your application?
• One approach is Continuous Integration/Continuous Delivery (or
Deployment), CI/CD
• Automation many aspects of deploying code, specifically redeploying
or updating code when new features are added or changes are made*/

        /*So, you've written your code, what next?
• Code on your laptop might run great for you, but your customers can't use it. This is usually development code
• Code at GitHub doesn't do anything, GitHub is for storing project files
• We need to get the code running somewhere where your customers
 can access and use it
    - the process is called deployment ; the code is now
     production code
• A "customer" might be a person accessing a website, or another
 program connecting via an API, or something else
    - whatever is going to use your application*/

        /*Where to deploy? Often, to the Cloud
• For example, many Java applications are API servers or a web
applications
• We can deploy to the cloud - upload the code and resources to a
cloud server and the cloud server runs the app
• Cloud providers include Amazon Web Services, Azure, Google Cloud
Platform...
• Covered in web class and Capstone
• The cloud = someone else's computers*/

        /*Version control
• Almost all developers use a version control system
• GitHub can be used to combine the work of many developers
• So, you'll work locally, then push your code to a shared GitHub
repository
• GitHub provides a way to approve code before it is added to the
repository (pull requests and code reviews - covered in ITEC 2905
Capstone)*/

        /*Version control and GitHub actions
• CI/CD tools like GitHub Actions can be enabled at GitHub and
automatically deploy code as it is approved - you can create rules
and schedules for that
• For example, if new code is approved, the project is
automatically redeployed with the new work
• Running tests automatically is almost always part of the process
• Should we deploy this code?*/

        /*Tests are really important in automation
• Automatic tests - unit tests - are a critical part of automation
• If we provide a set of unit tests for all new features and
 changes, then an automation tool can run those tests, and notify
  us if something fails
• If tests fail, do not deploy the code
• If all tests pass, then the deployment can proceed
• If all the tests pass, then we can have more confidence that the code will work when deployed
• So, a comprehensive set of tests is really, really important!
*/

        /*CI/CD "see eye see dee"
• Continuous integration and continuous delivery (or continuous deployment)
• Adding small changes frequently
• Customers get new features sooner than waiting for one big update
• Small updates are less disruptive
• Feedback from smaller updates fed back into development process
• Able to fix bugs faster
• Tests are central to successful automation, also result in improved code quality
• Easier to remove problem code if needed
• https://www.synopsys.com/glossary/what-is-cicd.html */

        /*More resources
• https://www.youtube.com/@RaghavPal
• https://www.jenkins.io/doc/tutorials/
• ITEC 2905 Capstone*/





    }
}
