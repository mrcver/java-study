package com.xhdoc.juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test2 {
    public static void main(String[] args) {
        Ticket2 ticket2 = new Ticket2();
        new Thread(() -> {
            ticket2.sale();
        }, "A").start();
        new Thread(() -> {
            ticket2.sale();
        }, "B").start();
    }
}

class Ticket2 {
    private int num = 20;

    Lock lock = new ReentrantLock();

    public void sale() {
//        lock.lock();
        try {
            boolean lockStatus = lock.tryLock();
            if (lockStatus) {
                System.out.println(Thread.currentThread().getName() + " lock successes. ");
            } else {
                System.out.println(Thread.currentThread().getName() + " lock failed");
            }
        } catch (Exception e) {

        } finally {
//            lock.unlock();
        }
    }
}
