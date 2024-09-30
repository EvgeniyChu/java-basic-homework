package ru.evgeniychurakov.java.basic.homeworks.lesson11;

import java.util.HashMap;
import java.util.Map;

public class PersonDataBase {
    private Map<Long, Person> personMap;

    public PersonDataBase() {
        personMap = new HashMap<>();
    }

    public Person findById(Long id) {
        return personMap.get(id);
    }

    public void add(Person person) {
        personMap.put(person.id, person);
    }

    public boolean isManager(Person person) {
        Position position = person.position;
        return position == Position.MANAGER ||
                position == Position.DIRECTOR ||
                position == Position.BRANCH_DIRECTOR ||
                position == Position.SENIOR_MANAGER;
    }

    public boolean isEmployee(Long id) {
        Person person = findById(id);
        if (person != null) {
            Position position = person.position;
            return position != Position.MANAGER &&
                    position != Position.DIRECTOR &&
                    position != Position.BRANCH_DIRECTOR &&
                    position != Position.SENIOR_MANAGER;
        }
        return false;
    }

    @Override
    public String toString() {
        return "PersonDataBase{" +
                "personMap=" + personMap +
                '}';
    }
}