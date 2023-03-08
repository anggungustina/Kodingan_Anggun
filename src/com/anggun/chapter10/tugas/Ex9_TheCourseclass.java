package com.anggun.chapter10.tugas;

public class Ex9_TheCourseclass {
    public static void main(String[] args) {
        Course math101 = new Course("math101");

        math101.addStudent("Mark");
        math101.addStudent("Yuta");
        math101.addStudent("Haechan");

        math101.addStudent("Yuta");
        System.out.println("\nThe students in the course " + math101.getCourseName() + ":");
        String[] students = math101.getStudents();
        for (int i = 0; i < math101.getNumberOfStudents(); i++) {

            System.out.println(students[i] + " ");
        }
        System.out.println();
    }
}
