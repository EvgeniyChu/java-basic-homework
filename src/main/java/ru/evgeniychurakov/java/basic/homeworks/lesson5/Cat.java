package ru.evgeniychurakov.java.basic.homeworks.lesson5;

public class Cat extends Animal {
    public Cat(String name, int runSpeed, int endurance) {
        super(name, runSpeed, endurance);
    }


    @Override
    public int swim(int distance) {
        System.out.println("Коты плавать не умеют");
        return 0;
    }

}