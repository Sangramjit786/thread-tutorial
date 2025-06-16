package net.javaguides;

public class MyThread extends Thread{

//    public MyThread(String name) {
//        super(name);
//    }

//    @Override
//    public void run() {
//        System.out.println("Thread is running....");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }

//        for (int i = 1; i <= 5; i++){
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(i);
//        }

//        for (int i = 0; i < 5; i++){
//            String a = "";
//            for (int j = 0; j < 10000; j++){
//                a += "a";
//            }
//            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
//            try{
//                Thread.sleep(10);
//            } catch(Exception e){
//
//            }
//        }
//        try{
//            Thread.sleep(1000);
//            System.out.println("Thread is running.....");
//        } catch (InterruptedException e) {
//            System.out.println("Thread interrupted: " + e);
//        }

//        for (int i = 0; i < 5; i++){
//            System.out.println(Thread.currentThread().getName() + " is running");
//            Thread.yield();
//        }
//        while (true){
//            System.out.println("Hello world !");
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        MyThread t1 = new MyThread();
//        System.out.println(t1.getState());
//        t1.start();
//        System.out.println(t1.getState());
//        Thread.sleep(100);
//        System.out.println(t1.getState());
//        t1.join();
//        System.out.println(t1.getState());
//        MyThread t1 = new MyThread();
//        t1.start();
//        t1.join();
//        System.out.println("Hello");

//        MyThread l = new MyThread("Low Priority Thread");
//        MyThread m = new MyThread("Medium Priority Thread");
//        MyThread h = new MyThread("High Priority Thread");
//        l.setPriority(Thread.MIN_PRIORITY);
//        m.setPriority(Thread.NORM_PRIORITY);
//        h.setPriority(Thread.MAX_PRIORITY);
//        l.start();
//        m.start();
//        h.start();
//        MyThread t1 = new MyThread("t1");
//        MyThread t2 = new MyThread("t2");
//        t1.start();
//        t2.start();
//        t1.interrupt();
//        MyThread myThread = new MyThread();
//        myThread.setDaemon(true);
//        MyThread t1 = new MyThread();
//        t1.start();
//        myThread.start();
//        System.out.println("Main Done");
//    }

    private Counter counter;

    public MyThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            counter.increment();
        }
    }
}

// start(), run(), sleep(), join(), setPriority(), Interrupt, yield, setDaemon

// DAEMON THREADS
