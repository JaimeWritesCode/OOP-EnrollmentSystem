package org.example;
import org.example.model.Course;
import org.example.model.Student;
import org.example.service.CourseRegistration;
import org.example.service.StudentRegistration;

public class Main {
    public static void main(String[] args) {
    StudentRegistration studentRegistration = new StudentRegistration();
    CourseRegistration courseRegistration = new CourseRegistration();

    //Registering students
    studentRegistration.addStudent(new Student("2024111222", "Mike", "BSIT"));
    studentRegistration.addStudent(new Student("2024222333", "John", "BSIT"));

    //Displaying students
    studentRegistration.displayall();

    //Registering courses
    courseRegistration.addCourse(new Course("1", "Integrative Programming and Technologies", "BSIT"));
    courseRegistration.addCourse(new Course("2", "Dismath", "BSIT"));

    //Displaying courses
    courseRegistration.displayall();

        System.out.println("--------------------------------------");
        System.out.println("Basic updating and removing");

        //Updating and removing

        studentRegistration.updateStudent(new Student("2024111222", "Michael", "CS"));
        studentRegistration.displayall();

        studentRegistration.updateStudent(new Student("2024111222","Vincent"));
        studentRegistration.displayall();


        studentRegistration.delete(new Student("2024111222", "Vincent", "CS"));
        studentRegistration.displayall();


    }
}