package com.xhdoc.juc;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch downLatchDemo = new CountDownLatch(5);
        for (int i = 1; i < 6; i++) {
            new Thread(() -> {
                System.out.println("thread: " + Thread.currentThread().getId() + " leave");
                downLatchDemo.countDown();
            }).start();
        }
        // 锁门逻辑，等人走完才能关
        downLatchDemo.await();
        System.out.println("main leave");
    }
}
