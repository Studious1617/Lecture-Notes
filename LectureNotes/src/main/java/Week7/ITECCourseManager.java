package Week7;

public class ITECCourseManager {
    public static void main(String[] args) {

        //Makes the maintenanceCourse with all fields filled in
        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);

        //Adds some students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        //Removes Carl from the list of students
        maintenanceCourse.removeStudent("Carl");

        //Makes the datacomCourse with all fields filled in
        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30);

        //Adds some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        //Gives the user a datacomCourse description
        datacomCourse.writeCourseInfo();

        //Makes the softwareDevelopmentProjects with all fields filled in
        ITECCourse softwareDevelopmentProjects = new ITECCourse("Software Development Projects", 2903, 24);
        //Adds some students
        softwareDevelopmentProjects.addStudent("Gus");
        softwareDevelopmentProjects.addStudent("Harry");
        softwareDevelopmentProjects.addStudent("Izzy");
        softwareDevelopmentProjects.addStudent("Jake");

        //Stores the number of students in the softwareDevelopmentProjects course in the totalEnrolled variable
        int totalEnrolled = softwareDevelopmentProjects.getNumberOfStudents();
        //Telling the user some course description info like the course names and codes manually
        System.out.println("The " + softwareDevelopmentProjects.getName() + " class has " + totalEnrolled + " students.");
        System.out.println("ITEC " + softwareDevelopmentProjects.getCode() + " " + softwareDevelopmentProjects.getName());

        softwareDevelopmentProjects.setMaxStudents(30);  //Sets the max number of students in softwareDevelopmentProjects to 30
        softwareDevelopmentProjects.writeCourseInfo();  //Gives user softwareDevelopmentProjects course info

        //Makes the smallCourse with all fields filled in
        ITECCourse smallCourse = new ITECCourse("Made up course", 1234, 3);
        //Adds some students
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        smallCourse.addStudent("Miriam");
        //Removes a student
        smallCourse.removeStudent("Kirby");
        //Adds a student
        smallCourse.addStudent("Nita");

        smallCourse.writeCourseInfo();  //Gives user smallCourse course info


        /*Using Object Oriented Principles
• We have modeled an object by thinking about what ITECCourse objects
should be responsible for
    – Things that ITECCourse objects should be responsible for, should go in the
ITECCourse class. Free up ITECCourseManager from these tasks
• We have abstraction – the things the ITECCourse objects can do are
written in the ITECCourse class, and ITECCourseManager doesn't have to
deal with that detail – for example, checking the if there is room for a
student in a class
• ITECCourseManager doesn't have to know how ITECCourse objects work
    – It just needs to know how to make them, and what it can do with them
    – If we changed how ITECCourse worked internally, ITECCourseManager doesn't
care, doesn't need to know, and isn't affected. So we can change the ArrayList to
an Array or LinkedList or whatever and ITECCourseManager doesn't care (so long
as we don’t change the methods ITECCourseManager was using)
• And we could easily re-use ITECCourse objects in another program
• We have some encapsulation...*/

    }
}
