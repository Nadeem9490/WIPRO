package Mini_Project;
import java.util.*;

public class Mini_Project{
class Employee {
    // Instance variables
    int empId;
    String name;
    double salary;

    // Parameterized constructor to take input at object creation
    Employee(int id, String empName, double empSalary) {
        empId = id;
        name = empName;
        salary = empSalary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        // Creating object with user input
        Employee emp = new Employee(id, name, salary);

        // Displaying employee details
        emp.displayDetails();
    }

}

