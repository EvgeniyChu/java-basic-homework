package ru.evgeniychurakov.java.basic.homeworks.lesson4;

public class User {
    public String name;
    public String surname;
    public String fatherName;
    public int yearOfBirth;
    public String email;

    public User(String name, String surname, String fatherName, int yearOfBirth, String email){
        this.name=name;
        this.surname=surname;
        this.fatherName=fatherName;
        this.yearOfBirth=yearOfBirth;
        this.email=email;
    }

    public void info(){
        System.out.println("ФИО: " + this.surname +" "+ this.name +" " + this.fatherName);
        System.out.println("Год рождения: " + this.yearOfBirth);
        System.out.println("email: "+ this.email);
    }
}
