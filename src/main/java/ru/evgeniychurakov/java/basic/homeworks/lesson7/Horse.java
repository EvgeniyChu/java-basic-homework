package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class Horse implements Transport{
    private int power;

    public Horse(int power) {
        this.power = power;
    }

    @Override
    public boolean goForest(int distance) {
        if (this.power != 0 && (this.power - distance/100) >= 0) {
            System.out.println("Лошадь проскакала по лесу " + distance);
            this.power -= distance/100;
            return true;
        }
        System.out.println("Сил не хватило");
        return false;
    }

    @Override
    public boolean goField(int distance) {
        if (this.power != 0 && (this.power - distance/200) >= 0) {
            System.out.println("Лошадь проскакала по полю " + distance);
            this.power -= distance/200;
            return true;
        }
        System.out.println("Сил не хватило");
        return false;
    }

    @Override
    public boolean goSwamp(int distance) {
        System.out.println("Лошадь не умеет скакать по болоту");
        return false;
    }
}
