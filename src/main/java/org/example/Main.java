package org.example;

public class Main {
    public static void main(String[] args) {
      Student student = new Student();
      Course course = new Course();

      student.setstudentID("2024KLpq1");
      student.setstudentName("John Wick");
      student.setprogram("Information Technology");

//        System.out.println("Student ID: " + student.getstudentID());
//        System.out.println("Student Name: " + student.getstudentName());
//        System.out.println("Student Program: " + student.getprogram());
//        System.out.println();



        course.setcourseID("1101");
        course.setcourseName("Inteprog");
        course.setprogram("Information Technology");

        System.out.println("Course ID: " + course.getcourseID());
        System.out.println("Course Name: " + course.getcourseName());
        System.out.println("Program: " + course.getprogram());
        System.out.println();

        student.setstudentID("2024EZpq2");
        student.setstudentName("John Doe");
        student.setprogram("Information Technology");

//        System.out.println("Student ID: " + student.getstudentID());
//        System.out.println("Student Name: " + student.getstudentName());
//        System.out.println("Student Program: " + student.getprogram());
//        System.out.println();

        course.setcourseID("1202");
        course.setcourseName("Inteprog");
        course.setprogram("Information Technology");

        System.out.println("Course ID: " + course.getcourseID());
        System.out.println("Course Name: " + course.getcourseName());
        System.out.println("Program: " + course.getprogram());
        System.out.println();

      student.display();


    }
}