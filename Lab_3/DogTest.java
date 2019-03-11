package cisc181.Lab_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void testingDogClass() {
        System.out.println("Testing Dog class");
        Dog spot = new Dog();
        assertEquals("Spot", spot.getName());
        assertEquals("brown", spot.getFurColor());
        assertEquals(spot.toString(),"Spot with brown fur");
        assertEquals("woof", spot.bark());
        assertEquals("zzz", spot.sleep());
        assertEquals("wagging tail", spot.wagTail());
    }
}