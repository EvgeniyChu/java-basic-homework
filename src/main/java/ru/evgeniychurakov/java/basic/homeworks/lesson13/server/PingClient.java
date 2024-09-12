package ru.evgeniychurakov.java.basic.homeworks.lesson13.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class PingClient implements Runnable {
    private Socket socket;

    public PingClient(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
            out.println("Доступные операции: +, -, *, /");
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Получен запрос: " + inputLine);
                String result = calculate(inputLine);
                out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String calculate(String input) {
        String[] parts = input.split(" ");
        double num1 = Double.parseDouble(parts[0]);
        String operation = parts[1];
        double num2 = Double.parseDouble(parts[2]);

        switch (operation) {
            case "+":
                return String.valueOf(num1 + num2);
            case "-":
                return String.valueOf(num1 - num2);
            case "*":
                return String.valueOf(num1 * num2);
            case "/":
                if (num2 != 0) {
                    return String.valueOf(num1 / num2);
                } else {
                    return "Ошибка: деление на ноль.";
                }
            default:
                return "Неизвестная операция.";
        }
    }
}