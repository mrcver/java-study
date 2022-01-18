import java.util.ArrayList;
import java.util.List;

public class Test {

    public static class A {

    }

    public static class B extends A {

    }

    public static class C extends A {

    }

    public static class D extends B {

    }

    public static List<A> getAList() {
        List<A> list = new ArrayList<>();
        list.add(new B());
        list.add(new C());
        list.add(new A());
        return list;
    }

    public static void main(String[] args) {
        //不能进行添加， 适用于读取
        List<? extends A> extentListA = getAList();
        for (Object a : extentListA) {
            System.out.println(a);
        }

        //可以进行添加，读取时都是object对象， 可以进行强制转化类型， 但是可能报错
        List<? super A> listA = new ArrayList<>();
        listA.add(new B());
        listA.add(new C());
        listA.add(new D());
        for (Object a : listA) {
            A toA = (A) a;
            System.out.println(toA);
            try {
                B toB = (B) a;
                System.out.println(toB);
            } catch (Exception ex) {
                System.err.println("转型失败:" + ex.getMessage());
                System.err.println(ex);
            }
        }
        System.out.println("success");
    }
}
