package org.example.service;
import org.example.model.Student;
import java.util.ArrayList;

public class StudentRegistration {
    private ArrayList<Student> students = new ArrayList();

    //Create
    public void addStudent(Student student){
        students.add(student);
    }

    //Read
    public void displayall(){
        System.out.println(students);
    }

    //Update
  public void updateStudent(Student student){

  }
}
