package net.javaguides;

public class World extends Thread{
//public class World implements Runnable{
    @Override
    public void run() {
        for(; ; ){
            System.out.println("World");
        }
    }
}
