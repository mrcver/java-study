package lock.dead;

/**
 * 死锁.死锁 参考文章
 * @link https://www.cnblogs.com/java1024/archive/2019/11/28/11950129.html
 */
public class DeadLock implements Runnable {
    private static Zhangsan zs = new Zhangsan();       // 实例化static型对象
    private static Lisi ls = new Lisi();       // 实例化static型对象
    private boolean flag = false;  // 声明标志位，判断那个先说话

    public void run() {  // 覆写run()方法
        if (flag) {
            synchronized (zs) {   // 同步张三
                zs.say();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (ls) {
                    zs.get();
                }
            }
        } else {
            synchronized (ls) {
                ls.say();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (zs) {
                    ls.get();
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadLock t1 = new DeadLock();      // 控制张三
        DeadLock t2 = new DeadLock();      // 控制李四
        t1.flag = true;
        t2.flag = false;
        Thread thA = new Thread(t1);
        Thread thB = new Thread(t2);
        thA.start();
        thB.start();
    }
}
