//NAME : Doris Nduta 
//REG NO : CT101/G/21006/23
//DATE : 22/01/2025
//ASSIGNMENT : 3

/*Program to display employee details along with
 the calculated bonus using attributes, constructors,
 and methods */
import java.util.Scanner;

class Employee {
    String name;
    int salary;

//Constructor to initialize the name and salary attributes
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

//Method to print the employees details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class SalaryCalculator {
//Method to calcuate bonus
    double calculateBonus(double salary) {
        return 0.1 * salary;
    }
}

public class MainApp {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = myScanner.nextLine();

        System.out.println("Enter salary:");
        int salary = myScanner.nextInt();
//Creation of object employee
        Employee employee = new Employee(name, salary);
        employee.displayDetails();

//Computing bonus using class SalaryCalculator by creating an object
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        double bonus = salaryCalculator.calculateBonus(salary);

        System.out.println("Bonus is: " + bonus);
    }
}
