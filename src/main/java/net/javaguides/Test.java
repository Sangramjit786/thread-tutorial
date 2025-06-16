package net.javaguides;

public class Test {
    public static void main(String[] args) {
//        World world = new World();
//        world.start();
//        Thread t1 = new Thread(world);
//        t1.start();
//        World t1 = new World(); //NEW
//        t1.start(); //RUNNABLE
//
//        System.out.println(Thread.currentThread().getName());
//
//        for(; ; ){
//            System.out.println("Hello");
//        }
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (Exception e) {

        }

        System.out.println(counter.getCount());
    }
}
