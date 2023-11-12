package org.example.Sorts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ShuttleSortTest {
    private static ShuttleSort shuttleSort = null;

    @BeforeAll
    public static void beforeAll(){
        shuttleSort = new ShuttleSort();
    }

    @Test
    public void doSort_mustReturnSortedArray__callable(){
        int[] array = {20, 10, 30, 5};

        int[] expected = {5, 10, 20, 30};

        int[] actual = shuttleSort.doSort(array);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void swap_mustSwapArrayIndexes__callable() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = ShuttleSort.class.getDeclaredMethod("swap", int[].class, int.class, int.class);
        method.setAccessible(true);

        int[] array = {20, 10, 30, 5};


        int[] expected = {10, 20, 30, 5};
        method.invoke(shuttleSort, array, 0,1);
        int[] actual = array.clone();


        Assertions.assertArrayEquals(expected,actual);
    }
}
