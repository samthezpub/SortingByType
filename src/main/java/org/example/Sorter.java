package org.example;


public class Sorter {
    private ISort sortType;

    public int[] executeSort(int[] array) {
        return sortType.doSort(array);
    }

    public void setSortType(ISort sortType) {
        this.sortType = sortType;
    }
}
