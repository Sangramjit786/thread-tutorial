package net.javaguides;

public class LambdaExpression {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        };
//        Runnable runnable = () -> System.out.println("Hello");
        Thread t1 = new Thread(() -> System.out.println("Hello"));
        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 10; i++) {
                System.out.println("Hello World");
            }
        });
        t1.start();
        t2.start();
    }
}
