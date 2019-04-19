package cisc181.Lab_6;

import org.junit.Test;
import static org.junit.Assert.*;


public class TrainTest {

    @Test
    public void test_Train() {

        System.out.println("Testing Train");

        Train cargoTrain = new Train();

        cargoTrain.attachAtFront("coal");
       assertEquals(cargoTrain.getHeadCargo().equals("coal"),true);

        cargoTrain.attachAtFront("bananas");
        assertEquals(cargoTrain.getHeadCargo().equals("bananas"),true);

        cargoTrain.attachAtEnd("lumber");
        cargoTrain.attachAtEnd("apples");


        assertEquals(cargoTrain.removeFromFront().equals("bananas"),true);
        assertEquals(cargoTrain.removeFromFront().equals("coal"),true);


        //6 new tests
        cargoTrain.attachAtFront("fish");
        assertEquals(cargoTrain.getHeadCargo().equals("fish"),true);

        cargoTrain.attachAtFront("oranges");
        assertEquals(cargoTrain.getHeadCargo().equals("oranges"),true);

        cargoTrain.attachAtEnd("footballs");
        cargoTrain.attachAtEnd("oil");

        assertEquals(cargoTrain.removeFromFront().equals("oranges"),true);
        assertEquals(cargoTrain.removeFromFront().equals("fish"),true);

        cargoTrain.attachAtFront("carrots");
        assertEquals(cargoTrain.getHeadCargo().equals("carrots"),true);

        cargoTrain.attachAtEnd("emeralds");
        assertEquals(cargoTrain.removeFromFront().equals("carrots"),true);
    }

}