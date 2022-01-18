package genericInterface;

/**
 * 泛型接口实现一
 * 在接口实现时确定使用类型
 */
public class GenericInterfaceImpl1 implements GenericInterface<String> {
    @Override
    public String server(String s) {
        System.out.println("====" + s);
        return s;
    }
}
