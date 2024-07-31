package ru.evgeniychurakov.java.basic.homeworks;


import ru.evgeniychurakov.java.basic.homeworks.lesson4.Box;
import ru.evgeniychurakov.java.basic.homeworks.lesson4.User;

public class MainApplication {
    public static void main(String[] args) {

        User[] users = {new User("Петр", "Иванов", "Иванович", 1996, "ivanov@mail.ru"),
                new User("Иван", "Петров", "Васильевич", 1980, "petrov@mail.ru"),
                new User("Василий", "Сидоров", "Петрович", 1901, "sidorov@mail.ru"),
                new User("Михаил", "Путин", "Ильич", 1977, "putin@mail.ru"),
                new User("Петр", "Медведев", "Иванович", 2001, "medvedev@mail.ru"),
                new User("Евгений", "Соколов", "Иванович", 1998, "sokolov@mail.ru"),
                new User("Илья", "Норкин", "Васильевич", 1964, "norkin@mail.ru"),
                new User("Роман", "Волков", "Петрович", 1962, "volkov@mail.ru"),
                new User("Михаил", "Кошечкин", "Иванович", 1977, "cat@mail.ru"),
                new User("Петр", "Собачкин", "Иванович", 1968, "dog@mail.ru")};

        for (int i = 0; i < users.length; i++) {
            if(2024 - users[i].yearOfBirth > 40) {
                users[i].info();
            }
        }

        Box box = new Box(100,200, 300, "Green");

        box.info();
        box.setColor("Red");
        box.info();
        box.open();
        box.put();
        box.get();
        box.close();

    }
}
