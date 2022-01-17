package 单例;

//懒汉式
public class LazySingle {
    private LazySingle() {
        System.out.println(Thread.currentThread().getName());
    }

    //原子性
    private volatile static LazySingle lazySingle;

    public static LazySingle getInstance() {
        if (lazySingle == null) {
            //加锁
            synchronized (LazySingle.class) {
                if (lazySingle == null) {
                    /**
                     * 不是原子性操作，顺序可能重排
                     * 1. 分配空间
                     * 2. 执行构造方法
                     * 3. 把这个对象指向这个空间
                     */
                    lazySingle = new LazySingle();
                }
            }
        }
        return lazySingle;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
//                SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
//                simpleDateFormat.applyPattern("yyyy-MM-dd HH:mm:ss");
//                Date date = new Date();
//                System.out.println(simpleDateFormat.format(date));
                System.out.println(getInstance());
            }).start();
        }
    }
}
