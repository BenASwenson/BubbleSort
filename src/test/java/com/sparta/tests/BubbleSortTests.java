package com.sparta.tests;

import com.sparta.BubbleSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTests {

    @Test
    @DisplayName("Given an array with integers 10,9,8,7,6,5,4,3,2,1 Returns array 1,2,3,4,5,6,7,8,9,10")
    public void bubbleSortWithInputArrayOfIntegers10987654321_Returns12345678910() {
        BubbleSort sort = new BubbleSort();
        int[] expected = {1,2,3,4,5,6,7,8,9,10};
        int[] actual = sort.bubbleSort(new int[] {10,9,8,7,6,5,4,3,2,1});
        assertArrayEquals(expected, actual);

    }

    @Test
    @DisplayName("Given an array with integers 50,40,30,20,10 Returns array 10,20,30,40,50")
    public void bubbleSortWithInputArrayOfIntegers5040302010_Returns1020304050() {
        BubbleSort sort = new BubbleSort();
        int[] expected = {10,20,30,40,50};
        int[] actual = sort.bubbleSort(new int[] {50,40,30,20,10});
        assertArrayEquals(expected, actual);

    }
}
