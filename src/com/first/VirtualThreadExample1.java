package com.first;
public class VirtualThreadExample1 {
    public static void main(String[] args) {
        // Create a VirtualThreadPerTask executor
        try (var executor = java.util.concurrent.Executors.newVirtualThreadPerTaskExecutor()) {

            // Launch 1 million virtual threads
            for (int i = 0; i < 1_000_000; i++) {
                final int taskId = i;
                executor.submit(() -> {
                    try {
                        // Simulate a task - in reality, this could be an I/O operation
                        Thread.sleep(1000);  // Simulates a delay
                        System.out.println("Thread ID: " + taskId + " executed.");
                    } catch (InterruptedException e) {
                        // Handle the InterruptedException
                        System.out.println("Thread ID: " + taskId + " was interrupted.");
                        Thread.currentThread().interrupt(); // Preserve interrupt status
                    }
                });
            }
        }
        // The executor is closed automatically, waiting for all tasks to finish
    }
}
