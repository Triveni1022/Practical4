package com.college.model;

public class Student {
    // Private data members
    private int studentId;
    private String studentName;

    // Default (package-private) data member
    String department;

    // Public data member
    public int graduationYear;

    // Public constructor
    public Student(int id, String name, String dept, int year) {
        this.studentId = id;
        this.studentName = name;
        this.department = dept;
        this.graduationYear = year;
    }

    // Private method
    private void validateId() {
        if (studentId <= 0) {
            System.out.println("Invalid Student ID");
        } else {
            System.out.println("Valid Student ID");
        }
    }

    // Default (package-private) method
    void displayDepartmentInfo() {
        System.out.println("Department: " + department);
    }

    // Public methods
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        validateId(); // Calling private method
        displayDepartmentInfo(); // Calling default method
        System.out.println("Graduation Year: " + graduationYear);
    }
}
