package ru.evgeniychurakov.java.basic.homeworks;


import ru.evgeniychurakov.java.basic.homeworks.lesson10.PhoneBook;

import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();

        pb.add("Igor", List.of(880055535555L));
        pb.add("Eugene", List.of(88001234567L));
        pb.add("Roman", List.of(89017005050L));
        pb.add("Alex", List.of(88001110000L, 88008888888L));

        System.out.println(pb);
        pb.find("Alex");
        pb.find("Alex1");
        System.out.println(pb.containsPhone(89017005050L));
        System.out.println(pb.containsPhone(88001110010L));

    }
}
