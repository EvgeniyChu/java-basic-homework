package ru.evgeniychurakov.java.basic.homeworks;

public class MainApplication {
    public static void main(String[] args) throws InterruptedException {
//        long m = System.currentTimeMillis();
//        Application.fillArray();
//        System.out.println((double) (System.currentTimeMillis() - m));
//
        long startTime = System.currentTimeMillis();

        double[] array = new double[100_000_000];
        int numThreads = 4;
        Thread[] threads = new Thread[numThreads];

        for (int t = 0; t < numThreads; t++) {
            final int threadIndex = t;
            threads[t] = new Thread(() -> {
                int start = threadIndex * (array.length / numThreads);
                int end = (threadIndex + 1) * (array.length / numThreads);
                for (int i = start; i < end; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            });
            threads[t].start();
        }

        for (int t = 0; t < numThreads; t++) {
            threads[t].join();
        }

        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime));
    }
}
