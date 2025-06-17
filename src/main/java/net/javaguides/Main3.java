package net.javaguides;

import java.util.concurrent.*;

public class Main3 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(
                () -> System.out.println("Task executed after every 5 seconds delay !"),
                5,
                5,
                TimeUnit.SECONDS
        );
//        scheduler.shutdown();
        ScheduledFuture<?> scheduledFuture = scheduler.scheduleWithFixedDelay(() -> System.out.println("Task executed after every 5 seconds delay !"),
                5,
                5,
                TimeUnit.SECONDS);

        scheduler.schedule(() -> {
            System.out.println("Initiating shutdown...");
            scheduler.shutdown();
        },20, TimeUnit.SECONDS);

//        ExecutorService executorService = Executors.newCachedThreadPool();
    }
}
