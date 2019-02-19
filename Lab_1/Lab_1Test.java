package cisc181.Lab_1;

/**
 * Aaron Knestaut
 * Cisc 181-012
 */

import static org.junit.Assert.*;

public class Lab_1Test {

    @org.junit.Test
    public void areaScalene() throws Exception{
        System.out.println("Testing areaScalene");
        assertEquals(3.96,Lab_1.areaScalene(5.5,3.4,8.7),0.0001);
    }

    @org.junit.Test
    public void increaseLevel() throws Exception{
        System.out.println("Testing increaseLevel");
        assertEquals(0, Lab_1.increaseLevel(1,1));
        assertEquals(2, Lab_1.increaseLevel(1,25));
        assertEquals(1, Lab_1.increaseLevel(3,15));
    }

    @org.junit.Test
    public void shareDigit() throws Exception{
        System.out.println("Testing shareDigit");
        assertEquals(true, Lab_1.shareDigit(15, 57));
        assertEquals(true, Lab_1.shareDigit(20, 22));
        assertEquals(false, Lab_1.shareDigit(15, 40));
    }

    @org.junit.Test
    public void closestFactorToSqrt() throws Exception{
        System.out.println("Testing closestFactorToSqrt");
        assertEquals(1, Lab_1.closestFactorToSqrt(1));
        assertEquals(2, Lab_1.closestFactorToSqrt(4));
        assertEquals(2, Lab_1.closestFactorToSqrt(10));
        assertEquals(7, Lab_1.closestFactorToSqrt(70));
        assertEquals(1, Lab_1.closestFactorToSqrt(1427));
    }
}