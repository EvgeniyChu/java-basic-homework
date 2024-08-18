package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class Car implements Movable {
    private int petrol;

    public Car(int petrol) {
        this.petrol = petrol;
    }

    @Override
    public boolean move(Terrain terrain) {
        if (terrain.getName() == "Forest") {
            if (this.petrol != 0 && (this.petrol - terrain.getDistance() / 30) >= 0) {
                System.out.println("Машина проехала по лесу " + terrain.getDistance());
                this.petrol -= terrain.getDistance() / 30;
                return true;
            }
            System.out.println("Кончился бензин");
            return false;
        }
        if (terrain.getName() == "Field") {
            if (this.petrol != 0 && (this.petrol - terrain.getDistance() / 20) >= 0) {
                System.out.println("Машина проехала по лесу " + terrain.getDistance());
                this.petrol -= terrain.getDistance() / 20;
                return true;
            }
            System.out.println("Кончился бензин");
            return false;
        }
        if (terrain.getName() == "Swamp") {
            if (this.petrol != 0 && (this.petrol - terrain.getDistance() / 100) >= 0) {
                System.out.println("Машина проехала по лесу " + terrain.getDistance());
                this.petrol -= terrain.getDistance() / 100;
                return true;
            }
            System.out.println("Кончился бензин");
            return false;
        }
        return false;
    }
}
