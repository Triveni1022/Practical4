package com.college.main;

import com.college.model.Student;

public class StudentManagement {
    public static void main(String[] args) {
        // Creating student object
        Student student1 = new Student(101, "John Doe", "Computer Science", 2024);

        // Accessing public method
        student1.displayStudentInfo();

        // Accessing default method
        // Note: This won't work now because StudentManagement is in a different package
        // student1.displayDepartmentInfo();

        // Accessing public data member
        System.out.println("Direct access to graduation year: " + student1.graduationYear);

        // Accessing default data member
        // Note: This won't work now because StudentManagement is in a different package
        // System.out.println("Direct access to department: " + student1.department);

        // Cannot access private members
        // student1.studentId; // This will cause error
        // student1.studentName; // This will cause error
        // student1.validateId(); // This will cause error
    }
}
