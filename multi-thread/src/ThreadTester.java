/**
 * 继承Thread方式
 */
class ThreadExtend extends Thread {
    protected String name;

    //配置线程名字
    public ThreadExtend(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(this.name + ": hello " + i);
            System.out.println(Thread.currentThread().getName() + ": hello " + i);
        }
    }
}

public class ThreadTester {
    public static void main(String[] args) throws InterruptedException {
//        ThreadExtend t1 = new ThreadExtend("thread1");
//        ThreadExtend t2 = new ThreadExtend("thread2");
//
//        t1.start();
//        t2.start();
        threadJoin();
    }

    public static void threadJoin() throws InterruptedException {
        ThreadExtend t1 = new ThreadExtend("t1");
        ThreadExtend t = new ThreadExtend("t");
        t1.start();
        //t1 运行完成才到t
        t1.join();
        t.start();
    }
}
