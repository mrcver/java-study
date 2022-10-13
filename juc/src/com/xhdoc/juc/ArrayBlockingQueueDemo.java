package com.xhdoc.juc;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println("===========超出报错===========");
        blockingQueue.add("A");
        blockingQueue.add("B");
        blockingQueue.add("C");
        try {
            //Queue full
            blockingQueue.add("D");
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.element());
        System.out.println(blockingQueue.remove());

        System.out.println("===========超出返回false===========");
        blockingQueue.offer("A");
        blockingQueue.offer("B");
        blockingQueue.offer("C");
        System.out.println(blockingQueue.offer("D"));
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.peek());
        System.out.println(blockingQueue.poll());

        System.out.println("===========阻塞===========");
        blockingQueue.put("A");
        blockingQueue.put("B");
        blockingQueue.put("C");
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        //取不到元素就一直阻塞程序不回退出
        System.out.println(blockingQueue.take());
    }
}
