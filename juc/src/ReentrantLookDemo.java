import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLookDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            Thread.sleep(1);
            System.out.printf("sleep 1s" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
