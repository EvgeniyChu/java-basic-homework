package ru.evgeniychurakov.java.basic.homeworks;


import ru.evgeniychurakov.java.basic.homeworks.lesson7.*;

public class MainApplication {
    public static void main(String[] args) {
       Movable[] transports = {new Horse(10), new ATV(100), new Car(50), new Bicycle()};
        Terrain forest = new Forest(200);
        Terrain field= new Field(500);
        Terrain swamp = new Swamp(50);

        Human[] humans = {new Human("Vasily"),new Human("Roman"),
                new Human("Michael"),new Human("George")};
        for (int i = 0; i < 4; i++) {
            humans[i].getIntoTransport(transports[i]);
            humans[i].move(forest);
            humans[i].move(field);
            humans[i].move(swamp);

        }




    }
}
