package ru.evgeniychurakov.java.basic.homeworks;


import ru.evgeniychurakov.java.basic.homeworks.lesson5.*;

public class MainApplication {
    public static void main(String[] args) {

        Cat cat = new Cat("Pushok", 10, 1000);
        Dog dog = new Dog("Barbos", 20, 10, 2000);
        Horse horse = new Horse("Slevin", 40, 15, 5000);

        cat.info();
        dog.info();
        horse.info();

        cat.run(500);
        cat.run(500);
        cat.swim(1);
        cat.run(1);

        dog.run(500);
        dog.run(500);
        dog.swim(500);
        dog.run(1);

        horse.run(3000);
        horse.swim(500);
        horse.swim(1);

        cat.info();
        dog.info();
        horse.info();




    }
}
