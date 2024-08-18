package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class Field implements Terrain{
    private int distance;
    private String name;

    public Field(int distance) {
        this.distance = distance;
        this.name = "Field";
    }
@Override
    public int getDistance() {
        return distance;
    }
    @Override
    public String getName() {
        return name;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

}
