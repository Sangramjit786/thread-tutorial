package net.javaguides;

import java.util.concurrent.*;

public class FutureImplementaion {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Runnable runnable = () -> System.out.println("Hello");
//        Future<?> future = executorService.submit(runnable);
//        Future<?> future = executorService.submit(() -> System.out.println("Hello")); // runnable parameter
        Callable<String> callable = () -> "Hello";
        Future<?> future = executorService.submit(callable);
        System.out.println(future.get()); // blocking call ( null )
        if(future.isDone()){
            System.out.println("Task is done !");
        }
        executorService.shutdown();
    }
}
