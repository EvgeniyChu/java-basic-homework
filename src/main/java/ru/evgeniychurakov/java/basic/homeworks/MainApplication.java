package ru.evgeniychurakov.java.basic.homeworks;


import ru.evgeniychurakov.java.basic.homeworks.lesson11.Person;
import ru.evgeniychurakov.java.basic.homeworks.lesson11.PersonDataBase;
import ru.evgeniychurakov.java.basic.homeworks.lesson11.Position;

public class MainApplication {
    public static void main(String[] args) {
        PersonDataBase personDB = new PersonDataBase();
        Person person1 = new Person("Alex", Position.DRIVER, 12345544400L);
        Person person2 = new Person("Michael", Position.BRANCH_DIRECTOR, 12345544412L);
        Person person3 = new Person("George", Position.DEVELOPER, 12345544423L);
        Person person4 = new Person("Joe", Position.DIRECTOR, 12345544488L);
        Person person5 = new Person("Donald", Position.JANITOR, 12345544499L);
        Person person6 = new Person("Vladimir", Position.PLUMBER, 12345544408L);
        personDB.add(person1);
        personDB.add(person2);
        personDB.add(person3);
        personDB.add(person4);
        personDB.add(person5);
        personDB.add(person6);
        System.out.println(personDB);
        System.out.println(personDB.findById(12345544423L));
        System.out.println(personDB.isEmployee(12345544423L));
        System.out.println(personDB.isManager(person1));

    }
}
