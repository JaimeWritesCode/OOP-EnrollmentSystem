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
  public void updateStudent(Student student) {
      for (int i = 0; i < students.size(); i++) {
          if (students.get(i).getstudentID().equals(student.getstudentID())) {
              students.set(i, student);
              break;
          }
      }
  }

 //Delete
public String delete(Student student){
for(int i = 0; i < students.size(); i++){
    if(students.get(i).getstudentID().equals(student.getstudentID())){
     students.remove(i);
     return "Successfully Deleted";
    }
}
return "Error";
 }
  }
