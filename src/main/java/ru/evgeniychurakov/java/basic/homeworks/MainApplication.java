package ru.evgeniychurakov.java.basic.homeworks;

import ru.evgeniychurakov.java.basic.homeworks.lesson15.*;

public class MainApplication {
    public static void main(String[] args) {
        // Коробка для яблок
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        // Коробка для апельсинов
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        // Коробка для смешанных фруктов
        Box<Fruit> mixedBox = new Box<>();
        mixedBox.addFruit(new Apple());
        mixedBox.addFruit(new Orange());

        // Вывод весов коробок
        System.out.println("Вес коробки с яблоками: " + appleBox.weight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.weight());
        System.out.println("Вес смешанной коробки: " + mixedBox.weight());

        // Сравнение коробок
        System.out.println("Коробки с яблоками и апельсинами равного веса: " + appleBox.compare(orangeBox));

        // Пересыпание фруктов
        appleBox.moveFruitsInto(mixedBox);
        System.out.println("Вес смешанной коробки после пересыпания: " + mixedBox.weight());
    }
}