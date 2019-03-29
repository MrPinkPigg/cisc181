package cisc181.Lab_5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.junit.Test;
import static org.junit.Assert.*;

public class Lab5TestPartA {


    @Test
    public void test_Berry() {
        // Berry has a constructor that takes a String and a double
        // but we should not be able to create a Berry
        System.out.println("Testing Berry Class");
        try {
            Class<Berry> clazz = Berry.class;
            Constructor<Berry> ctor = clazz.getDeclaredConstructor(String.class, Double.TYPE);
            try {
                ctor.newInstance("Red", 5);
                fail("Should not be able to create an instance of Berry");
            }
            catch (Exception e) {
                // should happen
            }

            // harvestBerry should not be implemented in the Berry class
            Method m = clazz.getDeclaredMethod("harvestBerry", new Class[]{});
            assertEquals(String.class, m.getReturnType());
            assertTrue(Modifier.isAbstract(m.getModifiers()));
        }
        catch (Exception e) {
            // not supposed to happen
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    @Test
    public void test_Edible() {
        System.out.println("Testing Edible Interface");
        try {
            // Edible should not have any constructor
            Class<Edible> clazz = Edible.class;
            Constructor<?>[] ctors = clazz.getConstructors();
            assertEquals(0, ctors.length);

            // but it should have a way to getCalories
            Method m = clazz.getMethod("getCalories", new Class[0]);
            assertNotNull(m);
            assertEquals(Double.TYPE, m.getReturnType());
        }
        catch (Exception e) {
            // not supposed to happen
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    @Test
    public void test_Cranberry() {
        System.out.println("Testing Cranberry Class");
        Cranberry cranny = new Cranberry(100);
        assertEquals(46.0, cranny.getCalories(), 0.0001);
        assertEquals("Wet Harvesting", cranny.harvestBerry());
        assertTrue(cranny instanceof Berry);
        assertTrue(cranny instanceof Edible);
    }

    @Test
    public void test_Blueberry() {
        System.out.println("Testing Blueberry Class");
        Blueberry blue = new Blueberry(100);
        assertEquals(57.0, blue.getCalories(), 0.0001);
        assertEquals("Picking", blue.harvestBerry());
        assertTrue(blue instanceof Berry);
        assertTrue(blue instanceof Edible);
    }

    @Test
    public void test_WildBlueberry() {
        System.out.println("Testing WildBlueberry Class");
        WildBlueberry wblue = new WildBlueberry(100);
        assertEquals(35.0, wblue.getCalories(), 0.0001);
        assertTrue(wblue instanceof Berry);
        assertTrue(wblue instanceof Blueberry);
        assertTrue(wblue instanceof Edible);

        Cranberry cranny = new Cranberry(100);
        assertFalse((wblue.getColor().equals(cranny.getColor())));

    }

    @Test
    public void test_Winterberry() {
        System.out.println("Testing Winterberry Class");
        Winterberry winblue = new Winterberry();
        assertEquals("Branch Cutting", winblue.harvestBerry());
        assertTrue(winblue instanceof Berry);
        assertFalse(winblue instanceof Edible);
    }

    @Test
    public void test_StrawberryShortcake() {
        System.out.println("Testing StrawberryShortcake Class");
        StrawberryShortcake cake = new StrawberryShortcake();
        assertEquals(300, cake.getCalories(), 0.0001);
        assertTrue(cake instanceof Edible);
        assertFalse(Berry.class.isAssignableFrom(cake.getClass()) );
    }

    @Test
    public void test_Berry_equals() {
        System.out.println("Testing Berry Class equals method");

        WildBlueberry wblue = new WildBlueberry(100);
        WildBlueberry wblue2 = new WildBlueberry(32);
        Blueberry blue = new Blueberry(100);
        Cranberry cranny = new Cranberry(100);

        assertTrue(wblue.equals(blue));
        assertFalse(wblue.equals(cranny) );
        assertFalse(wblue.equals(wblue2) );
    }
}