package thread.runnable;

/**
 * @author wataly.sh[wataly.sh@gmail.com]
 * @since 2021/12/28
 */
class RunnableImpl2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
