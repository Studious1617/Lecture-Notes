package Week1;

import static input.InputUtils.positiveIntInput;
import static input.InputUtils.yesNoInput;

public class CanYouBePresident {
    public static void main(String[] args) {

        System.out.println("Are you eligible to become President of the United States?");
        System.out.println("Please answer these three questions to find out!");

        boolean naturalBornCitizen = yesNoInput("Were you born in the United States?: ");
        int age = positiveIntInput("What is your age, in years?: ");
        int yearsLivedInUSA = positiveIntInput("How many years have you lived in the United States?: ");

        if (naturalBornCitizen && age >= 35 &&yearsLivedInUSA >= 14){
            System.out.println("You meet the eligibility requirements to become president. Good luck!");
        }
        else {
            System.out.println("Sorry, you do not meet the requirements.");
        }

    }
}
