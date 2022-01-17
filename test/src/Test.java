import java.util.Date;

class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("sleep..." + System.currentTimeMillis());

                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("sleep..." + System.currentTimeMillis());
                System.out.println("t1 test");
            }
        });
        t1.start();
        t1.join();
        System.out.println("test");

    }
}