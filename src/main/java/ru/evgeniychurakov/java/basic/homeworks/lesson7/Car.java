package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class Car implements Transport{
    private int petrol;

    public Car(int petrol) {
        this.petrol = petrol;
    }

    @Override
    public boolean goForest(int distance) {
        if (this.petrol != 0 && (this.petrol - distance/30) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean goField(int distance) {
        if (this.petrol != 0 && (this.petrol - distance/20) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean goSwamp(int distance) {
        if (this.petrol != 0 && (this.petrol - distance/100) >= 0) {
            return true;
        }
        return false;
    }
}
