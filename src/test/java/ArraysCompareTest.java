import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraysCompareTest {

    @Test
    public void testSortArray_RandomArray(){
        int[] numbers = {12,7,3,9};
        int[] expected = {3,7,9,12};
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);  //assertArrayEquals
    }

    @Test(expected = NullPointerException.class)   // test exceptions / handling exceptions
    public void testSortArray_NullArray() {
        int[] numbers = null;
        int[] expected = {3, 7, 9, 12};
        Arrays.sort(numbers);
    }

    @Test(timeout = 60)               //timeout = 50 ms  required to excute
    public void testSortPerformance(){  // test performance
        int array[] = {12,23,4};
        for(int i=1; i<=100000; i++){
            array[0] = i;
            Arrays.sort(array);
        }

    }
}
