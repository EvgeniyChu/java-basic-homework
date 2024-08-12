package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class Human {
    private String name;

    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public void getIntoTransport(Transport transport) {
        this.currentTransport = transport;
        System.out.println("Текущий транспорт " + this.currentTransport);
    }

    public void getOutOfTransport() {
        this.currentTransport = null;
        System.out.println("Человек вышел из транспорта");
    }
    public boolean goForest(Transport transport, int distance) {
        if (this.currentTransport != null) {
            transport.goForest(distance);
        } else {
            System.out.println("Человек пошел пешком по лесу");
            return true;
        }
        return false;
    }
    public boolean goField(Transport transport, int distance) {
        if (this.currentTransport != null) {
            transport.goField(distance);
        } else {
            System.out.println("Человек пошел пешком по полю");
            return true;
        }
        return false;
    }
    public boolean goSwamp(Transport transport, int distance) {
        if (this.currentTransport != null) {
            transport.goSwamp(distance);
        } else {
            System.out.println("Человек пошел пешком по болоту");
            return true;
        }
        return false;
    }
}
