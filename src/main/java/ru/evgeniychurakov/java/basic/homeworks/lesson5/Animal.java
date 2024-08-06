package ru.evgeniychurakov.java.basic.homeworks.lesson5;

public abstract class Animal {
    String name;
    int runSpeed;

    int swimSpeed;

    int endurance;
    boolean isTired;
    int coef;


    public Animal(String name, int runSpeed, int swimSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
    }

    public Animal(String name, int runSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.endurance = endurance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
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
            if (this.endurance<distance){
                isTired=true;
                this.endurance=0;
                System.out.println(this.name + " устал");
                return -1;
            }
            this.endurance=this.endurance-distance;
        }
        if(isTired){
            System.out.println(this.name + " устал");
            return -1;
        }
        System.out.println("Время забега "+this.name + ": " + distance / this.runSpeed+ " c");
        return (distance / this.runSpeed);
    };

    public int swim(int distance){
        if (distance>0){
            if (this.endurance<distance*coef){
                isTired=true;
                System.out.println(this.name + " устал");
                this.endurance=0;
                return -1;
            }
            this.endurance=this.endurance-distance*coef;
        }
        if(isTired){
            System.out.println(this.name + " устал");
            return -1;
        }
        System.out.println("Время заплыва "+this.name + ": " + distance / this.swimSpeed+ " c");
        return (distance / this.swimSpeed);
    };
    public void info(){
        System.out.println(this.name + " Выносливость: " + this.endurance);
    }

}
