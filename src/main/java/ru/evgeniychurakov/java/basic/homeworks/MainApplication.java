package ru.evgeniychurakov.java.basic.homeworks;


import java.util.Scanner;

import static ru.evgeniychurakov.java.basic.homeworks.lesson1.Application.*;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите число от 1 до 5");
        int numberOfUser = scanner.nextInt();
        while(numberOfUser>=1 || numberOfUser <=5){
            int randomNum1 = (int) (Math.random()*10)+1;
            int randomNum2 = (int) (Math.random()*20)+10;
            int randomNum3 = (int) (Math.random()*30)+15;
            if (numberOfUser ==1){
                greetings();
                break;
            } else if (numberOfUser == 2) {
                checkSign(randomNum1,randomNum2,randomNum3);
                break;
            } else if (numberOfUser == 3) {
                selectColor();
                break;
            } else if (numberOfUser == 4) {
                compareNumbers();
                break;
            } else if (numberOfUser == 5) {
                addOrSubtractAndPrint(randomNum1,randomNum2, true);
                break;
            } else {
                System.out.println("Ввели неверное число");
                numberOfUser = scanner.nextInt();
            }
        }
//        greetings();
//        checkSign(1,2,-3);
//        selectColor();
//        compareNumbers();
//        addOrSubtractAndPrint(1,2,true);
    }
}
