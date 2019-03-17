package cisc181.Lab_4;

import static org.junit.Assert.*;
import org.junit.Test;

public class ExactNumberTest {

    @Test
    public void test_doubleValue() {
        System.out.println("Testing doubleValue method");
        ExactNumber threesevenfive = new ExactNumber(3, 7500000000000000L);
        assertEquals(3.75, threesevenfive.doubleValue(), 0.00000001);
    }

 @Test
 public void test_toString() {
 System.out.println("Testing toString() override");
 ExactNumber threesevenfive = new ExactNumber(3, 7500000000000000L);
 ExactNumber ten = new ExactNumber(10, 0);
 ExactNumber thirteensevenfive = new ExactNumber(13, 7500000000000000L);
 ExactNumber sevenfifty = new ExactNumber(7, 5000000000000000L);
 assertEquals(threesevenfive.toString(), Double.toString(3.75));
 assertEquals(ten.toString(), Double.toString(10.0));
 assertEquals(sevenfifty.toString(), Double.toString(7.50));
 }

 @Test
 public void test_equals() {
 System.out.println("Testing equals() override");
 ExactNumber threesevenfive = new ExactNumber(3, 7500000000000000L);
 ExactNumber threesevenfive_andalittlebit = new ExactNumber(3, 7500000000000001L);
 ExactNumber threesevenfive_dupe = new ExactNumber(3, 7500000000000000L);
 assertEquals(threesevenfive.equals(threesevenfive_andalittlebit), false);
 assertEquals(threesevenfive.equals(threesevenfive_dupe), true);
 }

 @Test
 public void test_compareTo() {
 System.out.println("Testing compareTo() override");
 ExactNumber threesevenfive = new ExactNumber(3, 7500000000000000L);
 ExactNumber threesevenfive_andalittlebit = new ExactNumber(3, 7500000000000001L);
 ExactNumber threesevenfive_dupe = new ExactNumber(3, 7500000000000000L);
 ExactNumber ten = new ExactNumber(10, 0);
 assertEquals(threesevenfive.compareTo(threesevenfive), 0);
 assertEquals(threesevenfive.compareTo(threesevenfive_dupe), 0);
 assertEquals(threesevenfive.compareTo(threesevenfive_andalittlebit), -1);
 assertEquals(threesevenfive_andalittlebit.compareTo(threesevenfive), 1);
 assertEquals(threesevenfive.compareTo(ten), -1);
 assertEquals(ten.compareTo(threesevenfive), 1);
 }

 @Test
 public void test_add() {
 System.out.println("Testing add method");
 ExactNumber threesevenfive = new ExactNumber(3, 7500000000000000L);
 ExactNumber thirteensevenfive = new ExactNumber(13, 7500000000000000L);
 ExactNumber sevenfifty = new ExactNumber(7, 5000000000000000L);
 ExactNumber ten = new ExactNumber(10, 0);
 assertEquals(threesevenfive.add(ten).equals(thirteensevenfive),true);
 assertEquals(threesevenfive.add(threesevenfive).equals(sevenfifty),true);
 }
}






