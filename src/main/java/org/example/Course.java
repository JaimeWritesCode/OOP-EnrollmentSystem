package org.example;

public class Course {
    private String courseID;
    private String courseName;
    private String program;

    public Course(){

    }

    public String getcourseID(){
        return courseID;
    }

    public void setcourseID(String courseID){
        this.courseID = courseID;
    }

    public String getcourseName(){
        return courseName;
    }

    public void setcourseName(String courseName){
        this.courseName = courseName;
    }

    public String getprogram(){
        return program;
    }

    public void setprogram(String program){
        this.program = program;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID='" + courseID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", program='" + program + '\'' +
                '}';
    }

//    public void display(){
//        System.out.printf("Course ID: %s \n", courseID);
//        System.out.printf("Course name: %s \n", courseName);
//        System.out.printf("Program: %s \n", program);
//    }


}
