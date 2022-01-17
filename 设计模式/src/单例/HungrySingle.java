package 单例;

//饿汉式
public class HungrySingle {

//    private byte[] data1 = new byte[1024 * 1024];

    private HungrySingle() {

    }

    private final static HungrySingle HUNGRY_SINGLE = new HungrySingle();

    public static HungrySingle getInstance() {
        return HUNGRY_SINGLE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(HungrySingle.getInstance());
            }).start();
        }

    }
}
