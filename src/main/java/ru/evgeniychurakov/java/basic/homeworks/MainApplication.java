package ru.evgeniychurakov.java.basic.homeworks;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File root = new File(".");
        File[] files = root.listFiles();
        List<File> textFiles = new ArrayList<File>();
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    textFiles.add(file);
                }
            }
        }
        System.out.println(textFiles);
        System.out.println(textFiles.get(0).getName());
        System.out.println("Выберите файл :");
        String file = sc.nextLine();
        for (File f : textFiles){
            if (f.getName().equals(file)) {
                try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(f))) {
                    int n = in.read();
                    while (n != -1) {
                        System.out.print((char)n);
                        n = in.read();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Введите строку :");
                String line = sc.nextLine();
                try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(f))) {
                    byte[] buffer = line.getBytes(StandardCharsets.UTF_8);
                    for (int i = 0; i < buffer.length; i++) {
                        out.write(buffer[i]);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }

        }
    }
}
