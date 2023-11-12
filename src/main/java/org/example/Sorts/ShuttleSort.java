package org.example.Sorts;

import org.example.ISort;

public class ShuttleSort implements ISort {
    @Override
    public int[] doSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i - 1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (array[z] < array[z - 1]) {
                        swap(array, z, z - 1);
                    } else {
                        break;
                    }
                }
            }
        }

        return array;
    }

    /**
     * Swap elements by index
     *
     * @param array - array
     * @param ind1 - first index (been swapped)
     * @param ind2 - second index (been swapped)
     */
    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
