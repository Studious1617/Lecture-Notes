package Week1;

import static input.InputUtils.yesNoInput;

public class CanYouTakeAndroid {
    public static void main(String[] args) {

        System.out.println("This program will check if you meet the pre-requisites for taking ITEC 2417 Android Programming.");
        System.out.println("Please answer the following two questions.");

        boolean hasTakenCSharp = yesNoInput("Have you taken ITEC 2505 C# Programming?");
        boolean hasTakenJava = yesNoInput("Have you taken ITEC 2545 Java Programming?");

        // Use an OR operator in the condition to check if the pre-requisites are met
        if (hasTakenCSharp || hasTakenJava){
            System.out.println("You meet the pre-requisites. You may take ITEC 2417 Android Programming.");
        }
        else {
            System.out.println("You do not meet the pre-requisites yet. You need to complete either C# or Java.");
        }

    }
}
