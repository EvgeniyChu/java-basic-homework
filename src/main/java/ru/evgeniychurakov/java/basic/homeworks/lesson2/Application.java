package ru.evgeniychurakov.java.basic.homeworks.lesson2;

import java.util.Arrays;

public class Application {
    public static void printSomethingSometimes(int n, String s){
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    public static void sumElementsOfArrayMoreFive(int... arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillArrayByDigit(int n, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=n;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void increaseArrayByDigit(int n, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+n;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void calculateWhatHalfMore(int... arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < (arr.length/2); i++) {
            sum1 += arr[i];
        }
        for (int i = (arr.length/2); i < arr.length ; i++) {
            sum2 += arr[i];
        }
        if (sum1 > sum2) {
            System.out.println("Первая половина больше");
        } else {
            System.out.println("Вторая половина больше");
        }
    }


}
