package org.example.service;
import org.example.model.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentRegistration {
    private ArrayList<Student> students = new ArrayList();
    Scanner input = new Scanner(System.in);

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
              System.out.print("Enter student name: ");
              String name = input.nextLine();

              System.out.print("Enter student program: ");
              String program = input.nextLine();

              students.set(i, new Student(student.getstudentID(), name, program));
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
