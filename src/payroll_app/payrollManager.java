/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll_app;

import java.util.ArrayList;

/**
 *
 * @author mbald
 */
public class payrollManager {
    
    //arraylist for employees to store employees
    private ArrayList<employee> employees = new ArrayList<>();

    //method to add employee
    public void addEmployee(employee employee) {
        employees.add(employee);
    }

    //method to remove employee
    public void removeEmployee(employee employee) {
        employees.remove(employee);
    }

    //used to generate the whole pay roll report using the displayinfo method from employee class
    public void generatePayrollReport() {
        System.out.println("Payroll Report:");
        for (employee employee : employees) {
            double deductions = 0;
            if (employee instanceof fullTimeEmployee) {
                deductions = ((fullTimeEmployee) employee).calculateDeductions();
            }
            double netSalary = employee.getSalary() - deductions;

            employee.displayInfo();
            System.out.println("Deductions: R" + deductions 
                    + "Net Salary: R" + netSalary);
            System.out.println();
        }
    
}}
