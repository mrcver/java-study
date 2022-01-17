package thread.runnable;

/**
 * 实现Runnable方式
 */
class RunnableImpl implements Runnable {
    protected String name;

    //配置线程名字
    public RunnableImpl(String name) {
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
