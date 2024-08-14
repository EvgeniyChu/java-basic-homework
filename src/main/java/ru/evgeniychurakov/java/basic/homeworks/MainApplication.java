package ru.evgeniychurakov.java.basic.homeworks;


import ru.evgeniychurakov.java.basic.homeworks.lesson8.AppArrayDataException;
import ru.evgeniychurakov.java.basic.homeworks.lesson8.AppArraySizeException;


import static ru.evgeniychurakov.java.basic.homeworks.lesson8.Application.sumArrayElements;

public class MainApplication {
    public static void main(String[] args) {
        String[][] arr1 = {{"1","2","ТРИ","4"},{"1","2","3","4"},{"4","5","10","11"},{"4","15","16","17"}};
        String[][] arr2 = {{"1","2","3","4","5"},{"1","2","3","4"},{"4","5","10","11"},{"4","15","16","17"}};
        String[][] arr3 = {{"1","2","3","4"},{"1","2","3","4"},{"4","5","10","11"},{"4","15","16","17"}};
        try{
            System.out.println(sumArrayElements(arr1));
        } catch (AppArrayDataException e) {
            System.out.println(e.getMessage() + e.getNumber());
        } catch (AppArraySizeException e) {
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(sumArrayElements(arr2));
        } catch (AppArrayDataException e) {
            System.out.println(e.getMessage() + e.getNumber());
        } catch (AppArraySizeException e) {
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(sumArrayElements(arr3));
        } catch (AppArrayDataException e) {
            System.out.println(e.getMessage() + e.getNumber());
        } catch (AppArraySizeException e) {
            System.out.println(e.getMessage());
        }


    }
}
