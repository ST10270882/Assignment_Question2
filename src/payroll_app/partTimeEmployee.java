/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll_app;

/**
 *
 * @author mbald
 */

//this class inherits its parent class employee
public class partTimeEmployee extends employee {

    //getters abd setters for hourly wage and hours worked for part time employees
    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    private double hourlyWage;
    private double hoursWorked;

    public partTimeEmployee(int id, String name, double hourlyWage, double hoursWorked) {
        super(id, name, 0); 
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    //this will override calculate salary method if the option to add a part time employee is chosen
    @Override
    public double getSalary() {
        return hourlyWage * hoursWorked;
    }
    
}
