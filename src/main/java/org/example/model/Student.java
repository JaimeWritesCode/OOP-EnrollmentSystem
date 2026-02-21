package org.example.model;

public class Student {
    private String studentID;
    private String studentName;
    private String program;

    public Student(String studentID, String studentName, String program){
        this.studentID = studentID;
        this.studentName = studentName;
        this.program = program;
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



    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", program='" + program + '\'' +
                '}';
    }

}
