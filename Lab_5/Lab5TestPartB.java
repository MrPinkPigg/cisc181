package cisc181.Lab_5;
import java.util.Arrays;


import org.junit.Test;
import static org.junit.Assert.*;

public class Lab5TestPartB {

    @Test
    public void test_mean() {
        System.out.println("Testing mean");
        assertEquals(3.11, ArrayStaticMethods.mean(new double[]{1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2}), 0.01);
        assertEquals(3, ArrayStaticMethods.mean(new double[]{1, 5}), 0.01);
        assertEquals(1, ArrayStaticMethods.mean(new double[]{1}), 0.01);
        //add a test with negative numbers
        assertEquals(-3, ArrayStaticMethods.mean(new double[]{-1, -2, -3, -4, -5}), .01);
        }

    @Test
    public void test_countM() {
        System.out.println("Testing countM");
        assertEquals(0, ArrayStaticMethods.countM("The quick brown fox leaps over the lazy dog.".toCharArray()));
        assertEquals(7, ArrayStaticMethods.countM("My mother came home from Alabama on Monday".toCharArray()));
        assertEquals(1, ArrayStaticMethods.countM("Spring Break is almost here.".toCharArray()));
        // add another test case
        assertEquals(5, ArrayStaticMethods.countM("mmAAAHAAHHHHMYMaausebfiuM".toCharArray()));
    }

    @Test
    public void test_replace() {
        System.out.println("Testing replace");
        assertArrayEquals(new int[]{1, 6, 6, 1}, ArrayStaticMethods.replace(new int[]{1, 0, 0, 1}, 0, 6));
        assertArrayEquals(new int[]{5, 5, 5, 5}, ArrayStaticMethods.replace(new int[]{5, 0, 0, 5}, 0, 5));
        assertArrayEquals(new int[]{}, ArrayStaticMethods.replace(new int[]{}, 0, 5));
        assertArrayEquals(new int[]{1, 2, 3, 4}, ArrayStaticMethods.replace(new int[]{1, 2, 3, 4},5, 1));

    }

    @Test
    public void test_padZeros() {
        System.out.println("Testing padZeros");
        assertArrayEquals(new int[]{0, 0, 1, 1}, ArrayStaticMethods.padZeros(new int[]{1, 0, 0, 1}));
        assertArrayEquals(new int[]{0, 0, 0, 2, 4}, ArrayStaticMethods.padZeros(new int[]{0, 2, 0, 4, 0}));
        assertArrayEquals(new int[]{1}, ArrayStaticMethods.padZeros(new int[]{1}));
        assertArrayEquals(new int[]{}, ArrayStaticMethods.padZeros(new int[]{}));
        assertArrayEquals(new int[]{0, 0, 0}, ArrayStaticMethods.padZeros(new int[]{0, 0, 0}));
        assertArrayEquals(new int[]{1, 2, 3}, ArrayStaticMethods.padZeros(new int[]{1, 2, 3}));
    }
}
