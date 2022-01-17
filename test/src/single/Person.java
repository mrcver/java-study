package single;

/**
 * 饿汉式
 */
public class Person {
    static Person p = new Person();

    private Person() {

    }

    public static Person getPerson() {
        return p;
    }
}

