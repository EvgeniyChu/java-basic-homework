package ru.evgeniychurakov.java.basic.homeworks;


import ru.evgeniychurakov.java.basic.homeworks.lesson7.*;

public class MainApplication {
    public static void main(String[] args) {
        Human human = new Human("Vasily");
        Transport[] transports = {new Car(20), new ATV(100), new Horse(10), new Bicycle()};
        Terrain[] terrains = {new Forest(200), new Field(500), new Swamp(50), new Swamp(100)};

        for (Transport t : transports){
            for (Terrain ter : terrains){
                System.out.println(ter.go(t));
            }
        }





    }
}
