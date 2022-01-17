package 工厂模式.抽象工厂;

public class MiFactory implements PhoneFactory {
    @Override
    public Phone getPhone() {
        return new MiPhone();
    }
}
