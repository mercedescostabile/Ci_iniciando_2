/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calcu_ej_ci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author merce
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sum method, of class Calculadora.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int num1 = 5;
        int num2 = 3;
        Calculadora instance = new Calculadora();
        int expResult = 8;
        int result = instance.sum(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of subtract method, of class Calculadora.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int x = 10;
        int y = 5;
        Calculadora instance = new Calculadora();
        int expResult = 5;
        int result = instance.subtract(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of multiply method, of class Calculadora.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int x = 3;
        int y = 2;
        Calculadora instance = new Calculadora();
        int expResult = 6;
        int result = instance.multiply(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of div method, of class Calculadora.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        int num1 = 10;
        int num2 = 2;
        Calculadora instance = new Calculadora();
        int expResult = 5;
        int result = instance.div(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
