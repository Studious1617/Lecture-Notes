package Week7;

public class ITECCourseManager {
    public static void main(String[] args) {

        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);

        //Add some students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.removeStudent("Carl");

        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30);

        //Add some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.writeCourseInfo();

        ITECCourse softwareDevelopmentProjects = new ITECCourse("Software Development Projects", 2903, 24);
        softwareDevelopmentProjects.addStudent("Gus");
        softwareDevelopmentProjects.addStudent("Harry");
        softwareDevelopmentProjects.addStudent("Izzy");
        softwareDevelopmentProjects.addStudent("Jake");

        int totalEnrolled = softwareDevelopmentProjects.getNumberOfStudents();
        System.out.println("The " + softwareDevelopmentProjects.getName() + " class has " + totalEnrolled + " students.");
        System.out.println("ITEC " + softwareDevelopmentProjects.getCode() + " " + softwareDevelopmentProjects.getName());

        softwareDevelopmentProjects.setMaxStudents(30);
        softwareDevelopmentProjects.writeCourseInfo();

        ITECCourse smallCourse = new ITECCourse("Made up course", 1234, 3);
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        smallCourse.addStudent("Miriam");
        smallCourse.removeStudent("Kirby");
        smallCourse.addStudent("Nita");

        smallCourse.writeCourseInfo();


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
