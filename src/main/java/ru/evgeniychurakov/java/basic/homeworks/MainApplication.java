package ru.evgeniychurakov.java.basic.homeworks;

import java.io.IOException;
import java.util.Scanner;

import static ru.evgeniychurakov.java.basic.homeworks.lesson16.Application.countElements;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        System.out.print("Введите искомую последовательность символов: ");
        String searchString = scanner.nextLine();

        try {
            int count = countElements(fileName, searchString);
            System.out.println("Количество вхождений: " + count);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}