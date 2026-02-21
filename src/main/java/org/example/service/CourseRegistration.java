package org.example.service;
import org.example.model.Course;
import java.util.ArrayList;

public class CourseRegistration {
    private ArrayList<Course> courses = new ArrayList();

    //Create
    public void addCourse(Course course) {
        courses.add(course);
    }

    //Read
    public void displayall() {
        System.out.println(courses);
    }

    //Update
    public void updateCourse(Course course) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getcourseID().equals(course.getcourseID())) {
                courses.set(i, course);
                break;
            }
        }
    }

    //Delete
    public String delete(Course course) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getcourseID().equals(course.getcourseID())) {
            courses.remove(i);
            }
        }
        return "Error";
    }
}

