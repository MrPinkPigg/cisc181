package cisc181.Lab_2;

/**
 * Aaron Knestaut
 * Cisc 181-012
 */

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    /*
    Creates a triangle with sides of 1, 1, and 1
     */
    public Triangle(){
        sideA = 1;
        sideB = 1;
        sideC = 1;
    }

    /*
    Creates a triangle with 3 user input sides
     */
    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /*
    returns the value of sideA
     */
    public double getSideA(){
        return sideA;
    }

    /*
    returns the value of sideB
     */
    public double getSideB(){
        return sideB;
    }

    /*
    returns the value of sideC
     */
    public double getSideC(){
        return sideC;
    }

    /*
    finds the area of the triangle based on the 3 side lengths
     */
    public double getArea(){
        double semiPer = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(semiPer * (semiPer - sideA) * (semiPer - sideB) * (semiPer - sideC));

        return area;
    }

    /*
    finds the area of the triangle by adding the sides together
     */
    public double getPerimeter(){
        return sideA + sideB + sideC;
    }

    /*
    takes one user input side and creates an isosceles triangle
     */
    public static Triangle makeIsosRightTri(double side){
        double longSide = Math.sqrt(2) * side;

        Triangle isoTriangle = new Triangle(side, side, longSide);
        return isoTriangle;
    }
}
