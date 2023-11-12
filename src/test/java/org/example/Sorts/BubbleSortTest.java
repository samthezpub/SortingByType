package org.example.Sorts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    private static BubbleSort bubbleSort = null;

    @BeforeAll
    public static void beforeAll(){
        bubbleSort = new BubbleSort();
    }

    @Test
    public void doSort_mustReturnSortedArray__callable(){
        int[] array = {20, 10, 30, 5};

        int[] expected = {5, 10, 20, 30};

        int[] actual = bubbleSort.doSort(array);

        Assertions.assertArrayEquals(expected, actual);
    }
}
