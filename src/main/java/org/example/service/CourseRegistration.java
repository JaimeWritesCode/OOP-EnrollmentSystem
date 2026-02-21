package org.example.service;
import org.example.model.Course;
import java.util.ArrayList;

public class CourseRegistration {
    private ArrayList<Course> courses = new ArrayList();

    //Create
    public void addCourse(Course course){
        courses.add(course);
    }
}
