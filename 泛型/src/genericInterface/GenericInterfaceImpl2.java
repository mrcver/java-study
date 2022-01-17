package genericInterface;

/**
 * 泛型接口实现
 * 实现泛型接口的泛型类
 *
 * @param <T>
 */
public class GenericInterfaceImpl2<T> implements GenericInterface<T> {
    @Override
    public T server(T t) {
        System.out.println("get <t>: " + t);
        return t;
    }
}
