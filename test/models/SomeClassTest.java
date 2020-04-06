/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author A.Korovesis
 */
public class SomeClassTest {
    
    public SomeClassTest() {
    }

    /**
     * Test of getSum method, of class SomeClass.
     */
    @Test
    public void testGetSum() {
        SomeClass someClass = new SomeClass(5,5);
        int expected = 10;
        int actual = someClass.getSum();
        assertEquals(expected, actual);
    }

    /**
     * Test of getProduct method, of class SomeClass.
     */
    @Test
    public void testGetProduct() {
        SomeClass someClass = new SomeClass(6,6);
        int expected = 36;
        int actual = someClass.getProduct();
        assertEquals(expected, actual);
    }
    
    /**
     * Test of getProduct method, of class SomeClass.
     */
    @Test
    public void testGetQuotient() {
        SomeClass someClass = new SomeClass(6,6);
        double expected = 1.00012;
        double actual = someClass.getQuotient();
        assertEquals(expected, actual, 0.001);
    }
    
}
