package net.javaguides;

public class Test {
    public static void main(String[] args) {
//        World world = new World();
//        world.start();
//        Thread t1 = new Thread(world);
//        t1.start();
        World t1 = new World(); //NEW
        t1.start(); //RUNNABLE

        System.out.println(Thread.currentThread().getName());

        for(; ; ){
            System.out.println("Hello");
        }
    }
}
