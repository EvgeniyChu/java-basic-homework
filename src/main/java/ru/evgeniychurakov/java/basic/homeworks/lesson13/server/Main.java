package ru.evgeniychurakov.java.basic.homeworks.lesson13.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            System.out.println("Сервер запущен");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Клиент подключен: " + socket.getInetAddress());
                new PingClient(socket).run();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}