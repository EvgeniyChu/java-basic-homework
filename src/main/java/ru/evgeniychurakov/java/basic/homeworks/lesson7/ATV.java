package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class ATV implements Transport{
    private int petrol;

    public ATV(int petrol) {
        this.petrol = petrol;
    }

    @Override
    public boolean goForest(int distance) {
        if (this.petrol != 0 && (this.petrol - distance/100) >= 0) {
            System.out.println("Вездеход проехал по лесу " + distance);
            this.petrol -= distance/100;
            return true;
        }
        System.out.println("Кончился бензин");
        return false;
    }

    @Override
    public boolean goField(int distance) {
        if (this.petrol != 0 && (this.petrol - distance/50) >= 0) {
            System.out.println("Вездеход проехал по полю " + distance);
            this.petrol -= distance/50;
            return true;
        }
        System.out.println("Кончился бензин");
        return false;
    }

    @Override
    public boolean goSwamp(int distance) {
        if (this.petrol != 0 && (this.petrol - distance/200) >= 0) {
            System.out.println("Вездеход проехал по болоту " + distance);
            this.petrol -= distance/200;
            return true;
        }
        System.out.println("Кончился бензин");
        return false;
    }
}
