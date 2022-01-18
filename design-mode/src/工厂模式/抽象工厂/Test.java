package 工厂模式.抽象工厂;

//适合稳定不常更新
public class Test {
    public static void main(String[] args) {
        MiFactory miFactory = new MiFactory();
        Phone miPhone = miFactory.getPhone();
        miPhone.call();
        miPhone.msn();

        AppleFactory appleFactory = new AppleFactory();
        Phone appleFactoryPhone = appleFactory.getPhone();
        appleFactoryPhone.call();
        appleFactoryPhone.msn();
    }
}
