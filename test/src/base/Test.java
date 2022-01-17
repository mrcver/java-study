package base;

/**
 * @author tim
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("this is the main function");
        System.out.println("args: " + args);

        Person a = new Person("a");
        Person b = new Person();
        b.setName("b");

        System.out.print(b.equals(a));
    }
}
