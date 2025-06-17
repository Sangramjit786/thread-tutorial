package net.javaguides;

import java.util.concurrent.*;

public class FutureImplementaion {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Runnable runnable = () -> System.out.println("Hello");
//        Future<?> future = executorService.submit(runnable);
//        Future<?> future = executorService.submit(() -> System.out.println("Hello")); // runnable parameter
//        Callable<String> callable = () -> "Hello";
//        Future<?> future = executorService.submit(callable);
       /* Future<?> future = executorService.submit(() -> System.out.println("Hello"));
        System.out.println(future.get()); // blocking call ( null )
        if(future.isDone()){
            System.out.println("Task is done !");
        }
        executorService.shutdown();*/

        Future<Integer> future = executorService.submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception occurred: " + e);
            }
            System.out.println("Hello");

            return 42;
        });

//        Integer i = null;
//        try {
//            i = future.get(1, TimeUnit.SECONDS);
//            System.out.println(future.isDone());
//            System.out.println(i);
//        } catch (InterruptedException | ExecutionException | TimeoutException e) {
//            System.out.println("Exceptiom occurred" + e);
//        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred: " + e);
        }
        future.cancel(false);
        System.out.println(future.isCancelled());
        System.out.println(future.isDone());
        executorService.shutdown();

    }
}
