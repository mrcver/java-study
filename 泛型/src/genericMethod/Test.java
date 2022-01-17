package genericMethod;

public class Test {
    public static void main(String[] args) {
        GenericMethod t1 = new GenericMethod();
        t1.show();
        Integer num = t1.show(123);
        System.out.println(num);
    }
}
