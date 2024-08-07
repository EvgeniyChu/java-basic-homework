package ru.evgeniychurakov.java.basic.homeworks.lesson6;

public class Cat {
    private String name;
    private int appetite;

    public boolean fullness=false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate){
        if(plate.isFoodHere(this.appetite)){
            fullness=true;
        }

    }

    public void info(){
        System.out.println("Кот " + this.name + " Насыщен ли:" + fullness);
    }
}
