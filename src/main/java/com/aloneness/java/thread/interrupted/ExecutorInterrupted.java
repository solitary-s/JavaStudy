package com.aloneness.java.thread.interrupted;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorInterrupted {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.execute(() -> {
//            try {
//                Thread.sleep(9000);
//                System.out.println("Thread run");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        executorService.shutdownNow();
//        System.out.println("Main run");

        // 中断线程
        Future<?> future = executorService.submit(() -> {
            System.out.println("submit ...");
        });
        future.cancel(true);
        System.out.println("Main run");
    }
}
