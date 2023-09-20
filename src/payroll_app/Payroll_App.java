/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package payroll_app;

import java.util.Scanner;

/**
 *
 * @author mbald
 */
public class Payroll_App {

    public static void main(String[] args) {
        //Decalring scanner Object and payrollManager object
        Scanner scanner = new Scanner(System.in);
        payrollManager payrollManager = new payrollManager();

        //This is to make sure the menu always shows up
        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("1. Add Full-time Employee");
            System.out.println("2. Add Part-time Employee");
            System.out.println("3. Generate Payroll Report");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            System.out.println("-----------------------------------");
            int choice = scanner.nextInt();
            
            //depending on the user's choice the appropraite text will appear
            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Salary: ");
                double salary = scanner.nextDouble();
                System.out.print("Enter Tax Rate(Enter an integer): ");
                double taxRate = scanner.nextDouble();
                System.out.print("Enter Pension Fund Rate(Enter an integer): ");
                double pensionFundRate = scanner.nextDouble();

                fullTimeEmployee employee = new fullTimeEmployee(id, name, salary, taxRate, pensionFundRate);
                payrollManager.addEmployee(employee);
            } else if (choice == 2) {
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Hourly Wage: ");
                double hourlyWage = scanner.nextDouble();
                System.out.print("Enter Hours Worked: ");
                double hoursWorked = scanner.nextDouble();

                partTimeEmployee employee = new partTimeEmployee(id, name, hourlyWage, hoursWorked);
                payrollManager.addEmployee(employee);
            } else if (choice == 3) {
                payrollManager.generatePayrollReport();
            } else if (choice == 4) {
                System.exit(0);
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

}
