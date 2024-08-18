package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class Bicycle implements Movable{
    @Override
    public boolean move(Terrain terrain) {
        if (terrain.getName() == "Forest") {
            System.out.println("Велосипед проехал по лесу ");
            return true;
        }
        if (terrain.getName() == "Field") {
            System.out.println("Велосипед проехал по полю ");
            return true;
        }
        if (terrain.getName() == "Swamp") {
            System.out.println("Велосипед не умеет ездить по болоту");
            return false;
        }
        return false;
    }

}
