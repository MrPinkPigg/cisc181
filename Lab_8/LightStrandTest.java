package cisc181.Lab_8;

import org.junit.Test;
import static org.junit.Assert.*;


public class LightStrandTest {

    @Test
    public void test_isWorking() {
        System.out.println("Testing isWorking with Recursion");
        // one LightStrand in the List
        LightStrand myLights = new LightStrand(10, false, null);
        assertEquals(myLights.isWorking(myLights),false);

        // one LightStrand in the List
        myLights = new LightStrand(10, true, null);
        assertEquals(myLights.isWorking(myLights),true);

        // more LightStrands in the List
        myLights = new LightStrand(30, true, myLights);
        myLights = new LightStrand(60, true, myLights);
        myLights = new LightStrand(20, true, myLights);
        assertEquals(myLights.isWorking(myLights),true);

        myLights = new LightStrand(20, false, myLights);
        assertEquals(myLights.isWorking(myLights),false);

    }
}