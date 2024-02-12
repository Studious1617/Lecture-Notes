package Week1;

import static input.InputUtils.stringInput;

public class DepartmentCode {
    public static void main(String[] args) {

        String departmentCode = stringInput("Enter department code: ");

        // Check for valid code --> ITEC, BTECH, ENGL, MATH
        // We can use == here becasuse we're comparing the length of a string which is an int
        if (departmentCode.length() == 4){
            System.out.println("The code is valid.");
            // Overwriting the original department code variable with one in complete uppercase
            departmentCode = departmentCode.toUpperCase();
            System.out.println("The code is " + departmentCode);
        }
        else{
            System.out.println("The code is not valid.");
        }
    }
}
