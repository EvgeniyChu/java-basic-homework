package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class Bicycle implements Transport{
    @Override
    public boolean goForest(int distance) {
        System.out.println("Велосипед проехал по лесу " + distance);
        return true;
    }

    @Override
    public boolean goField(int distance) {
        System.out.println("Велосипед проехал по полю " + distance);
        return true;
    }

    @Override
    public boolean goSwamp(int distance) {
        System.out.println("Велосипед не умеет ездить по болоту");
        return false;
    }
}
