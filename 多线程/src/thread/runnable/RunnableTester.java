package thread.runnable;

class RunnableTester {
    public static void main(String[] args) {
        RunnableImpl run1 = new RunnableImpl("run1");
        RunnableImpl run2 = new RunnableImpl("run2");
        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);

        t1.start();
        t2.start();
        testThreadName();
    }

    //设置线程名的另一种方式
    public static void testThreadName() {
        RunnableImpl2 run = new RunnableImpl2();

        Thread thread = new Thread(run, "hello");
        thread.start();
    }
}