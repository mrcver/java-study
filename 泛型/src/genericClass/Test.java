package genericClass;

public class Test {
    public static void main(String[] args) {
        /**
         * 使用泛型类创建对象
         */
        //字符串
        GenericClassDemo<String> t1 = new GenericClassDemo<String>();
        t1.t = "str";
        t1.show("hello");
        String t1t = t1.getT();
        System.out.println(t1t);

        //数字
        GenericClassDemo<Integer> t2 = new GenericClassDemo<Integer>();
        t2.t = 88;
        t2.show(22);
        Integer t2t = t2.getT();
        System.out.println(t2t);
    }
}
