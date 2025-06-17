package net.javaguides;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main3 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(
                () -> System.out.println("Task executed after every 5 seconds delay !"),
                5,
                5,
                TimeUnit.SECONDS
        );
        scheduler.shutdown();
    }
}
