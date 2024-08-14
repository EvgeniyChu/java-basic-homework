package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class Field implements Terrain{
    private int distance;

    public Field(int distance) {
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
        return transport.goField(distance);
    }
}
