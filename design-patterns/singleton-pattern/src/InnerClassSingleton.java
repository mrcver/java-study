public class InnerClassSingleton {
    public static String name = "innerClassSingleton";

    static {
        System.out.println("inner singleton init.");
    }

    private InnerClassSingleton() {
    }

    private static class InnerSingletonHolder {
        static {
            System.out.println("inner singleton holder init.");
        }

        public static InnerClassSingleton singleton = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return InnerSingletonHolder.singleton;
    }

    public static void main(String[] args) {
        System.out.println(InnerClassSingleton.name);
        System.out.println(InnerClassSingleton.getInstance());
    }
}
