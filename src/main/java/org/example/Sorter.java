package org.example;


public class Sorter {
    private ISort sortType;

    /**
     * Execute sorting int [ ].
     *
     * @param array the array
     * @return the int [ ]
     */
    public int[] executeSort(int[] array) {
        return sortType.doSort(array);
    }

    public void setSortType(ISort sortType) {
        this.sortType = sortType;
    }
}
