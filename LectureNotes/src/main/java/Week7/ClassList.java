package Week7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Student {
    String name;
    Date registrationDate;

    //Stores registration date
    public Student(String name){
        this.name = name;
        this.registrationDate = new Date();

    }
}
public class ClassList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Student s1 = new Student("A");
        students.add(s1);
        Student s2 = new Student("B");
        students.add(s2);

        for (Student s: students){
            System.out.println(s.name + " registrated at " + s.registrationDate);
        }
    }
}
