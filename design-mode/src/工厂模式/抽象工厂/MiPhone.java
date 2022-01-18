package 工厂模式.抽象工厂;

public class MiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("mi calling");
    }

    @Override
    public void msn() {
        System.out.println("mi msn");
    }
}
