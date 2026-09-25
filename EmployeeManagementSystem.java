package EmployeeProject;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {

    int id;
    String name;
    String department;
    double salary;

    // Constructor
    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Display Employee
    void display() {
        System.out.println("-----------------------------");
        System.out.println("ID   : " + id);
        System.out.println("Employee Name  : " + name);
        System.out.println("Department   : " + department);
        System.out.println("Salary        : " + salary);
        System.out.println("-----------------------------");
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {

            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

           
            case 1:

                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Department: ");
                String department = sc.nextLine();

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                Employee emp = new Employee(id, name, department, salary);

                employees.add(emp);

                System.out.println("Employee added successfully!");

                break;

           
            case 2:

                if (employees.isEmpty()) {

                    System.out.println("No employees found.");

                } else {

                    System.out.println("\n===== EMPLOYEE LIST =====");

                    for (Employee e : employees) {
                        e.display();
                    }
                }

                break;

            
            case 3:

                System.out.print("Enter Employee ID to search: ");
                int searchId = sc.nextInt();

                boolean found = false;

                for (Employee e : employees) {

                    if (e.id == searchId) {

                        e.display();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Employee not found!");
                }

                break;

                     case 4:

                System.out.print("Enter Employee ID to update: ");
                int updateId = sc.nextInt();

                boolean updated = false;

                for (Employee e : employees) {

                    if (e.id == updateId) {

                        sc.nextLine();

                        System.out.print("Enter New Name: ");
                        e.name = sc.nextLine();

                        System.out.print("Enter New Department: ");
                        e.department = sc.nextLine();

                        System.out.print("Enter New Salary: ");
                        e.salary = sc.nextDouble();

                        System.out.println("Employee updated successfully!");

                        updated = true;
                        break;
                    }
                }

                if (!updated) {
                    System.out.println("Employee not found!");
                }

                break;

            
            case 5:

                System.out.print("Enter Employee ID to delete: ");
                int deleteId = sc.nextInt();

                boolean deleted = false;

                for (int i = 0; i < employees.size(); i++) {

                    if (employees.get(i).id == deleteId) {

                        employees.remove(i);

                        System.out.println("Employee deleted successfully!");

                        deleted = true;
                        break;
                    }
                }

                if (!deleted) {
                    System.out.println("Employee not found!");
                }

                break;

           
            case 6:

                System.out.println("Thank you!");
                sc.close();
                return;

            default:

                System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}