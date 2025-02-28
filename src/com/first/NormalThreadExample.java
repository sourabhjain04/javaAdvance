package com.first;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class NormalThreadExample {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(100); // Limited thread pool

        IntStream.range(0, 1_000_000).forEach(i -> 
            executor.submit(() -> {
                // Simulating a simple task
                Math.sqrt(i);
            })
        );

        executor.shutdown();
        while (!executor.isTerminated()) {}

        long end = System.currentTimeMillis();
        System.out.println("Normal Threads Execution Time: " + (end - start) + "ms");
    }
}
