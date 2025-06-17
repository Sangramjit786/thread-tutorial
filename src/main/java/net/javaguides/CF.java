package net.javaguides;

import java.util.concurrent.*;

public class CF {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Executor executor = Executors.newFixedThreadPool(3);
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            try{
                Thread.sleep(5000);
                System.out.println("Worker");
            } catch (Exception e) {

            }
            return "ok";
//        }).thenApply(x -> x + x);
        }).orTimeout(1, TimeUnit.SECONDS).exceptionally(s -> "Timeout occurred");
        System.out.println(f1.get());
       /* try {
//            CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            String f1 = CompletableFuture.supplyAsync(() -> {
                try{
                    Thread.sleep(5000);
                    System.out.println("Worker");
                } catch (Exception e) {

                }
                return "ok";
            }).get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main");*/

        /*CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
            try{
                Thread.sleep(5000);
                System.out.println("Worker");
            } catch (Exception e) {

            }
            return "ok";
        });

        CompletableFuture<Void> f = CompletableFuture.allOf(f1, f2);
        f.join();
        System.out.println("Main");*/

//        String s = null;
//        try {
//            s = completableFuture.get();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//        s = completableFuture.getNow("nooo");
//        System.out.println(s);
//        System.out.println("Main");
    }
}
