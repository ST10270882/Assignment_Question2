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
public class partTimeEmployeeTest {
    
    public partTimeEmployeeTest() {
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
     * Test of getSalary method, of class partTimeEmployee.
     */
    
    //test to see if method of overriding calculation method works
    @Test
    public void testGetSalary() {
       partTimeEmployee employee = new partTimeEmployee(1, "Maryam Baldav", 15.0, 20.0);

        
        double expectedSalary = 15.0 * 20.0;

        
        double actualSalary = employee.getSalary();

    
        assertEquals(expectedSalary, actualSalary, 0.01); 
    }
    
}
