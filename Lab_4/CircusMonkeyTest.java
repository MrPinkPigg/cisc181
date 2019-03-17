package cisc181.Lab_4;

import static org.junit.Assert.*;
import org.junit.Test;

public class CircusMonkeyTest {

    @Test
    public void testingCircusMonkey1() {
        System.out.println("Testing Circus Monkey Constructors and getters");
        // Create an instance of the CircusMonkey class that has an apple
        CircusMonkey mickey = new CircusMonkey("Mickey", "brown", 4, "apple", "red");

        assertEquals(mickey.getName(), "Mickey");
        assertEquals(mickey.getAge(), 4);
        assertEquals(mickey.getFurColor(), "brown");
        assertEquals(mickey.getSnack().getColor(),"red");
        assertEquals(mickey.getSnack().getFruitType(),"apple");

        // Create an instance of the CircusMonkey class
        CircusMonkey bongo = new CircusMonkey("Bongo", "white", 3);

        assertEquals(bongo.getName(), "Bongo");
        assertEquals(bongo.getAge(), 3);
        assertEquals(bongo.getFurColor(), "white");
        assertEquals(bongo.getSnack().getColor(),"yellow");
        assertEquals(bongo.getSnack().getFruitType(),"banana");

        // Test toString
        assertEquals(mickey.toString(),"Monkey named Mickey with brown fur and a red apple");
    }

    @Test
    public void testingThrowCatch() {
        System.out.println("Testing Circus Monkey throw and catch");
        // Create an instance of the CircusMonkey class that has an apple
        CircusMonkey mickey = new CircusMonkey("Mickey", "brown", 4, "apple", "red");
        // Create an instance of the CircusMonkey class that has an banana
        CircusMonkey bongo = new CircusMonkey("Bongo", "white", 3);

        Fruit mickeysApple = mickey.getSnack();
        Fruit bongosBanana = bongo.getSnack();

        System.out.println(mickey);
        System.out.println(bongo);

        // mickey throws his snack
        assertEquals(mickey.throwFruit(),mickeysApple);
        // mickey should not have an apple now
        assertNull(mickey.getSnack());
        // mickey should catch the banana
        assertTrue(mickey.catchFruit(bongosBanana));
        assertEquals(mickey.getSnack(),bongosBanana);
        // if mickey has a banana it should NOT catch the apple
        assertFalse(mickey.catchFruit(mickeysApple));
        assertEquals(mickey.getSnack(),bongosBanana);

        System.out.println(mickey);
    }

    @Test
    public void testingPlayCatch() {
        System.out.println("Testing Circus Monkey playCatch");
        // Create an instance of the CircusMonkey class that has an apple
        CircusMonkey mickey = new CircusMonkey("Mickey", "brown", 4, "apple", "red");
        // Create an instance of the CircusMonkey class that has an banana
        CircusMonkey bongo = new CircusMonkey("Bongo", "white", 3);

        Fruit mickeysApple = mickey.getSnack();
        Fruit bongosBanana = bongo.getSnack();

        System.out.println(mickey);
        System.out.println(bongo);

        // These monkeys should not play catch since they are not friends
        System.out.println("Trying to Play Catch");
        assertFalse(mickey.playCatch(mickey, bongo));
        assertTrue(mickey.getSnack() == mickeysApple);
        assertTrue(bongo.getSnack() == bongosBanana);

       // Set mickey's friend
        mickey.setFriend(bongo);
        // These monkeys should not play catch since Bongo does not have friend set
        System.out.println("Trying to Play Catch");
        assertFalse(mickey.playCatch(mickey, bongo));
        assertTrue(mickey.getSnack() == mickeysApple);
        assertTrue(bongo.getSnack() == bongosBanana);

        // Set bongo's friend
        bongo.setFriend(mickey);
        //should switch the fruit objects - not just the name and color of the fruit
        System.out.println("Playing Catch");
        assertTrue(mickey.playCatch(mickey, bongo));
        assertTrue(mickey.getSnack() == bongosBanana);
        assertFalse(mickey.getSnack() == mickeysApple);
        assertTrue(bongo.getSnack() == mickeysApple);
        assertFalse(bongo.getSnack() == bongosBanana);

        System.out.println(mickey);
        System.out.println(bongo);
    }
}