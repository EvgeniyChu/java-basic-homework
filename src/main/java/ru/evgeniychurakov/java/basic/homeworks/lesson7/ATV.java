package ru.evgeniychurakov.java.basic.homeworks.lesson7;

public class ATV implements Movable{
    private int petrol;

    public ATV(int petrol) {
        this.petrol = petrol;
    }

    @Override
    public boolean move(Terrain terrain) {
        if(terrain.getName()=="Forest"){
            if (this.petrol != 0 && (this.petrol - terrain.getDistance()/100) >= 0) {
                System.out.println("Вездеход проехал по лесу " + terrain.getDistance());
                this.petrol -= terrain.getDistance()/100;
                return true;
            }
            System.out.println("Кончился бензин");
            return false;
        }
        if(terrain.getName()=="Field"){
            if (this.petrol != 0 && (this.petrol - terrain.getDistance()/50) >= 0) {
                System.out.println("Вездеход проехал по полю " + terrain.getDistance());
                this.petrol -= terrain.getDistance()/50;
                return true;
            }
            System.out.println("Кончился бензин");
            return false;
        }
        if(terrain.getName()=="Swamp"){
            if (this.petrol != 0 && (this.petrol - terrain.getDistance()/200) >= 0) {
                System.out.println("Вездеход проехал по болоту " + terrain.getDistance());
                this.petrol -= terrain.getDistance()/200;
                return true;
            }
            System.out.println("Кончился бензин");
            return false;
        }
        return false;
    }

}
