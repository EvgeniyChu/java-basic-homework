package ru.evgeniychurakov.java.basic.homeworks.lesson13.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8888);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

            String response;
            System.out.println("Доступны математические вычисления: +,-,*,/");
            System.out.println("Введите первое число:");
            String firstInput = userInput.readLine();
            double num1 = Double.parseDouble(firstInput);

            System.out.println("Введите второе число:");
            String secondInput = userInput.readLine();
            double num2 = Double.parseDouble(secondInput);

            System.out.println("Введите знак операции (+, -, *, /):");
            String operation = userInput.readLine();

            String request = num1 + " " + operation + " " + num2;
            out.println(request);

            response = in.readLine();
            System.out.println("Результат: " + response);

        } catch (IOException | NumberFormatException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
