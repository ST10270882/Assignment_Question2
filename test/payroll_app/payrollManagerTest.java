/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package payroll_app;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author mbald
 */
public class payrollManagerTest {
    
    //Declaring global objects and arraylist

    private payrollManager payrollManager;
    private employee employee;
    private ArrayList<employee> employees = new ArrayList<>();

    @BeforeEach
    public void setUp() {
        payrollManager = new payrollManager();
        // Create a sample employee for testing
        employee = new fullTimeEmployee(80, "Mikyle", 7.0, 2.0, 1.0);
    }
    //test to see if the add employee method works and it returns true if correct
    @Test
    public void testAddEmployee() {

        payrollManager.addEmployee(employee);

        assertTrue(employees.contains(employee));

    }

    //test to see if the add employee method works and it returns true if correct
    @Test
    public void testRemoveEmployee() {
        payrollManager.removeEmployee(employee);

        assertTrue(employees.contains(employee));
    }
}
