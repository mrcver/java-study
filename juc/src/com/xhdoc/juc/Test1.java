package com.xhdoc.juc;

//并发同步
public class Test1 {
    public static void main(String[] args) {
        //线程数
        System.out.println(Runtime.getRuntime().availableProcessors());
        //
        Ticket ticket = new Ticket();

        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                //同步对象
                synchronized (ticket) {

                    ticket.sale();
                }
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                synchronized (ticket) {

                    ticket.sale();
                }
            }
        }, "B").start();
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                synchronized (ticket) {

                    ticket.sale();
                }
            }
        }, "C").start();
    }
}


class Ticket {
    private int number = 20;

    //同步方法
//        public synchronized void sale() {
    public void sale() {
        if (number > 0) {
            System.out.println(Thread.currentThread().getName() + "卖了" + number + "张票");
            number--;
        } else {
            System.out.println("卖光了");
        }
    }

    public int getNumber() {
        return this.number;
    }

    public void calcNumber() {
        this.number--;
    }
}