package ru.evgeniychurakov.java.basic.homeworks;


import ru.evgeniychurakov.java.basic.homeworks.lesson6.*;

public class MainApplication {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cats = {new Cat("Pushok", 20),
        new Cat("Sema", 30),
        new Cat("Stepan", 10),
        new Cat("Snezhok",15),
        new Cat("Korzhik",100)};
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            plate.info();
            cats[i].info();
        }








    }
}
