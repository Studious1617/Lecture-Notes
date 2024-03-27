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
        System.out.println("The " + softwareDevelopmentProjects.name + " class has " + totalEnrolled + " students.");
        System.out.println("ITEC " + softwareDevelopmentProjects.code + " " + softwareDevelopmentProjects.name);

        softwareDevelopmentProjects.maxStudents = 30;
        softwareDevelopmentProjects.writeCourseInfo();

        ITECCourse smallCourse = new ITECCourse("Made up course", 1234, 3);
    }
}
