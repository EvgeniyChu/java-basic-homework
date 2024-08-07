package ru.evgeniychurakov.java.basic.homeworks.lesson6;

public class Plate {
    private int maxFoodAmount;
    private int currentFoodAmount;

    public Plate(int maxFoodAmount) {
        this.maxFoodAmount = maxFoodAmount;
        this.currentFoodAmount=maxFoodAmount;
    }
    public void addFood(int food){
        if(food+this.currentFoodAmount>this.maxFoodAmount){
            this.currentFoodAmount=this.maxFoodAmount;
        } else {
            this.currentFoodAmount += food;
        }
    }
    public boolean isFoodHere(int food){
        if(this.currentFoodAmount-food>=0){
            this.currentFoodAmount -= food;
            return true;
        } else return false;

    }
    public void info(){
        System.out.println("Осталось еды: " + this.currentFoodAmount);
    }
}
