package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class Forest implements Terrain {
    private int distance;

    public Forest(int distance) {
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
        return transport.goForest(distance);
    }
}