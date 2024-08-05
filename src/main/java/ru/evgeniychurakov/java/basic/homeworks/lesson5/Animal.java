package ru.evgeniychurakov.java.basic.homeworks.lesson5;

public abstract class Animal {
    String name;
    int speed;

    int swimSpeed;

    int endurance;
    public int distance;


    public Animal(String name, int speed, int swimSpeed, int endurance) {
        this.name = name;
        this.speed = speed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
    }

    public Animal(String name, int speed, int endurance) {
        this.name = name;
        this.speed = speed;
        this.endurance = endurance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }
    public int run(int distance){
        if (distance>0){
            this.endurance=this.endurance-distance;
        }
        if(this.endurance<0){
            System.out.println(this.name + " устал");
            return -1;
        }
        System.out.println("Время забега "+this.name + ": " + distance / this.speed+ " c");
        return (distance / this.speed);
    };

    public abstract int swim(int distance);
    public void info(){
        System.out.println(this.name + " Выносливость: " + this.endurance);
    }

}
