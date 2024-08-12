package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class Horse implements Transport{
    private int power;

    public Horse(int power) {
        this.power = power;
    }

    @Override
    public boolean goForest(int distance) {
        if (this.power != 0 && (this.power - distance/100) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean goField(int distance) {
        if (this.power != 0 && (this.power - distance/200) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean goSwamp(int distance) {
        return false;
    }
}
