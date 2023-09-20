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
public class fullTimeEmployee extends employee {
    
    //getters and setters for tax rate and pension fund rate
    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getPensionFundRate() {
        return pensionFundRate;
    }

    public void setPensionFundRate(double pensionFundRate) {
        this.pensionFundRate = pensionFundRate;
    }

    private double taxRate;
    private double pensionFundRate;

    //method to convert tax rate and pension fund rate to a percentage
    public fullTimeEmployee(int id, String name, double salary, double taxRate, double pensionFundRate) {
        super(id, name, salary);
         this.taxRate = taxRate / 100;
        this.pensionFundRate = pensionFundRate / 100;
    }

    //Method to calculate deductions by taking the gross salary and multiplying it by tax rate and pension fund rate
    public double calculateDeductions() {
        double deductions = getSalary() * (taxRate + pensionFundRate);

        
        return Math.round(deductions * 100.0) / 100.0;
    }
    

}
