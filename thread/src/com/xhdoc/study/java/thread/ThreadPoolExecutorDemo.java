package com.xhdoc.study.java.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                5,//默认启动线程数
                20,//最大线程数
                10L,//线程活跃时间
                TimeUnit.SECONDS,//单位
                new ArrayBlockingQueue<>(79),//排队容量
//                new ThreadPoolExecutor.AbortPolicy()//默认拒绝策略，丢弃任务并抛出RejectedExecutionException异常
                new ThreadPoolExecutor.CallerRunsPolicy()//由创建了线程池的线程来执行被拒绝的任务
//                new ThreadPoolExecutor.DiscardOldestPolicy()//丢弃任务队列最先加入的任务，再执行execute方法把新任务加入队列执行
//                new ThreadPoolExecutor.DiscardPolicy()//直接丢弃任务，但不抛出异常
        );
        System.out.println("main thread id: " + Thread.currentThread().getId());
        try {
            //会有一个任务由主线程执行
            for (int i = 0; i < 100; i++) {
                Runnable work = new RunnableImpl();
                threadPoolExecutor.execute(work);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            threadPoolExecutor.shutdown();
            while (!threadPoolExecutor.isTerminated()) {
            }
            System.out.println("all finished!");
        }

    }

    static class RunnableImpl implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("runnable implement:" + Thread.currentThread().getId());
        }
    }
}
