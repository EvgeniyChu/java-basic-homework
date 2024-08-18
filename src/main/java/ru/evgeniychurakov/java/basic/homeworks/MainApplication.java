package ru.evgeniychurakov.java.basic.homeworks;


import ru.evgeniychurakov.java.basic.homeworks.lesson9.Applcation;
import ru.evgeniychurakov.java.basic.homeworks.lesson9.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println(Applcation.list(1,5));

        List<Integer> list = new ArrayList<>(Arrays.asList(1,4,5,6,8,10,14,5));
        System.out.println(Applcation.sumElementsGreaterThan5(list));

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,4,5,6,8,10,14,5));
        Applcation.rewriteListByNumber(5,list1);
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,4,5,6,8,10,14,5));
        Applcation.addNumberToElements(5,list2);
        System.out.println(list2);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Michael", 20));
        employees.add(new Employee("George",40));
        employees.add(new Employee("Roman", 33));
        employees.add(new Employee("Joe",78));
        employees.add(new Employee("Donald",75));

        System.out.println(Applcation.getNamesOfEmployees(employees));

        System.out.println(Applcation.getEmployeesOlderThanAge(employees, 40));

        System.out.println(Applcation.isAverageAgeGreaterThanAge(employees,50));

        Applcation.youngestEmployee(employees);

    }
}
