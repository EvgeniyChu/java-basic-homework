package ru.evgeniychurakov.java.basic.homeworks.lesson8;

public class AppArrayDataException extends Exception {
    private String number;
    public String getNumber(){return number;}
    public AppArrayDataException(String message, String num){

        super(message);
        number=num;
    }
}
