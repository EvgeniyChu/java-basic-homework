package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class Horse implements Movable{
    private int power;

    public Horse(int power) {
        this.power = power;
    }

    @Override
    public boolean move(Terrain terrain) {
        if (terrain.getName() == "Forest") {
            if (this.power != 0 && (this.power - terrain.getDistance() / 100) >= 0) {
                System.out.println("Лошадь проскакала по лесу " + terrain.getDistance());
                this.power -= terrain.getDistance() / 100;
                return true;
            }
            System.out.println("Сил не хватило");
            return false;
        }
        if (terrain.getName() == "Field") {
            if (this.power != 0 && (this.power - terrain.getDistance() / 200) >= 0) {
                System.out.println("Лошадь проскакала по лесу " + terrain.getDistance());
                this.power -= terrain.getDistance() / 200;
                return true;
            }
            System.out.println("Сил не хватило");
            return false;
        }
        if (terrain.getName() == "Swamp") {
            System.out.println("Лошадь не умеет скакать по болоту");
            return false;
        }
        return false;
    }
}
