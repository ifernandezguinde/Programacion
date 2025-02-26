/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package examen;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author ivan.fernandezguinde
 */
public class ExamenNGTest {
    
    public ExamenNGTest() {
    }

    
    
    
    /**
     * Test of compararNumeros method, of class Examen.
     */
    @Test
    public void testCompararNumeros() {
        System.out.println("compararNumeros");
        int a = 3;
        int b = 2;
        Examen instance = new Examen();
        String expResult = "o primeiro número é maior";
        String result = instance.compararNumeros(a, b);
        assertEquals(result, expResult);
    }
    
    /**
     * Test of compararNumeros method, of class Examen.
     */
    @Test
    public void testCompararNumeros1() {
        System.out.println("compararNumeros");
        int a = 2;
        int b = 3;
        Examen instance = new Examen();
        String expResult = "o segundo número é maior";
        String result = instance.compararNumeros(a, b);
        assertEquals(result, expResult);
    }
    
    /**
     * Test of compararNumeros method, of class Examen.
     */
    @Test
    public void testCompararNumeros2() {
        System.out.println("compararNumeros");
        int a = 3;
        int b = 3;
        Examen instance = new Examen();
        String expResult = "os dous números son iguais";
        String result = instance.compararNumeros(a, b);
        assertEquals(result, expResult);
    }
    
}
