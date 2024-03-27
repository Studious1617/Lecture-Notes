package Week7;

import java.util.ArrayList;
import java.util.List;

public class ITECCourse {

    //Data - fields - instance variables
    String name;
    int code;
    List<String> students;
    int maxStudents;

    ITECCourse(String courseName, int courseCode, int courseMaxStudents){
        name = courseName;
        code = courseCode;
        maxStudents = courseMaxStudents;
        students = new ArrayList<>();
    }

    void addStudent(String studentName){
        students.add(studentName);
    }

    void writeCourseInfo(){
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Students enrolled: ");
        for (String student: students){
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled.");
        System.out.println("The max number of students that can enroll in this course is " + maxStudents);
    }

    int getNumberOfStudents(){
        return students.size();
    }

    void removeStudent(String studentName){
        if (students.contains(studentName)){
            students.remove(studentName);
            System.out.println(studentName + " was unenrolled from " + name);
        }
        else {
            System.out.println(studentName + " was not found in " + name + " student list.");
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
