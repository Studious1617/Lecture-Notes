package Week1;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class StringMethods {
    public static void main(String[] args) {

        // Length
        String secretPassword = "kittens";
        int numberOfCharactersInPassword = secretPassword.length();
        System.out.println(numberOfCharactersInPassword);
        System.out.println();

        if (secretPassword.length() > 12){
            System.out.println("Longer passwords are more secure, good choice.");
        }
        else {
            System.out.println("Consider using a longer password.");
        }



        // Lowercase
        // Emails are usually lowercase
        String email = "Clara.James@MINNEAPOLIS.edu";
        email = email.toLowerCase();
        System.out.println(email);
        System.out.println();



        // Uppercase
        // The department code is uppercase
        String classIndentifier = "itec 2545";
        // classIndentifier = classIndentifier.toUpperCase();
        // System.out.println(classIndentifier);

        String uppercaseClassIndentifier = classIndentifier.toUpperCase();
        System.out.println(classIndentifier);
        System.out.println(uppercaseClassIndentifier);



        // Ends with
        // Is this email a .edu email?
        System.out.println(email.endsWith(".edu"));
        System.out.println(email.endsWith(".com"));

        String exampleEmail = "test@gmail.com";
        if (exampleEmail.endsWith(".edu")){
            System.out.println("This is an education email address.");
        }
        else {
            System.out.println("This is not an education email address.");
        }



        // Starts with
        // Is a class an ITEC class
        String classCode = stringInput("Please enter a class code: ");
        System.out.println(classCode.startsWith("ITEC"));

        if (classCode.startsWith("ITEC")){
            System.out.println("This is an ITEC class.");
        }
        else {
            System.out.println("This is not an ITEC class.");
        }

        // Contains
        // Look for support ticket requests thar contain the text "server"
        String supportTicketDescription1 = "The server is down!";
        String supportTicketDescription2 = "My mouse is missing!";
        String supportTicketDescription3 = "All the servers need to be rebooted!";
        String supportTicketDescription4 = "Server problem - All the servers need to be rebooted";
        String supportTicketDescription5 = "I dropped my drink into the server!";
        String supportTicketDescription6 = "SERVER DOWN!";

        System.out.println(supportTicketDescription1.contains("server")); // True
        System.out.println(supportTicketDescription2.contains("server")); // False
        System.out.println(supportTicketDescription3.contains("server")); // True
        System.out.println(supportTicketDescription4.contains("server")); // True
        System.out.println(supportTicketDescription5.contains("server")); // True
        System.out.println(supportTicketDescription6.contains("server")); // False because of case sensitivity


        String serverProblem = "The SERVER IS DOWN";
        String searchTerm = "server";

        if (serverProblem.toUpperCase().contains(searchTerm.toUpperCase())){
            System.out.println("Found a server problem.");
        }
        else {
            System.out.println("This is not a server problem.");
        }

        // Created a new variable to preserve the original form of the text. Don't always have to overwrite
        String uppercaseServerProblem = serverProblem.toUpperCase();
        String uppercaseSearchTerm = searchTerm.toUpperCase();
        if (uppercaseServerProblem.contains(uppercaseSearchTerm)){
            System.out.println("Found a server problem.");
        }
        else {
            System.out.println("This is not a server problem.");
        }



        // Why would you not use .contains() to test if a class was an ITEC class?
        // or an email was an education email

        String studentEmail = "abc@minneapolis.edu";
        System.out.println(studentEmail.contains(".edu"));
        String tricksStudentEmail = "abc.edu@gmail.com";
        System.out.println(tricksStudentEmail.contains(".edu")); // Fix by using .endsWith()



        // Split sentence into words
        String sentence = "Intellij is a Java integrated development enviroment.";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String firstWord = words[0];
        System.out.println(firstWord);

        String javaIDEs = "Intellij,Eclipse,NetBeans,Notepad++,VSCode";
        String[] ides = javaIDEs.split(",");
        System.out.println(Arrays.toString(ides));
        for (int x = 0 ; x < ides.length ; x++){
            System.out.println(ides[x]);
        }

        // Split class indentifier into department and code
        String javaClass = "ITEC Java Programming";
        String[] javaClassIndentifierParts = javaClass.split(" ");
        String department = javaClassIndentifierParts[0];
        String code = javaClassIndentifierParts[1];
        System.out.println(department);
        System.out.println(code);



        // Trim - removes whitespace like spaces, tabs, and newlines at the start and end of a string
        String userAddressInput = "1503 Hennepin Avenue ";
        userAddressInput = userAddressInput.trim();
        System.out.println(userAddressInput + "**"); // Where the user address input ended



        // Format strings
        // printf - no newline - you need to add a /n
        String className = "Java Programming";
        double credits = 6.0;
        int studentEnrolled = 24;
        String format = "Online";

        // The Java Programming class is 6 credits, delivered online, there are 24 students enrolled
        System.out.println("The " + className + " is " + credits + " credits, delivered " + format + ", there are " + studentEnrolled + " students enrolled.");

        System.out.printf("The %s is %.1f credits, delivered %s, there are %d students enrolled. \n", className, credits, format, studentEnrolled);

        System.out.printf("End of example program with Java String methods!");



    }
}
