package genericMethod;

/**
 * 泛型方法
 */
public class GenericMethod {
    //无返回
    public <T> void show() {
        System.out.println("泛型方法");
    }

    //返回泛型
    public <T> T show(T t) {
        System.out.println("泛型方法" + t);
        return t;
    }
}
