package ru.evgeniychurakov.java.basic.homeworks.lesson6;

public class Plate {
    private int maxFoodAmount;
    private int currentFoodAmount;

    public Plate(int maxFoodAmount) {
        this.maxFoodAmount = maxFoodAmount;
        this.currentFoodAmount = maxFoodAmount;
    }
    public void addFood(int food) {
        if (food > 0){
            if (food + this.currentFoodAmount > this.maxFoodAmount) {
                this.currentFoodAmount = this.maxFoodAmount;
            } else {
                this.currentFoodAmount += food;
            }
        }
    }
    public boolean decreaseFood(int food) {
        if (food > 0){
            if (this.currentFoodAmount - food >= 0){
                this.currentFoodAmount -= food;
                return true;
            }
        }
        return false;
    }
    public void info(){
        System.out.println("Осталось еды: " + this.currentFoodAmount);
    }
}
