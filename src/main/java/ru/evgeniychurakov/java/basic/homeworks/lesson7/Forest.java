package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class Forest implements Terrain {
    private int distance;
    private String name;

    public Forest(int distance) {
        this.distance = distance;
        this.name = "Forest";
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