package single;

/**
 * 懒汉模式
 */
public class People {
    static People p;

    private People() {
    }

    public static People getPeople() {
        if (p == null) {
            p = new People();
        }
        return p;
    }
}