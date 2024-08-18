package ru.evgeniychurakov.java.basic.homeworks.lesson3;

public class Application {
    public static int sumOfPositiveElements(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void printSquare(int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i == 0 || j == 0 || i == size-1 || j == size-1){
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
    public static void nullifyDiagonals(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) {
                    arr[i][j] = 0;
                }

                }
            }
        }


    public static int findMax(int[][] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static int sumSecondRow(int[][] arr){
        int sum = 0;
        if (arr.length < 2){
            return -1;
        }
        for (int i = 0; i < arr[1].length; i++) {
            sum += arr[1][i];

            }

        return sum;
    }
}
