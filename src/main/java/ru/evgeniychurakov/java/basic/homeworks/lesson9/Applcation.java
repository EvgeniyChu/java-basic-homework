package ru.evgeniychurakov.java.basic.homeworks.lesson9;

import java.util.ArrayList;
import java.util.List;

public class Applcation {
    public static List<Integer> list (int min, int max){
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < max-min+1; i++) {
            ls.add(i,min+i);
        }
        return ls;
    }
    public static int sumElementsGreaterThan5(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5) {
                sum += list.get(i);
            }
        }
        return sum;
    }

    public static void rewriteListByNumber(int number, List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
    }

    public static void addNumberToElements(int number, List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)+number);
        }
    }
    public static List<String> getNamesOfEmployees(List<Employee> list){
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            ls.add(list.get(i).getName());
        }
        return ls;
    }

    public static List<Employee> getEmployeesOlderThanAge(List<Employee> list, int age){
        List<Employee> ls = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() >= age){
                ls.add(list.get(i));
            }
        }
        return ls;
    }
    public static boolean isAverageAgeGreaterThanAge(List<Employee> list, int age){
        int sumAge = 0;
        for (int i = 0; i < list.size(); i++) {
            sumAge += list.get(i).getAge();
        }
        if(age < (sumAge/list.size())){
            return true;
        }
        return false;
    }
    public static void youngestEmployee(List<Employee> list){
        int counter = 100000;
        for (int i = 0; i < list.size(); i++) {
            if (counter > list.get(i).getAge())
                counter = list.get(i).getAge();
        }
        for (int i = 0; i < list.size(); i++) {
            if (counter == list.get(i).getAge()){
                System.out.println(list.get(i));
            }
        }
    }
}
