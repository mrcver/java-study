package genericClass;

/**
 * 泛类型demo
 * 语法：类名<T>
 * T 是类型占位符，表示一种可引用类型，如果编写多个用逗号隔开
 *
 * @param <T>
 */
public class GenericClassDemo<T> {
    T t;

    public void show(T t) {
        System.out.println(t);
    }

    public T getT() {
        return t;
    }
}