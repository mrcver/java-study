package 工厂模式.抽象工厂;

public class IPhone implements Phone {
    @Override
    public void call() {
        System.out.println("iphone calling");
    }

    @Override
    public void msn() {
        System.out.println("iphone msn");
    }
}
