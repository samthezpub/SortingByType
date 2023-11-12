package org.example;

import org.example.Sorts.BubbleSort;
import org.example.Sorts.SelectionSort;
import org.example.Sorts.ShuttleSort;

import java.lang.reflect.Type;
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

        Scanner scanner = new Scanner(System.in);

        ISort sortType = null;


        boolean isWrongAnswer = false;
        do {
            int userChoose = scanner.nextInt();
            switch (userChoose){
                case 1:
                    sortType = new BubbleSort();

                    isWrongAnswer = false;
                    break;
                case 2:
                    sortType = new SelectionSort();

                    isWrongAnswer = false;
                    break;
                case 3:
                    sortType = new ShuttleSort();

                    isWrongAnswer = false;
                    break;
                default:
                    System.out.println("Вы ввели неправильный вариант");
                    System.out.println("Выберите тип сортировки!");
                    System.out.println("Пузырёк - 1");
                    System.out.println("Выбором - 2");
                    System.out.println("Челночная - 3");

                    isWrongAnswer = true;
            }
        }while (isWrongAnswer);


        Sorter sorter = new Sorter();
        sorter.setSortType(sortType);

        int[] array = {56, 20, 32, 11, 67, 23, 83};
        System.out.println("Массив до сортировки: " + Arrays.toString(array));
        System.out.println("Массив после сортировки: " + Arrays.toString(sorter.executeSort(array)));
    }
}
