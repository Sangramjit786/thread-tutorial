package net.javaguides;

import java.util.concurrent.Callable;

public class RunnableTask implements Callable {

//    @Override
//    public void run() {
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

    @Override
    public Object call() throws Exception {
        Thread.sleep(100);
        return null;
    }
}
