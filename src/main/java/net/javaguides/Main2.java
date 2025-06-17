package net.javaguides;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main2 {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Future<?> future = executorService.submit(() -> System.out.println("Hello")); // runnable parameter
//        future.get();
//        executorService.shutdown();
//        Future<String> submit = executorService.submit(() -> System.out.println("Hello"), "success");
        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        Future<Integer> submit = executorService.submit(() -> 1 + 2);
//        Integer i = submit.get();
//        System.out.println("sum is " + i);

        Callable<Integer> callable1 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 1");
            return 1;
        };
        Callable<Integer> callable2 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 2");
            return 2;
        };
        Callable<Integer> callable3 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 3");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);

        List<Future<Integer>> futures = null;
        try {
            futures = executorService.invokeAll(list, 1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {

        }

        for (Future<Integer> f : futures){
            try {
                System.out.println(f.get());
            } catch (CancellationException e) {

            } catch (InterruptedException e) {
            } catch (ExecutionException e) {
            }
        }

        executorService.shutdown();
        System.out.println("Hello World");
//        System.out.println(executorService.isShutdown());
//        Thread.sleep(1);
//        System.out.println(executorService.isTerminated());
    }
}
