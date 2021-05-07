package com.company;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RektangelTest {


    @ParameterizedTest
    @CsvSource({"3,2,6","4,5,20", "6,3,18"})
    public void AreaTest(double bas, double hojd, double result){
        System.out.println("Parameterized Test genomföras");
        double ExpeResult = Rektangel.getArea(bas, hojd);
        assertEquals(ExpeResult, result,0.0);
    }


    @Test
    public void testgetArea() {
        double bas = 3;
        double hojd = 2;
        //Rektangel rektangel = new Rektangel();

        double area = Rektangel.getArea(bas, hojd);
        System.out.println("get Area");
        assertEquals(6, area, 0.0);

    }

    /**
     * Test of getOmkrets method, of class Rektangel.
     */
    @Test
    public void testgetOmkrets() {
        double bas = 3;
        double hojd = 2;
        double omkrets = Rektangel.getOmkrets(bas, hojd);
        System.out.println("get Omkrets");
        assertEquals(10, omkrets, 0.0);

    }

    @Test
    public void testgetAreaNegative() {
        double bas = -3;
        double hojd = 2;
        //Rektangel rektangel = new Rektangel();

        double area = Rektangel.getArea(bas, hojd);
        System.out.println("get Area");
        assertEquals(6, area, 0.0);

    }
    @Test
    public void testgetOmkretsNegative() {
        double bas = -3;
        double hojd = 2;
        double omkrets = Rektangel.getOmkrets(bas, hojd);
        System.out.println("get Omkrets");
        assertEquals(10, omkrets, 0.0);

    }
}