package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class Swamp implements Terrain{
    private int distance;
    private String name;

    public Swamp(int distance) {
        this.distance = distance;
        this.name = "Swamp";
    }
@Override
    public String getName() {
        return name;
    }
@Override
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

}
