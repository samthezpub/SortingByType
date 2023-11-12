package org.example;

import org.example.Sorts.BubbleSort;
import org.example.Sorts.SelectionSort;
import org.example.Sorts.ShuttleSort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        System.out.println("Выберите тип сортировки!");
        System.out.println("Пузырёк - 1");
        System.out.println("Выбором - 2");
        System.out.println("Челночная - 3");

//        Scanner scanner = new Scanner(System.in);

        Sorter sorter = new Sorter();
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        ShuttleSort shuttleSort = new ShuttleSort();
        sorter.setSortType(shuttleSort);

        int[] array = {56, 20, 32, 11, 67, 23, 83};
        System.out.println("Массив до сортировки: " + Arrays.toString(array));
        System.out.println("Массив после сортировки: " + Arrays.toString(sorter.executeSort(array)));
    }
}
