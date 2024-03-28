package Week7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//New Student class to make the Student object
class Student {

    //Fields
    String name;
    Date registrationDate;

    //Constructor
    //Stores registration date
    public Student(String name){  //Input descriptions for calls
        this.name = name;
        this.registrationDate = new Date();

    }
}
public class ClassList {
    //Main method
    public static void main(String[] args) {

        //Makes new arrayList with Student object values within it
        List<Student> students = new ArrayList<>();

        //Makes new Student object named s1
        Student s1 = new Student("A");
        //Adds new student s1
        students.add(s1);
        //Makes new Student object named s1
        Student s2 = new Student("B");
        //Adds new student s2
        students.add(s2);

        //For loop that loops through each student in the students arrayList and prints out their name and registration date
        for (Student s: students){
            System.out.println(s.name + " registrated at " + s.registrationDate);
        }
    }
}
