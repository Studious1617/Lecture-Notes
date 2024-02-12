package Week1;

import static input.InputUtils.stringInput;

public class CompareStrings {
    public static void main(String[] args) {

        String college = stringInput("Which college do you attend?: ");

        // Even though the answers may have the same letters in the same order, java is ultra-specific with strings so college.equals("MCTC") is needed
        // .equals is also case-sensitive so use .equalsIgnoreCase in order to bypass case-sensitivity
        if (college.equals("MCTC")){
            System.out.println("Yay, MCTC!");
        }
        else{
            System.out.println("Too bad. You should check out MCTC.");
        }

    }
}
