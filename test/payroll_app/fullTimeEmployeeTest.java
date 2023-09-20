/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package payroll_app;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mbald
 */
public class fullTimeEmployeeTest  {
    
    public fullTimeEmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateDeductions method, of class fullTimeEmployee.
     */
    
    //test to see if the method of calculation is correct
    @Test
    public void testCalculateDeductions() {
       fullTimeEmployee employee = new fullTimeEmployee(123, "Mikyle Baldav", 50000.0, 7.0, 2.0);

        
        double expectedDeductions = 50000.0 * (0.07 + 0.02);

      
        double actualDeductions = employee.calculateDeductions();

       
        assertEquals(expectedDeductions, actualDeductions, 0.01); 
    }
    
    //test to see if the getters work and can fetch appropraite information 
    @Test
    public void testConstructorAndGetters() {
        
        fullTimeEmployee employee = new fullTimeEmployee(1, "Mikyle", 50000.0, 20.0, 10.0);

        
        assertEquals(1, employee.getId());
        assertEquals("Mikyle", employee.getName());
        assertEquals(50000.0, employee.getSalary(), 0.01); 
    }
    }
    

