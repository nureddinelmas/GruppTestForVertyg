/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author najma
 */
public class CircleTest {

    public CircleTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of area method, of class Circle.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Circle instance = new Circle(4);
        double expResult = 50.24;
        double result = instance.area();
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of circumference method, of class Circle.
     */
    @Test
    public void testCircumference() {
        System.out.println("circumference");
        Circle instance = new Circle(4);
        double expResult = 25.12;
        double result = instance.circumference();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of circumference method, of class Circle.
     */
    @Test
    public void testCircumferenceNegative() {
        System.out.println("circumference");
        Circle instance = new Circle(-4);
        double expResult = 25.12;
        double result = instance.circumference();
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of area method, of class Circle.
     */
    @Test
    public void testAreaNegative() {
        System.out.println("area");
        Circle instance = new Circle(4);
        double expResult = 50.24;
        double result = instance.area();
        assertEquals(expResult, result, 0);

    }
}
