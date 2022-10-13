package com.xhdoc.juc;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                try {
                    //排队抢锁
                    semaphore.acquire();
                    System.out.println("thread: " + Thread.currentThread().getName() + " get the place");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    //释放锁
                    semaphore.release();
                }

            }, String.valueOf(i)).start();
        }
    }
}
