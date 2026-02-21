package org.example;
import org.example.model.Course;
import org.example.model.Student;
import org.example.service.CourseRegistration;
import org.example.service.StudentRegistration;

public class Main {
    public static void main(String[] args) {
    StudentRegistration studentRegistration = new StudentRegistration();
    CourseRegistration courseRegistration = new CourseRegistration()

    studentRegistration.addStudent(new Student("2024111222", "Mike", "BSIT"));
    studentRegistration.addStudent(new Student("2024222333", "John", "BSIT"));
    studentRegistration.displayall();

    courseRegistration.addCourse(new Course("1", "Inteprog", "BSIT"));
    courseRegistration.displayall();

    }
}