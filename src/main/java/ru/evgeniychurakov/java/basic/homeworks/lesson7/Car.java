package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class Car implements Transport{
    private int petrol;

    public Car(int petrol) {
        this.petrol = petrol;
    }

    @Override
    public boolean goForest(int distance) {
        if (this.petrol != 0 && (this.petrol - distance/30) >= 0) {
            System.out.println("Машина проехала по лесу " + distance);
            this.petrol -= distance/30;
            return true;
        }
        System.out.println("Кончился бензин");
        return false;
    }

    @Override
    public boolean goField(int distance) {
        if (this.petrol != 0 && (this.petrol - distance/20) >= 0) {
            System.out.println("Машина проехала по полю " + distance);
            this.petrol -= distance/20;
            return true;
        }
        System.out.println("Кончился бензин");
        return false;
    }

    @Override
    public boolean goSwamp(int distance) {
        if (this.petrol != 0 && (this.petrol - distance/100) >= 0) {
            System.out.println("Машина проехала по болоту " + distance);
            this.petrol -= distance/100;
            return true;
        }
        System.out.println("Кончился бензин");
        return false;
    }
}
