package 工厂模式.抽象工厂;

public class AppleFactory implements PhoneFactory {
    @Override
    public Phone getPhone() {
        return new IPhone();
    }
}
