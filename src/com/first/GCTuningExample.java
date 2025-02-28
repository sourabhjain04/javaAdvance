package com.first;
import java.util.ArrayList;
import java.util.List;

public class GCTuningExample {
    public static void main(String[] args) {
        List<String> garbageList = new ArrayList<>();

        for (int i = 0; i < 1_000_000; i++) {
            garbageList.add("Garbage " + i); // Creates unnecessary objects
            if (i % 100_000 == 0) {
                System.out.println("Created " + i + " objects");
            }
        }

        // Explicitly triggering garbage collection (not guaranteed)
        System.gc();
        System.out.println("GC Requested");

        // Keeping the program running to analyze GC logs
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
