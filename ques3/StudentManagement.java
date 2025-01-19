public class StudentManagement {
    // Nested Student class
    public static class Student {
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

    public static void main(String[] args) {
        // Creating student object
        Student student1 = new Student(101, "John Doe", "Computer Science", 2024);

        // Accessing public method
        student1.displayStudentInfo();

        // Now we can access package-private members since Student is in the same file
        student1.displayDepartmentInfo();

        // Accessing public data member
        System.out.println("\nDirect access to graduation year: " + student1.graduationYear);

        // Now we can access package-private members
        System.out.println("Direct access to department: " + student1.department);

        // Still cannot access private members
        // student1.studentId; // This will cause error
        // student1.studentName; // This will cause error
        // student1.validateId(); // This will cause error
    }
}