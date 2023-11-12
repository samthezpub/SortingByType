package org.example.Sorts;

import org.example.ISort;

public class BubbleSort implements ISort {
    @Override
    public int[] doSort(int[] array) {
        boolean isSorted = false;

        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        return array;
    }
}
