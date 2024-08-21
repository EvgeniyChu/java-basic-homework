package ru.evgeniychurakov.java.basic.homeworks.lesson10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<Long>> map ;

    public PhoneBook() {
        this.map = new HashMap<>();
    }

    public void add(String name, List<Long> list){
        map.put(name,list);
    }

    public void find(String name){
        List<Long> numbers = map.get(name);
        if(numbers != null){
            System.out.println(numbers);
        } else {
            System.out.println("Нет номера в справочнике " + name);
        }
    }

    public boolean containsPhone(long number) {
        for (List<Long> numbers : map.values()) {
            if (numbers.contains(number)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "PhoneBook{" +
                "map=" + map +
                '}';
    }
}
