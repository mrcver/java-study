public class LazySingleton {
    static {
        System.out.println("lazy singleton init.");
    }

    // volatile 防止指令重排问题
    private  volatile static LazySingleton singleton;

    public static LazySingleton getInstance() {
        if (null == singleton) {
            // 线程安全
            synchronized (LazySingleton.class) {
                if (null == singleton) {
                    singleton = new LazySingleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
    }
}
