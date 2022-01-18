package genericInterface;

public class Test {
    public static void main(String[] args) {
        GenericInterfaceImpl1 t1 = new GenericInterfaceImpl1();
        String server = t1.server("server use");
        System.out.println(server);

        //确定泛型数据类型
//        GenericInterface<Integer> t2 = new GenericInterfaceImpl2<Integer>();
        //1.5以后不用写类型
        GenericInterface<Integer> t2 = new GenericInterfaceImpl2<>();
        t2.server(100);
    }
}
