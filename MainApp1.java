//NAME : Doris Nduta 
//REG NO : CT101/G/21006/23
//DATE : 22/01/2025
//ASSIGNMENT : 3
/*java program to display student details and calculated grade */
import java.util.Scanner;

// Student class
class Student {
    private String name;
    private double marks;

    // Constructor initializing attributes name and marks
Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

// GradeCalculator class
class GradeCalculator {
    // Method to calculate grade based on marks
    public String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "D";
        }
    }
}

// MainApp class
public class MainApp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student marks: ");
        double marks = scanner.nextDouble();

        // Creating Student object
        Student student = new Student(name, marks);

        // Creating GradeCalculator object and calculating grade
        GradeCalculator gradeCalculator = new GradeCalculator();
        String grade = gradeCalculator.calculateGrade(student.getMarks());

        // Displaying details
        student.displayDetails();
        System.out.println("Grade: " + grade);

        // Closing scanner
        scanner.close();
    }
}