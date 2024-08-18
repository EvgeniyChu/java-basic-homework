package ru.evgeniychurakov.java.basic.homeworks.lesson4;

public class Box {
    private final int width;
    private final int length;
    private final int height;
    private  String color;

    private boolean isOpen = false;

    private boolean isItemHere = false;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Box(int width, int length, int height, String color) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.color = color;
    }

    public void open(){
        this.isOpen = true;
        System.out.println("Открыли коробку");
    }
    public void put(){
        if(this.isOpen==true && this.isItemHere==false) {
            this.isItemHere = true;
            System.out.println("Положили в коробку");
        }
    }
    public void get(){
        if(this.isOpen==true && this.isItemHere==true) {
            this.isItemHere = false;
            System.out.println("Достали из коробки");
        }
    }
    public void close(){
        this.isOpen=false;
        System.out.println("Закрыли коробку");
    }



    public void info(){
        System.out.println("Ширина: "+ this.width+ "\nДлина: "+this.length+"\nВысота: "
                +this.height+"\nЦвет: "+ this.color);
    }

}
