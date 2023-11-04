package my_week_10.test;

import my_week_10.classes.Course;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Pater Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in "
                + course1.getCourseName() + " : " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.println((i + 1) + ")->" + students[i]);
        }
        System.out.println();
        System.out.println("Number of students in "
                + course2.getCourseName() + " :" + course2.getNumberOfStudents());
        String[] students2 = course1.getStudents();
        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.println((i + 1) + ")->" + students2[i]);
        }
    }
}
