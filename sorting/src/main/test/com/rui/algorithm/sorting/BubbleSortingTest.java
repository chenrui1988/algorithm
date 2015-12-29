package com.rui.algorithm.sorting;

import org.junit.Test;

public class BubbleSortingTest {

    @Test
    public void testBubbleSorting() {
        BubbleSorting bubbleSorting = new BubbleSorting();

        Integer[] array = {12, 14, 56, 34, 28};
        array = bubbleSorting.sort(array);
        for (Integer number : array) {
            System.out.print(number + " ");
        }

        Integer[] array2 = {56, 12, 14, 56, 34, 28};
        array2 = bubbleSorting.sort(array2);
        for (Integer number : array2) {
            System.out.print(number + " ");
        }
    }
}
