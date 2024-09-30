package ru.evgeniychurakov.java.basic.homeworks.lesson14;

public class Application {
    public static void fillArray(){
        Double[] array = new Double[100_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
}
