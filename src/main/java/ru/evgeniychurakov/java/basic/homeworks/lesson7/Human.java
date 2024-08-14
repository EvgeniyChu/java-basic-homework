package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class Human {
    private String name;

    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public void getIntoTransport(Transport transport) {
        this.currentTransport = transport;
    }

    public void getOutOfTransport() {
        this.currentTransport = null;
        System.out.println("Человек вышел из транспорта");
    }
    public boolean goForest(int distance) {
        if (this.currentTransport != null) {
            this.currentTransport.goForest(distance);
        } else {
            System.out.println("Человек пошел пешком по лесу");
            return true;
        }
        return false;
    }
    public boolean goField(int distance) {
        if (this.currentTransport != null) {
            this.currentTransport.goField(distance);
        } else {
            System.out.println("Человек пошел пешком по полю");
            return true;
        }
        return false;
    }
    public boolean goSwamp(int distance) {
        if (this.currentTransport != null) {
            this.currentTransport.goSwamp(distance);
        } else {
            System.out.println("Человек пошел пешком по болоту");
            return true;
        }
        return false;
    }
}
