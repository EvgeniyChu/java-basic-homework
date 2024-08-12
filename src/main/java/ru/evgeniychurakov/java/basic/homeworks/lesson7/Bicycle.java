package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class Bicycle implements Transport{
    @Override
    public boolean goForest(int distance) {
        return true;
    }

    @Override
    public boolean goField(int distance) {
        return true;
    }

    @Override
    public boolean goSwamp(int distance) {
        return false;
    }
}
