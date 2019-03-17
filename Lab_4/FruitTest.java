package cisc181.Lab_4;

/**
 * Aaron Knestaut
 * Cisc181-012
 */

import org.junit.Test;

import static org.junit.Assert.*;

/*
tests for various parts of the Fruit class
*/
public class FruitTest {
    @Test
    public void testingFruit(){
        System.out.println("Testing Fruit");
        Fruit apple = new Fruit("apple", "green");
        Fruit berry = new Fruit("berry", "red");

        assertEquals(apple.getColor(), "green");
        assertEquals(apple.getFruitType(), "apple");
        assertEquals(apple.toString(), "green apple");

        assertEquals(berry.getColor(), "red");
        assertEquals(berry.getFruitType(), "berry");
        assertEquals(berry.toString(), "red berry");
    }
}