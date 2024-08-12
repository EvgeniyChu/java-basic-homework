package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class ATV implements Transport{
    private int petrol;

    public ATV(int petrol) {
        this.petrol = petrol;
    }

    @Override
    public boolean goForest(int distance) {
        if (this.petrol != 0 && (this.petrol - distance/100) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean goField(int distance) {
        if (this.petrol != 0 && (this.petrol - distance/50) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean goSwamp(int distance) {
        if (this.petrol != 0 && (this.petrol - distance/200) >= 0) {
            return true;
        }
        return false;
    }
}
