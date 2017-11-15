
package course;

/*
@author: Kishan

Project: TestCourse.java
Description: The TestCourse program creates objects of Course type, adds students
to the courses, then uses methods in the Course class to print the number of 
students in each course and all the students in the first course.

*/
public class TestCourse {

    public static void main(String[] args) {
        //Creating objects of Course class.
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        //Adding students to the first course.
        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");

        //Adding students to the second course.
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents()); //Print number of students in the first course.
        String[] students = course1.getStudents(); //Get the names of the students in the first course and store them in an array.
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", "); //Print the names of the students in the fist course.
        }

        System.out.println();
        System.out.print("Number of students in course2: "
                + course2.getNumberOfStudents()); //Print the number of students in the second course.
    }//end main
}//end TestCourse
