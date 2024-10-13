package ru.evgeniychurakov.java.basic.homeworks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ABCPrinter {
    private static final Object lock = new Object();
    private static int count = 0;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable taskA = new PrintTask("A", 0);
        Runnable taskB = new PrintTask("B", 1);
        Runnable taskC = new PrintTask("C", 2);

        executor.submit(taskA);
        executor.submit(taskB);
        executor.submit(taskC);

        executor.shutdown();
    }

    static class PrintTask implements Runnable {
        private final String symbol;
        private final int order;

        PrintTask(String symbol, int order) {
            this.symbol = symbol;
            this.order = order;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized (lock) {
                    try {
                        while (count % 3 != order) {
                            lock.wait();
                        }
                        System.out.print(symbol);
                        count++;
                        lock.notifyAll();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }
}