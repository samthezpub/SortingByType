package org.example.Sorts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {
    private static SelectionSort selectionSort = null;

    @BeforeAll
    public static void beforeAll(){
        selectionSort = new SelectionSort();
    }

    @Test
    public void doSort_mustReturnSortedArray__callable(){
        int[] array = {20, 10, 30, 5};

        int[] expected = {5, 10, 20, 30};

        int[] actual = selectionSort.doSort(array);

        Assertions.assertArrayEquals(expected, actual);
    }
}
