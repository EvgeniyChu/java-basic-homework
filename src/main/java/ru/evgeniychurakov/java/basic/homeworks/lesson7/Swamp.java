package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class Swamp implements Terrain{
    private int distance;

    public Swamp(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean go(Transport transport) {
        return transport.goSwamp(distance);
    }
}
