
package course;

import java.util.*;

/*
The Course class is re-written. Previously, the array was a normal String type
array storing data. The new Course class stores data in an ArrayList instead of
an array. Most of the methods have not been altered, but the methods that access
the students array have been modified to reflect ArrayList implementation.

*/
public class Course {

    private String courseName;
    //change String[] to an ArrayList of String
    private ArrayList<String> students = new ArrayList(); //ArrayList of String type.
    private int numberOfStudents;

    public Course(String courseName) { //Set the course name.
        this.courseName = courseName;
    }

    public void addStudent(String student) { //Add a student.
        students.add(numberOfStudents, student); //Method used to add a value to ArrayList.
        numberOfStudents++; //Increases each time a student is added.
    }

    //Keep the return type at String[]
    public String[] getStudents() { //Returns the students present in the ArrayList.
        String[] a = new String[100];
        return students.toArray(a); //Transfers data from 'students' to an array 'a'.
    }

    public int getNumberOfStudents() { //Returns number of students.
        return numberOfStudents;
    }

    public String getCourseName() { //Returns course name.
        return courseName;
    }

    public void dropStudent(String student) {
        // Left as an exercise in Exercise 10.9
    }
}//end Course
