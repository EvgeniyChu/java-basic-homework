package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class Human {
    private String name;

    private Movable currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public void getIntoTransport(Movable transport) {
        this.currentTransport = transport;
    }

    public void getOutOfTransport() {
        this.currentTransport = null;
        System.out.println("Человек вышел из транспорта");
    }

    public boolean move(Terrain terrain) {
        if (terrain.getName() == "Forest") {
            if (this.currentTransport != null) {
                this.currentTransport.move(terrain);
            } else {
                System.out.println("Человек пошел пешком по лесу");
                return true;
            }
            return false;
        }
        if (terrain.getName() == "Field") {
            if (this.currentTransport != null) {
                this.currentTransport.move(terrain);
            } else {
                System.out.println("Человек пошел пешком по полю");
                return true;
            }
            return false;
        }
        if (terrain.getName() == "Swamp") {
            if (this.currentTransport != null) {
                this.currentTransport.move(terrain);
            } else {
                System.out.println("Человек пошел пешком по болоту");
                return true;
            }
            return false;
        }
        return false;
    }
}

