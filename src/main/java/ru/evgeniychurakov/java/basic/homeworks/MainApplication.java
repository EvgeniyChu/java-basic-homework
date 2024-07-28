package ru.evgeniychurakov.java.basic.homeworks;


import java.util.Arrays;

import static ru.evgeniychurakov.java.basic.homeworks.lesson3.Application.*;

public class MainApplication {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        System.out.println(sumOfPositiveElements(arr));

        printSquare(9);

        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        nullifyDiagonals(arr1);
        System.out.println(Arrays.deepToString(arr1));

        int[][] arr2 = {{1,2,3},{4,5,6},{7,100,9}};
        System.out.println(findMax(arr2));

        System.out.println(sumSecondRow(arr2));


    }
}
