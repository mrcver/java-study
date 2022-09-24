public class HungrySingleton {
    public static String name = "hungrySingleton";

    static {
        System.out.println("hungry singleton init.");
    }

    // 类加载时初始化，线程安全
    private  static HungrySingleton singleton = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        System.out.println(HungrySingleton.name);
        System.out.println(HungrySingleton.getInstance());
        System.out.println(HungrySingleton.getInstance());
        System.out.println(HungrySingleton.getInstance());
    }
}
