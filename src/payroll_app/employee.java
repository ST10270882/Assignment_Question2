/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll_app;

/**
 *
 * @author mbald
 */
public class employee {
    //getters and seeters for id,names and salary

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private int id;
    private String name;
    private double salary;

    public employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    
}
  public double getSalary() {
        return salary;
    }
//method to print out salary details
    public void displayInfo() {
        System.out.println("ID: " + id + "\nName: " + name + "\nSalary: R" + salary);
    }   
}
