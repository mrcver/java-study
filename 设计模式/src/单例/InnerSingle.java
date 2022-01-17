package 单例;

//静态内部类
public class InnerSingle {
    private InnerSingle() {

    }

    public static InnerSingle getInstance() {
        return InnerInstance.INNER_SINGLE;
    }

    public static class InnerInstance {
        private static final InnerSingle INNER_SINGLE = new InnerSingle();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(InnerSingle.getInstance());
            }).start();
        }
    }
}
