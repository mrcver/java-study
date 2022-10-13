package com.xhdoc.juc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 手写自旋锁
 */
public class CASDemo {
    AtomicReference<Thread> atomicReference = new AtomicReference<>();

    public void lock() {
        Thread thread = Thread.currentThread();
        System.out.println("thread: " + Thread.currentThread().getName() + " come in");
        while (!atomicReference.compareAndSet(null, thread)) {
            System.out.println("wait the lock, sleep 1s");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void unLock() {
        Thread thread = Thread.currentThread();
        atomicReference.compareAndSet(thread, null);
        System.out.println("release my lock");
    }

    public static void main(String[] args) {
        // 自旋锁演示
        CASDemo casDemo = new CASDemo();
        new Thread(() -> {
            casDemo.lock();
            System.out.println("thread: " + Thread.currentThread().getName() + " get tht lock");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            casDemo.unLock();
        }, "X").start();

        new Thread(() -> {
            casDemo.lock();
            System.out.println("thread: " + Thread.currentThread().getName() + " get tht lock");
            casDemo.unLock();
        }, "Y").start();
    }
}
