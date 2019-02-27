package cisc181.Lab_2;

/**
 * Aaron Knestaut
 * Cisc 181-012
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void getArea() throws Exception {
        System.out.println("Testing getArea");
        Triangle testTriangle = new Triangle(5.5,3.4,8.7);
        assertEquals(3.96, testTriangle.getArea(),0.00001);
    }

    @Test
    public void getPerimeter() throws Exception {
        System.out.println("Testing getPerimenter");

        Triangle testTriangle = new Triangle(3.0,4.0,5.0);
        assertEquals(12.0, testTriangle.getPerimeter(),0.00001);

        Triangle testTriangle2 = new Triangle();
        assertEquals(3.0, testTriangle2.getPerimeter(),0.00001);

        Triangle testTriangle3 = new Triangle(4.0, 10.0, 6.0);
        assertEquals(20.0, testTriangle3.getPerimeter(),0.00001);
    }

    @Test
    public void makeIsosRightTri() throws Exception {
        System.out.println("Testing makeIsosRightTri");
        // declare a variable of type Triangle
        Triangle myIsosRightTri = Triangle.makeIsosRightTri(6.5);
        assertEquals(6.5,myIsosRightTri.getSideA(),0.0001);
        assertEquals(6.5,myIsosRightTri.getSideB(),0.0001);
        assertEquals(9.19238815542512,myIsosRightTri.getSideC(),0.0001);

        Triangle isosTri2 = Triangle.makeIsosRightTri(2.0);
        assertEquals(2.0,isosTri2.getSideA(),0.0001);
        assertEquals(2.0,isosTri2.getSideB(),0.0001);
        assertEquals(2.828427125,isosTri2.getSideC(),0.0001);

        Triangle isosTri3 = Triangle.makeIsosRightTri(10.0);
        assertEquals(10.0,isosTri3.getSideA(),0.0001);
        assertEquals(10.0,isosTri3.getSideB(),0.0001);
        assertEquals(14.14213562,isosTri3.getSideC(),0.0001);

        Triangle isosTri4 = Triangle.makeIsosRightTri(5.5);
        assertEquals(5.5,isosTri4.getSideA(),0.0001);
        assertEquals(5.5,isosTri4.getSideB(),0.0001);
        assertEquals(7.778174593,isosTri4.getSideC(),0.0001);
    }
}