package cisc181.Lab_3;

import org.junit.Test;
import static org.junit.Assert.*;

public class DogWithFleaTest {
    @Test
    public void testingInheritance() {
        System.out.println("Testing DogWithFlea class");

        // Testing whether DogWithFlea is derived from Dog class
        // instances of DogWithFlea ARE also instances of Dog
        // First use zero parameter constructor
        DogWithFlea scratchy = new DogWithFlea();
        assertTrue(scratchy instanceof Dog);
        assertEquals("Spot", scratchy.getName());
        assertEquals("brown", scratchy.getFurColor());

        // using two parameter constructor
        DogWithFlea cliff = new DogWithFlea("Clifford", "red");
        assertTrue(cliff instanceof Dog);
        assertEquals("Clifford", cliff.getName());
        assertEquals("red", cliff.getFurColor());

        // Initially dog should not have a flea bite
        assertFalse(cliff.getFleaBite());

        // Testing setFleaBite
        cliff.setNewFleaBite(true);
        assertTrue(cliff.getFleaBite());

        // Testing the getFlea method
        assertTrue(cliff.getFlea() instanceof Flea);
    }
    /*
    @Test
    public void testingFlea(){
        DogWithFlea scratchy = new DogWithFlea();
        assertEquals("Spot", scratchy.getName());
        assertEquals("brown", scratchy.getFurColor());

        // Testing biteOwner method
        assertFalse(scratchy.hasNewFleaBite());

        // For the flea to bite the dog - call the dog object's getFlea
        // method which returns a flea
        // then call the flea's biteOwner method
        scratchy.getFlea().biteOwner();
        assertTrue(scratchy.hasNewFleaBite());
    }
    */
    /*
    @Test
    public void testingSleepAndWag() {
        System.out.println("Testing DogWithFlea sleep and wagTail methods");

        DogWithFlea cliff = new DogWithFlea("Clifford", "red");
        assertEquals("Clifford", cliff.getName());
        assertEquals("red", cliff.getFurColor());

        // For the flea to bite the dog - call the dog object's getFlea
        // method which returns a flea
        // then call the flea's biteOwner method
        System.out.println("Testing that flea bites dog");
        cliff.getFlea().biteOwner();
        assertTrue(cliff.hasNewFleaBite());

        // test that scratch gets rid of the flea bite
        System.out.println("Testing that scratching gets rid of flea bite");
        assertEquals(cliff.scratch(), "scratching");
        assertFalse(cliff.hasNewFleaBite());
        assertEquals(cliff.scratch(), "");


        // first test sleep
        System.out.println("Testing sleep with no flea bite");
        assertEquals(cliff.sleep(), "zzz");

        // test that dog doesn't sleep until gets rid of flea bite
        System.out.println("Testing sleep with a flea bite");
        cliff.getFlea().biteOwner();
        assertEquals(cliff.sleep(), "scratching zzz");
        assertFalse(cliff.hasNewFleaBite());
        assertEquals(cliff.sleep(), "zzz");

        // test that dog doesn't wag its tail until gets rid of flea bite
        System.out.println("Testing wagTail with a flea bite");
        cliff.getFlea().biteOwner();
        assertEquals(cliff.wagTail(), "scratching wagging tail");
        assertFalse(cliff.hasNewFleaBite());
        assertEquals(cliff.wagTail(), "wagging tail");
    }
    */
    /*

    @Test
    public void testingToString() {
        System.out.println("Testing toString methods");

        DogWithFlea bob = new DogWithFlea("Bob", "black");
        assertEquals(bob.toString(), "Bob with black fur and a flea");

        Dog puppy = new Dog("Pups", "spotted");
        assertEquals(puppy.toString(), "Pups with spotted fur");
    }
    */
}