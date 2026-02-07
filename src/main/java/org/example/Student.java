package org.example;

public class Student {
    private String studentID;
    private String studentName;
    private String program;

    public Student(){

    }
    //getter
    public String getstudentName(){
   return studentName;
    }

    //setter
    public void setstudentName(String name){
        this.studentName = name;
    }

    public String getstudentID(){
        return studentID;
    }

    public void setstudentID(String studentID){
        this.studentID = studentID;
    }

    public String getprogram(){
        return program;
    }

    public void setprogram(String program){
        this.program = program;
    }

    public void display(){
        System.out.printf("Student ID: %s \n", studentID);
        System.out.printf("Student name: %s \n", studentName);
        System.out.printf("Student program: %s \n", program);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", program='" + program + '\'' +
                '}';
    }

}
