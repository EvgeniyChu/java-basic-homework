package ru.evgeniychurakov.java.basic.homeworks.lesson5;

public class Dog extends Animal{
    public Dog(String name, int speed, int swimSpeed, int endurance) {
        super(name, speed, swimSpeed, endurance);
    }


    @Override
    public int swim(int distance) {
        if (distance>0){
            this.endurance=this.endurance-distance*2;
        }
        if(this.endurance<0){
            System.out.println(this.name + " устал");
            return -1;
        }
        System.out.println("Время заплыва "+this.name + ": " + distance / this.speed+ " c");
        return (distance / this.speed);

    }
}