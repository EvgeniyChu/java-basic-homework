package ru.evgeniychurakov.java.basic.homeworks;


import static ru.evgeniychurakov.java.basic.homeworks.lesson2.Application.*;

public class MainApplication {
    public static void main(String[] args) {
        printSomethingSometimes(2,"Hello");

        sumElementsOfArrayMoreFive(1,2,3,4,5,6,7,8,9,10);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        fillArrayByDigit(3,arr);

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        increaseArrayByDigit(2,arr1);

        calculateWhatHalfMore(1,2,3,4,5,6,7,8,9,10);


    }
}
