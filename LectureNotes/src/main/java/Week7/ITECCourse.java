package Week7;

import java.util.ArrayList;
import java.util.List;

public class ITECCourse {

    //Data - fields - instance variables
    private String name;
    private int code;
    private List<String> students;
    private int maxStudents;


    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        if (maxStudents < 0){
            return;  //Returns nothing if the inputted new maxStudents is less than 0
        }
        this.maxStudents = maxStudents;  //Changes the value in the maxStudent field
    }


    //Constructor for this class
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents){  //Input descriptions for calls
        //Immediate input required
        name = courseName;
        code = courseCode;
        maxStudents = courseMaxStudents;

        //Input can be added later with addStudent
        students = new ArrayList<>();
    }

    public void addStudent(String studentName){

        if (students.size() == maxStudents){
            System.out.println("Course is full. Cannot add " + studentName);  //If the size of the
            // students arrayList is equal to the value in maxStudents then this message will print
            // and the student won't be added
        }
        else {
            students.add(studentName);  //If there is space the student will be added
        }
    }

    public void writeCourseInfo(){
        //Gives a description of the course
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Students enrolled: ");
        //A loop for printing student names
        for (String student: students){
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled.");
        System.out.println("The max number of students that can enroll in this course is " + maxStudents);
    }

    //A getter for the students array, giving access to the size of it
    public int getNumberOfStudents(){
        return students.size();
    }

    public void removeStudent(String studentName){
        if (students.contains(studentName)){
            students.remove(studentName);  //If the student is in the arrayList then remove them
            System.out.println(studentName + " was unenrolled from " + name);  //Tells the user the student was removed
        }
        else {
            System.out.println(studentName + " was not found in " + name + " student list.");  //If the student's name
            // wasn't found then inform the user
        }
    }



























    /*The Object Oriented Version
• Let's model an object
• Create ITECCourse objects
• A Course object will contain data about one ITEC course
• We can encapsulate ITECCourse properties into one object
• Create ITECCourse objects from a ITECCourse class
– Remember a class is instructions for making an object
– One class can make as many objects as you need
• We can change the data ITECCourse objects stored by modifying the class
definition
• What if we want to add the classroom the course will be taught in? We
can just modify the ITECCourse class definition
• Much simpler and safer than adding another variable to our code for all
our courses; easier to remember the variable name*/
    String maintenanceCourseClassroom = "T3020";
    String datacomCourseClassroom = "T3050"; // yuck

        /*The Object Oriented Version
• Objects store data but can also do things
• Put them to work for you!
• What if we want to add code to check if the
number of students enrolled doesn't exceed
the max?
• We can do that in the ITECCourse class*/

        /*Defining a class
• Use the keyword class plus the name of the class
• Convention is to start class name with an uppercase letter
• Usually write each class definition in its own file
• The file name must match the class name
• So ITECCourse needs to be in a file called ITECCourse.java
public class ITECCourse{
// code here
}
*/
}
